package persistence;

import jdk.jfr.Percentage;
import model.*;
import oracle.jdbc.OraclePreparedStatement;
import service.DBConnection;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class StatiuneRepository implements GenericRepository<Statiune>{
    private static StatiuneRepository instance = null;
    private PartieRepository partieRepository;
    private MagazinRepository magazinRepository;

    public void setRepositories() {
        this.partieRepository = PartieRepository.getInstance();
        this.magazinRepository = MagazinRepository.getInstance();
    }

    private StatiuneRepository() {
    }

    public static StatiuneRepository getInstance() {
        if (instance == null) {
            instance = new StatiuneRepository();
        }
        return instance;
    }
    @Override
    public void add(Statiune entity) {
        String sql = """
                    INSERT INTO statiune (statiune_id, regiune, stat, nume) VALUES (?, ?, ?, ?)
                    """;
        try {
            OraclePreparedStatement prepedStatement = (OraclePreparedStatement)
                    DBConnection.getInstance().getConn().prepareStatement(sql);

            prepedStatement.setInt(1, entity.getStatiune_id());
            prepedStatement.setString(2, entity.getRegiune());
            prepedStatement.setString(3, entity.getStat());
            prepedStatement.setString(4, entity.getNume());

            prepedStatement.execute();

            audit.write("add", entity);
        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Statiune get(int id) {
        String sql = """
                    SELECT * FROM statiune WHERE statiune_id = ?
                    """;
        try {
            OraclePreparedStatement prepedStatement = (OraclePreparedStatement)
                    dbConnection.getConn().prepareStatement(sql);
            prepedStatement.setInt(1, id);

            ResultSet res = prepedStatement.executeQuery();
            if (res.next()) {
                Statiune statiune = new Statiune(
                        res.getInt(1),
                        res.getString(2),
                        res.getString(3),
                        res.getString(4)
                );

                Statiune toReturn = new Statiune(
                        res.getInt(1),
                        res.getString(2),
                        res.getString(3),
                        res.getString(4),
                        partieRepository.getPartiiByStatiune(statiune),
                        magazinRepository.getMagazineByStatiune(statiune)
                );
                audit.write("getByID", toReturn);
                return toReturn;
            }
            else {
                return null;
            }
        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public Statiune statiuneForMagazin(int id) {
        String sql = """
                SELECT * FROM statiune where statiune_id =?
                """;

        try {
            OraclePreparedStatement prepedStatement = (OraclePreparedStatement)
                    dbConnection.getConn().prepareStatement(sql);
            prepedStatement.setInt(1, id);

            ResultSet res = prepedStatement.executeQuery();
            if (res.next()) {
                Statiune statiune = new Statiune(
                        res.getInt(1),
                        res.getString(2),
                        res.getString(3),
                        res.getString(4)
                );
                audit.write("statiuneForMagazin", statiune);
                return statiune;
            }
            else {
                return null;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public Statiune statiuneForAngajati(int id) {
        String sql = """
                    SELECT * FROM statiune WHERE statiune_id = ?
                    """;

        try {
            OraclePreparedStatement prepedStatement = (OraclePreparedStatement)
                    dbConnection.getConn().prepareStatement(sql);
            prepedStatement.setInt(1, id);

            ResultSet res = prepedStatement.executeQuery();
            if (res.next()) {
                Statiune statiune = new Statiune(
                        res.getInt(1),
                        res.getString(2),
                        res.getString(3),
                        res.getString(4)
                );
                audit.write("statiuneForAngajat", statiune);
                return statiune;
            }
            else {
                return null;
            }
        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public ArrayList<Statiune> getAll() {
        String sql = """
                    SELECT * FROM statiune
                    """;
        try {
            OraclePreparedStatement prepedStatement = (OraclePreparedStatement)
                    dbConnection.getConn().prepareStatement(sql);
            ResultSet res = prepedStatement.executeQuery();
            ArrayList<Statiune> statiuni = new ArrayList<>();

            while (res.next()) {
                Statiune statiune = new Statiune(
                        res.getInt(1),
                        res.getString(2),
                        res.getString(3),
                        res.getString(4)
                );
                Statiune toAdd = new Statiune(
                        res.getInt(1),
                        res.getString(2),
                        res.getString(3),
                        res.getString(4),
                        partieRepository.getPartiiByStatiune(statiune),
                        magazinRepository.getMagazineByStatiune(statiune)
                );
                statiuni.add(toAdd);
            }
            audit.write("getAll", Statiune.class);
            return statiuni;
        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void update(Statiune entity) {
        String sql = """
                    UPDATE statiune SET regiune = ?, stat = ?, nume = ? WHERE statiune_id = ?
                    """;
        try {
            OraclePreparedStatement prepedStatement = (OraclePreparedStatement)
                    dbConnection.getConn().prepareStatement(sql);

            prepedStatement.setString(1, entity.getRegiune());
            prepedStatement.setString(2, entity.getStat());
            prepedStatement.setString(3, entity.getNume());
            prepedStatement.setInt(4, entity.getStatiune_id());

            prepedStatement.executeUpdate();
            audit.write("update", entity);
        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void delete(Statiune entity) {
        String sql = """
                    DELETE FROM statiune WHERE statiune_id = ?
                    """;
        try {
            OraclePreparedStatement prepedStatement = (OraclePreparedStatement)
                    dbConnection.getConn().prepareStatement(sql);

            prepedStatement.setInt(1, entity.getStatiune_id());

            prepedStatement.executeUpdate();
            audit.write("delete", entity);
        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
