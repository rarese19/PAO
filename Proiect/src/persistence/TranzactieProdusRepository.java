package persistence;

import model.tabele_asociative.TranzactieProdus;

import java.util.ArrayList;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import oracle.jdbc.OraclePreparedStatement;

public class TranzactieProdusRepository implements GenericRepository<TranzactieProdus> {
    private static TranzactieProdusRepository instance = null;

    private TranzactieProdusRepository() {}

    public static TranzactieProdusRepository getInstance() {
        if (instance == null) {
            instance = new TranzactieProdusRepository();
        }
        return instance;
    }


    @Override
    public void add(TranzactieProdus entity) {
        String sql = """
                    INSERT INTO tranzactie_produs VALUES(COALESCE((select max(tranzactie_produs_id) + 1
                    from tranzactie_produs), 1), ?, ?, ?)\
                     """;

        try {
            OraclePreparedStatement prepedStatement = (OraclePreparedStatement)
                    dbConnection.getConn().prepareStatement(sql);

            prepedStatement.setInt(1, entity.getTranzactie_id());
            prepedStatement.setInt(2, entity.getProdus_id());
            prepedStatement.setInt(3, entity.getCantitate());

            prepedStatement.execute();
            audit.write("create", entity);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public TranzactieProdus get(int id) {
        String sql = """
                    SELECT * FROM tranzactie_produs WHERE tranzactie_produs_id = ?""";

        try {
            OraclePreparedStatement prepedStatement = (OraclePreparedStatement)
                    dbConnection.getConn().prepareStatement(sql);

            prepedStatement.setInt(1, id);

            ResultSet result = prepedStatement.executeQuery();
            result.next();

            return new TranzactieProdus(result.getInt(1), result.getInt(2), result.getInt(3), result.getInt(4));
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public ArrayList<TranzactieProdus> getAll() {
        String sql = """
                    SELECT * FROM tranzactie_produs""";

        try {
            OraclePreparedStatement prepedStatement = (OraclePreparedStatement)
                    dbConnection.getConn().prepareStatement(sql);

            ResultSet result = prepedStatement.executeQuery();
            ArrayList<TranzactieProdus> tranzactiiProduse = new ArrayList<>();

            while (result.next()) {
                tranzactiiProduse.add(new TranzactieProdus(result.getInt(1), result.getInt(2), result.getInt(3), result.getInt(4)));
            }

            return tranzactiiProduse;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void update(TranzactieProdus entity) {
        String sql = """
                    UPDATE tranzactie_produs
                    SET tranzactie_id = ?, produs_id = ?, cantitate = ?
                    WHERE tranzactie_produs_id = ?""";

        try {
            OraclePreparedStatement prepedStatement = (OraclePreparedStatement)
                    dbConnection.getConn().prepareStatement(sql);

            prepedStatement.setInt(1, entity.getTranzactie_id());
            prepedStatement.setInt(2, entity.getProdus_id());
            prepedStatement.setInt(3, entity.getCantitate());
            prepedStatement.setInt(4, entity.getTranzactie_produs_id());

            prepedStatement.execute();
            audit.write("update", entity);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void delete(TranzactieProdus entity) {
        String sql = """
                    DELETE FROM tranzactie_produs WHERE tranzactie_produs_id = ?""";

        try {
            OraclePreparedStatement prepedStatement = (OraclePreparedStatement)
                    dbConnection.getConn().prepareStatement(sql);

            prepedStatement.setInt(1, entity.getTranzactie_produs_id());

            prepedStatement.execute();
            audit.write("delete", entity);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
