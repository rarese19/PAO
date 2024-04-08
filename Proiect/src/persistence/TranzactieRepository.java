package persistence;

import model.*;
import oracle.jdbc.OraclePreparedStatement;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class TranzactieRepository implements GenericRepository<Tranzactie>{
    private static TranzactieRepository instante = null;

    private TranzactieRepository() { }

    public static TranzactieRepository getInstance() {
        if (instante == null) {
            instante = new TranzactieRepository();
        }
        return instante;
    }

    @Override
    public void add(Tranzactie entity) {
        String sql = """
                    INSERT INTO tranzactie VALUES(?, ?, ?, ?, ?, ?, ?)""";

        try {
            OraclePreparedStatement prepedStatement = (OraclePreparedStatement)
                    dbConnection.getConn().prepareStatement(sql);

            prepedStatement.setInt(1, entity.getTranzactie_id());
            prepedStatement.setInt(2, entity.getMagazin_id());
            prepedStatement.setInt(3, entity.getMagazin_id());
            prepedStatement.setString(4, entity.getMetoda_plata());
            prepedStatement.setDate(5, entity.getData());
            prepedStatement.setDate(6, entity.getData_returnare());
            prepedStatement.setString(7, entity.getStatus());

            prepedStatement.execute();
            audit.write(sql, entity, "Done successfully!");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Tranzactie get(int id) {
        String sql = """
                    SELECT * FROM tranzactie WHERE tranzactie_id = ?""";

        try {
            OraclePreparedStatement prepedStatement = (OraclePreparedStatement)
                    dbConnection.getConn().prepareStatement(sql);

            prepedStatement.setInt(1, id);

            ResultSet result = prepedStatement.executeQuery();
            result.next();

            audit.write(sql, null, "Done successfully!");
            return new Tranzactie(result.getInt(1), result.getInt(2),
                    result.getInt(3), result.getString(4), result.getString(7),
                    result.getDate(5), result.getDate(6));
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public ArrayList<Tranzactie> getByClient(int id) {
        String sql = """
                    SELECT * FROM tranzactie WHERE client_id = ?""";
        ArrayList<Tranzactie> tranzactii = new ArrayList<>();

        try {
            OraclePreparedStatement prepedStatement = (OraclePreparedStatement)
                    dbConnection.getConn().prepareStatement(sql);

            prepedStatement.setInt(1, id);

            ResultSet result = prepedStatement.executeQuery();
            while (result.next()) {
                tranzactii.add(new Tranzactie(result.getInt(1), result.getInt(2),
                        result.getInt(3), result.getString(4), result.getString(7),
                        result.getDate(5), result.getDate(6)));
            }
            return tranzactii;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public ArrayList<Tranzactie> getAll() {
        String sql = """
                    SELECT * FROM tranzactie""";

        try {
            OraclePreparedStatement prepedStatement = (OraclePreparedStatement)
                    dbConnection.getConn().prepareStatement(sql);

            ResultSet result = prepedStatement.executeQuery();
            ArrayList<Tranzactie> tranzactii = new ArrayList<>();

            while (result.next()) {
                tranzactii.add(new Tranzactie(result.getInt(1), result.getInt(2),
                        result.getInt(3), result.getString(4), result.getString(5),
                        result.getDate(6), result.getDate(7)));
            }
            audit.write(sql, null, "Done successfully!");
            return tranzactii;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void update(Tranzactie entity) {
        String sql = """
                    UPDATE tranzactie
                    SET magazin_id = ?, client_id = ?, metoda_plata = ?, status = ?, data = ?, data_returnare = ?
                    WHERE tranzactie_id = ?""";

        try {
            OraclePreparedStatement prepedStatement = (OraclePreparedStatement)
                    dbConnection.getConn().prepareStatement(sql);

            prepedStatement.setInt(1, entity.getMagazin_id());
            prepedStatement.setInt(2, entity.getClient_id());
            prepedStatement.setString(3, entity.getMetoda_plata());
            prepedStatement.setString(4, entity.getStatus());
            prepedStatement.setDate(5, entity.getData());
            prepedStatement.setDate(6, entity.getData_returnare());
            prepedStatement.setInt(7, entity.getTranzactie_id());

            prepedStatement.executeUpdate();
            audit.write(sql, entity, "Done successfully!");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void delete(Tranzactie entity) {
        String sql = """
                    DELETE FROM tranzactie WHERE tranzactie_id = ?""";

        try {
            OraclePreparedStatement prepedStatement = (OraclePreparedStatement)
                    dbConnection.getConn().prepareStatement(sql);

            prepedStatement.setInt(1, entity.getTranzactie_id());

            prepedStatement.execute();
            audit.write(sql, entity, "Done successfully!");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
