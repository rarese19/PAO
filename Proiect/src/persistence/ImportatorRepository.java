package persistence;

import model.*;
import oracle.jdbc.OraclePreparedStatement;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ImportatorRepository implements GenericRepository<Importator>{
    private static ImportatorRepository instance = null;

    private ImportatorRepository() {}

    public static ImportatorRepository getInstance() {
        if (instance == null) {
            instance = new ImportatorRepository();
        }
        return instance;
    }

    public void setRepositories() {

    }
    @Override
    public void add(Importator entity) {
        String sql = """
                    INSERT INTO importator VALUES(?, ?, ?, ?, ?)\
                     """;

        try {
            OraclePreparedStatement prepedStatement = (OraclePreparedStatement)
                    dbConnection.getConn().prepareStatement(sql);

            prepedStatement.setInt(1, entity.getImportator_id());
            prepedStatement.setString(2, entity.getNume());
            prepedStatement.setString(3, entity.getAdresa_mail());
            prepedStatement.setString(4, entity.getNumar_contact());
            prepedStatement.setString(5, entity.getMetoda_transport());

            prepedStatement.execute();
            audit.write(sql, entity, "Done successfully!");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Importator get(int id) {
        String sql = """
                    SELECT * FROM importator WHERE importator_id = ?""";
        try {
            OraclePreparedStatement prepedStatement = (OraclePreparedStatement)
                    dbConnection.getConn().prepareStatement(sql);

            prepedStatement.setInt(1, id);

            ResultSet result = prepedStatement.executeQuery();
            result.next();

            audit.write(sql, id, "Done successfully!");
            return new Importator(result.getInt(1), result.getString(2),
                    result.getString(3), result.getString(4), result.getString(5));
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public ArrayList<Importator> getAll() {
        String sql = """
                    SELECT * FROM importator""";
        try {
            OraclePreparedStatement prepedStatement = (OraclePreparedStatement)
                    dbConnection.getConn().prepareStatement(sql);

            ResultSet result = prepedStatement.executeQuery();
            ArrayList<Importator> importatori = new ArrayList<>();
            while (result.next()) {
                importatori.add(new Importator(result.getInt(1), result.getString(2), result.getString(3),
                        result.getString(4), result.getString(5)));
            }

            audit.write(sql, importatori, "Done succesfully!");
            return importatori;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void update(Importator entity) {
        String sql = """
                    UPDATE importator
                    SET nume = ?, adresa_mail = ?, numar_contact = ?, metoda_transport = ?
                    WHERE importator_id = ?""";

        try {
            OraclePreparedStatement prepedStatement = (OraclePreparedStatement)
                    dbConnection.getConn().prepareStatement(sql);

            prepedStatement.setString(1, entity.getNume());
            prepedStatement.setString(2, entity.getAdresa_mail());
            prepedStatement.setString(3, entity.getNumar_contact());
            prepedStatement.setString(4, entity.getMetoda_transport());
            prepedStatement.setInt(5, entity.getImportator_id());

            prepedStatement.execute();
            audit.write(sql, entity, "Done successfully!");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void delete(Importator entity) {
        String sql = """
                    DELETE FROM importator WHERE importator_id = ?""";

        try {
            OraclePreparedStatement prepedStatement = (OraclePreparedStatement)
                    dbConnection.getConn().prepareStatement(sql);

            prepedStatement.setInt(1, entity.getImportator_id());

            prepedStatement.execute();
            audit.write(sql, entity, "Done successfully!");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
