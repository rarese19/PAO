package persistence;

import model.*;
import oracle.jdbc.OraclePreparedStatement;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class PartieRepository implements GenericRepository<Partie>{
    private static PartieRepository instance = null;
    private StatiuneRepository statiuneRepository;

    public void setRepositories() {
        statiuneRepository = StatiuneRepository.getInstance();
    }
    private PartieRepository() {}

    public static PartieRepository getInstance() {
        if (instance == null) {
            instance = new PartieRepository();
        }
        return instance;
    }
    @Override
    public void add(Partie entity) {
        String sql = """
                    INSERT INTO partie VALUES(?, ?, ?, ?, ?, ?)
                     """;

        try {
            OraclePreparedStatement prepedStatement = (OraclePreparedStatement)
                    dbConnection.getConn().prepareStatement(sql);

            prepedStatement.setInt(1, entity.getPartie_id());
            prepedStatement.setInt(2, entity.getStatiune_id());
            prepedStatement.setString(3, entity.getNume());
            prepedStatement.setInt(4, entity.getInaltime());
            prepedStatement.setInt(5, entity.getLungime());
            prepedStatement.setString(6, entity.getGrad_dificultate());

            prepedStatement.execute();
            audit.write(sql, "Done successfully!");
        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Partie get(int id) {
        String sql = """
                    SELECT * FROM partie WHERE partie_id = ?""";
        try {
            OraclePreparedStatement prepedStatement = (OraclePreparedStatement)
                    dbConnection.getConn().prepareStatement(sql);

            prepedStatement.setInt(1, id);

            ResultSet res = prepedStatement.executeQuery();
            if (res.next()) {
                Partie partie = new Partie(
                        res.getInt(1),
                        res.getInt(2),
                        statiuneRepository.get(res.getInt(2)),
                        res.getString(3),
                        res.getInt(4),
                        res.getInt(5),
                        res.getString(6)
                );
                audit.write(sql, "Done successfully!");
                return partie;
            }
            return null;
        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public ArrayList<Partie> getAll() {
        String sql = """
                    SELECT * FROM partie""";
        try {
            Statement statement = dbConnection.getConn().createStatement();
            ResultSet res = statement.executeQuery(sql);
            ArrayList<Partie> partii = new ArrayList<>();
            while (res.next()) {
                Partie partie = new Partie(
                        res.getInt(1),
                        res.getInt(2),
                        statiuneRepository.get(res.getInt(2)),
                        res.getString(3),
                        res.getInt(4),
                        res.getInt(5),
                        res.getString(6)
                );
                partii.add(partie);
            }
            audit.write(sql, "Done successfully!");
            return partii;
        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void update(Partie entity) {
        String sql = """
                    UPDATE partie
                    SET statiune_id = ?,
                        nume = ?,
                        inaltime = ?,
                        lungime = ?,
                        grad_dificultate = ?
                    WHERE partie_id = ?""";

        try {
            OraclePreparedStatement prepedStatement = (OraclePreparedStatement)
                    dbConnection.getConn().prepareStatement(sql);

            prepedStatement.setInt(1, entity.getStatiune_id());
            prepedStatement.setString(2, entity.getNume());
            prepedStatement.setInt(3, entity.getInaltime());
            prepedStatement.setInt(4, entity.getLungime());
            prepedStatement.setString(5, entity.getGrad_dificultate());
            prepedStatement.setInt(6, entity.getPartie_id());

            prepedStatement.executeUpdate();
            audit.write(sql, "Done successfully!");
        }
        catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void delete(Partie entity) {
        String sql = """
                    DELETE FROM partie WHERE partie_id = ?""";

        try {
            OraclePreparedStatement prepedStatement = (OraclePreparedStatement)
                    dbConnection.getConn().prepareStatement(sql);

            prepedStatement.setInt(1, entity.getPartie_id());

            prepedStatement.executeUpdate();
            audit.write(sql, "Done successfully!");
        }
        catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public ArrayList<Partie> getPartiiByStatiune(Statiune statiune) {
        String sql = "SELECT * FROM partie WHERE statiune_id = ?";

        try {
            OraclePreparedStatement prepedStatement = (OraclePreparedStatement)
                    dbConnection.getConn().prepareStatement(sql);

            prepedStatement.setInt(1, statiune.getStatiune_id());

            ResultSet res = prepedStatement.executeQuery();
            ArrayList<Partie> partii = new ArrayList<>();
            while (res.next()) {
                Partie partie = new Partie(
                        res.getInt(1),
                        res.getInt(2),
                        res.getString(3),
                        res.getInt(4),
                        res.getInt(5),
                        res.getString(6)
                );
                partii.add(partie);
            }
            audit.write(sql, "Done successfully!");
            return partii;
        }
        catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
