package persistence;

import model.*;
import oracle.jdbc.OraclePreparedStatement;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ClientRepository implements GenericRepository<Client>{
    private static ClientRepository instance = null;

    private TranzactieRepository tranzactieRepository = TranzactieRepository.getInstance();

    private ClientRepository() { }

    public static ClientRepository getInstance() {
        if (instance == null) {
            instance = new ClientRepository();
        }
        return instance;
    }

    public void setRepositories() {
        tranzactieRepository = TranzactieRepository.getInstance();
    }

    @Override
    public void add(Client entity) {
        String sql = """
                    INSERT INTO client VALUES(NR_CLIENTI.nextval, ?, ?, ?, ?, ?)""";

        try {
            OraclePreparedStatement prepedStatement = (OraclePreparedStatement)
                    dbConnection.getConn().prepareStatement(sql);

            prepedStatement.setString(1, entity.getNume());
            prepedStatement.setString(2, entity.getPrenume());
            prepedStatement.setLong(3, entity.getCnp());
            prepedStatement.setString(4, entity.getAdresa());
            prepedStatement.setString(5, entity.getNumar_telefon());

            prepedStatement.execute();
            audit.write(sql, entity, "Done successfully!");

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Client get(int id) {
        String sql = """
                    SELECT * FROM client WHERE client_id = ?""";

        try {
            OraclePreparedStatement prepedStatement = (OraclePreparedStatement)
                    dbConnection.getConn().prepareStatement(sql);

            prepedStatement.setInt(1, id);

            ResultSet result = prepedStatement.executeQuery();
            result.next();

            audit.write(sql, id,"Done successfully!");

            return new Client(result.getInt(1), result.getString(2), result.getString(3),
                    result.getLong(4), result.getString(5), result.getString(6),
                    tranzactieRepository.getByClient(result.getInt(1)));
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public ArrayList<Client> getAll() {
        String sql = """
                    SELECT * FROM client""";

        try {
            OraclePreparedStatement prepedStatement = (OraclePreparedStatement)
                    dbConnection.getConn().prepareStatement(sql);

            ResultSet result = prepedStatement.executeQuery();
            ArrayList<Client> clients = new ArrayList<>();

            while (result.next()) {
                clients.add(new Client(result.getInt(1), result.getString(2), result.getString(3),
                        result.getLong(4), result.getString(5), result.getString(6),
                        tranzactieRepository.getByClient(result.getInt(1))));
            }

            audit.write(sql,null,"Done successfully!");

            return clients;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void update(Client entity) {
        String sql = """
                    UPDATE client
                    SET nume = ?, prenume = ?, cnp = ?, adresa_mail = ?, numar_telefon = ?
                    WHERE client_id = ?""";

        try {
            OraclePreparedStatement prepedStatement = (OraclePreparedStatement)
                    dbConnection.getConn().prepareStatement(sql);

            prepedStatement.setString(1, entity.getNume());
            prepedStatement.setString(2, entity.getPrenume());
            prepedStatement.setLong(3, entity.getCnp());
            prepedStatement.setString(4, entity.getAdresa());
            prepedStatement.setString(5, entity.getNumar_telefon());
            prepedStatement.setInt(6, entity.getClient_id());

            prepedStatement.execute();
            audit.write(sql, entity,"Done successfully!");

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void delete(Client entity) {
        String sql = """
                    DELETE FROM client WHERE client_id = ?""";

        try {
            OraclePreparedStatement prepedStatement = (OraclePreparedStatement)
                    dbConnection.getConn().prepareStatement(sql);

            prepedStatement.setInt(1, entity.getClient_id());

            prepedStatement.execute();
            audit.write(sql, entity, "Done successfully!");

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
