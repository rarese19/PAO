package persistence;

import model.*;
import oracle.jdbc.OraclePreparedStatement;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class AngajatRepository implements GenericRepository<Angajat>{
    private static AngajatRepository instance = null;

    private MagazinRepository magazinRepository;

    public void setRepositories() {
        magazinRepository = MagazinRepository.getInstance();
    }
    private AngajatRepository() {}

    public static AngajatRepository getInstance() {
        if (instance == null) {
            instance = new AngajatRepository();
        }
        return instance;
    }

    @Override
    public void add(Angajat entity) {
        String sql = """
                    INSERT INTO angajat VALUES(?, ?, ?, ?, ?, ?, ?)\
                     """;

        try {
            OraclePreparedStatement prepedStatement = (OraclePreparedStatement)
                    dbConnection.getConn().prepareStatement(sql);

            prepedStatement.setInt(1, entity.getAngajat_id());
            prepedStatement.setInt(2, entity.getMagazin_id());
            prepedStatement.setString(3, entity.getNume());
            prepedStatement.setString(4, entity.getPrenume());
            prepedStatement.setLong(5, entity.getCnp());
            prepedStatement.setLong(6, entity.getSalariu());
            prepedStatement.setString(7, entity.getNumar_telefon());

            prepedStatement.execute();
            audit.write(sql, entity, "Done successfully!");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public Angajat get(int id) {
        String sql = """
                    SELECT * FROM angajat WHERE angajat_id = ?""";

        try {
            OraclePreparedStatement prepedStatement = (OraclePreparedStatement)
                    dbConnection.getConn().prepareStatement(sql);

            prepedStatement.setInt(1, id);

            ResultSet res = prepedStatement.executeQuery();
            if (res.next()) {
                Angajat angajat = new Angajat(
                        res.getInt(1),
                        res.getInt(2),
                        magazinRepository.getMagazinForAngajat(res.getInt(2)),
                        res.getString(3),
                        res.getString(4),
                        res.getLong(5),
                        res.getLong(6),
                        res.getString(7)
                );
                return angajat;
            }
            return null;
        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public ArrayList<Angajat> getAll() {
        String sql = """
                    SELECT * FROM angajat""";

        try {
            OraclePreparedStatement prepedStatement = (OraclePreparedStatement)
                    dbConnection.getConn().prepareStatement(sql);

            ResultSet res = prepedStatement.executeQuery();
            ArrayList<Angajat> angajati = new ArrayList<>();
            while (res.next()) {
                Angajat angajat = new Angajat(
                        res.getInt(1),
                        res.getInt(2),
                        magazinRepository.getMagazinForAngajat(res.getInt(2)),
                        res.getString(3),
                        res.getString(4),
                        res.getLong(5),
                        res.getLong(6),
                        res.getString(7)
                );
                angajati.add(angajat);
            }
            return angajati;
        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void update(Angajat entity) {
        String sql = """
                    UPDATE angajat
                    SET magazin_id = ?, nume = ?, prenume = ?, cnp = ?, salariu = ?, numar_telefon = ?
                    WHERE angajat_id = ?""";

        try {
            OraclePreparedStatement prepedStatement = (OraclePreparedStatement)
                    dbConnection.getConn().prepareStatement(sql);

            prepedStatement.setInt(1, entity.getMagazin_id());
            prepedStatement.setString(2, entity.getNume());
            prepedStatement.setString(3, entity.getPrenume());
            prepedStatement.setLong(4, entity.getCnp());
            prepedStatement.setLong(5, entity.getSalariu());
            prepedStatement.setString(6, entity.getNumar_telefon());
            prepedStatement.setInt(7, entity.getAngajat_id());

            prepedStatement.execute();
            audit.write(sql, entity, "Done successfully!");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void delete(Angajat entity) {
        String sql = """
                    DELETE FROM angajat WHERE angajat_id = ?""";

        try {
            OraclePreparedStatement prepedStatement = (OraclePreparedStatement)
                    dbConnection.getConn().prepareStatement(sql);

            prepedStatement.setInt(1, entity.getAngajat_id());

            prepedStatement.execute();
            audit.write(sql, entity, "Done successfully!");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public ArrayList<Angajat> getByMagazin(Magazin magazin) {
        String sql = """
                    SELECT * FROM angajat WHERE magazin_id = ?""";

        try {
            OraclePreparedStatement prepedStatement = (OraclePreparedStatement)
                    dbConnection.getConn().prepareStatement(sql);

            prepedStatement.setInt(1, magazin.getMagazin_id());

            ResultSet res = prepedStatement.executeQuery();
            ArrayList<Angajat> angajati = new ArrayList<>();
            while (res.next()) {
                Angajat angajat = new Angajat(
                        res.getInt(1),
                        res.getInt(2),
                        res.getString(3),
                        res.getString(4),
                        res.getLong(5),
                        res.getLong(6),
                        res.getString(7)
                );
                angajati.add(angajat);
            }
            return angajati;
        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
