package persistence;

import model.*;
import oracle.jdbc.OraclePreparedStatement;
import service.DBConnection;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class MagazinRepository implements GenericRepository<Magazin>{
    private static MagazinRepository instance = null;
    private StatiuneRepository statiuneRepository;
    private AngajatRepository angajatRepository;

    public void setRepositories() {
        statiuneRepository = StatiuneRepository.getInstance();
        angajatRepository = AngajatRepository.getInstance();
    }

    private MagazinRepository() {}

    public static MagazinRepository getInstance() {
        if (instance == null) {
            instance = new MagazinRepository();
        }
        return instance;
    }

    @Override
    public void add(Magazin entity) {
        String sql = """
                    INSERT INTO magazin VALUES(?, ?, ?, ?)\
                     """;

        try {
            OraclePreparedStatement prepedStatement = (OraclePreparedStatement)
                    DBConnection.getInstance().getConn().prepareStatement(sql);

            prepedStatement.setInt(1, entity.getMagazin_id());
            prepedStatement.setInt(2, entity.getStatiune_id());
            prepedStatement.setString(3, entity.getNumar_contact());
            prepedStatement.setString(4, entity.getAdresa_mail());

            prepedStatement.execute();
            audit.write(sql, entity, "Done successfully!");
        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Magazin get(int id) {
        String sql = """
                    SELECT * FROM magazin WHERE magazin_id = ?""";
        try {
            OraclePreparedStatement prepedStatement = (OraclePreparedStatement)
                    dbConnection.getConn().prepareStatement(sql);

            prepedStatement.setInt(1, id);

            ResultSet res = prepedStatement.executeQuery();
            if (res.next()) {
                Magazin magazin = new Magazin(
                        res.getInt(1),
                        res.getInt(2),
                        statiuneRepository.statiuneForMagazin(res.getInt(2)),
                        res.getString(3),
                        res.getString(4)
                );
                audit.write(sql, magazin, "Done successfully!");
                return magazin;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }

    public Magazin getMagazinForAngajat(int id) {
        String sql = """
                    SELECT * FROM magazin WHERE magazin_id = ?""";
        try {
            OraclePreparedStatement prepedStatement = (OraclePreparedStatement)
                    dbConnection.getConn().prepareStatement(sql);

            prepedStatement.setInt(1, id);

            ResultSet res = prepedStatement.executeQuery();
            if (res.next()) {
                Magazin magazin = new Magazin(
                        res.getInt(1),
                        res.getInt(2),
                        res.getString(3),
                        res.getString(4)
                );


                return magazin;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }

    @Override
    public ArrayList<Magazin> getAll() {
        String sql = """
                SELECT * FROM MAGAZIN""";

        try {
            OraclePreparedStatement prepedStatement = (OraclePreparedStatement)
                    dbConnection.getConn().prepareStatement(sql);

            ResultSet res = prepedStatement.executeQuery();
            ArrayList<Magazin> magazine = new ArrayList<>();

            while (res.next()) {
                Magazin magazin = new Magazin(
                        res.getInt(1),
                        res.getInt(2),
                        statiuneRepository.statiuneForAngajati(res.getInt(2)),
                        res.getString(3),
                        res.getString(4)
                );
                Magazin toAdd = new Magazin(
                        res.getInt(1),
                        res.getInt(2),
                        statiuneRepository.statiuneForAngajati(res.getInt(2)),
                        res.getString(3),
                        res.getString(4),
                        angajatRepository.getByMagazin(magazin));
                magazine.add(toAdd);
            }
            audit.write(sql, null, "Done succesfully!");
            return magazine;

        }
        catch (SQLException e){
            throw new RuntimeException(e);
        }
    }

    @Override
    public void update(Magazin entity) {
        String sql = """
                    UPDATE magazin
                    SET STATIUNE_ID = ?, numar_contact = ?, adresa_mail = ?
                    WHERE magazin_id = ?""";

        try {
            OraclePreparedStatement prepedStatement = (OraclePreparedStatement)
                    dbConnection.getConn().prepareStatement(sql);

            prepedStatement.setInt(1, entity.getStatiune_id());
            prepedStatement.setString(2, entity.getNumar_contact());
            prepedStatement.setString(3, entity.getAdresa_mail());
            prepedStatement.setInt(4, entity.getMagazin_id());

            prepedStatement.execute();
            audit.write(sql, entity, "Done successfully!");
        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void delete(Magazin entity) {
        String sql = """
                    DELETE FROM magazin WHERE magazin_id = ?""";

        try {
            OraclePreparedStatement prepedStatement = (OraclePreparedStatement)
                    dbConnection.getConn().prepareStatement(sql);

            prepedStatement.setInt(1, entity.getMagazin_id());

            prepedStatement.execute();
            audit.write(sql, entity, "Done successfully!");
        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public ArrayList<Magazin> getMagazineByStatiune(Statiune statiune) {
        String sql = """
                    SELECT * FROM magazin WHERE statiune_id = ?""";

        try {
            OraclePreparedStatement prepedStatement = (OraclePreparedStatement)
                    dbConnection.getConn().prepareStatement(sql);

            prepedStatement.setInt(1, statiune.getStatiune_id());

            ResultSet res = prepedStatement.executeQuery();
            ArrayList<Magazin> magazine = new ArrayList<>();
            while (res.next()) {
                Magazin magazin = new Magazin(
                        res.getInt(1),
                        res.getInt(2),
                        res.getString(3),
                        res.getString(4)
                );
                magazine.add(magazin);
            }
            audit.write(sql, statiune, "Done successfully!");
            return magazine;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
