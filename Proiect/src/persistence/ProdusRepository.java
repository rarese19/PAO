package persistence;

import model.*;
import model.produs.*;
import oracle.jdbc.OraclePreparedStatement;
import service.DBConnection;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ProdusRepository  implements GenericRepository<Produs>{
    private static ProdusRepository instance = null;

    private ProdusRepository() {}

    public static ProdusRepository getInstance() {
        if (instance == null) {
            instance = new ProdusRepository();
        }
        return instance;
    }

    private String insertSQL(Produs produs) {
        String sql = """
                INSERT INTO produs (produs_id, nume, pret, disponibilitate, brand)
                VALUES (?, ?, ?, ?, ?);
                """;
        if (produs instanceof Accesoriu) {
            String toReturn =  sql + """  
                    INSERT INTO accesoriu (produs_id, marime, culoare)
                    VALUES (?, ?, ?);
                    """;
            return toReturn;
        }
        if (produs instanceof PerechePatine) {
            String toReturn =  sql + """  
                    INSERT INTO pereche_patine (produs_id, marime, material, tip)
                    VALUES (?, ?, ?, ?);
                    """;
            return toReturn;
        }
        if (produs instanceof PerecheSchi) {
            String toReturn = sql + """
                    INSERT INTO pereche_schi (produs_id, lungime, flexibilitate, nivel_experienta)
                    VALUES (?, ?, ?, ?);
                    """;
            return toReturn;
        }
        if (produs instanceof Snowboard) {
            String toReturn = sql + """
                    INSERT INTO skateboard (produs_id, stil, lungime, latime)
                    VALUES (?, ?, ?, ?);
                    """;
            return toReturn;
        }

        return "";
    }

    private String updateSQL(Produs produs) {
        String sql = """
                UPDATE produs
                SET nume = ?, pret = ?, disponibilitate = ?, brand = ?
                WHERE produs_id = ?;
                """;
        if (produs instanceof Accesoriu) {
            String toReturn =  sql + """  
                    UPDATE accesoriu
                    SET marime = ?, culoare = ?
                    WHERE produs_id = ?;
                    """;
            return toReturn;
        }
        if (produs instanceof PerechePatine) {
            String toReturn =  sql + """  
                    UPDATE pereche_patine
                    SET marime = ?, material = ?, tip = ?
                    WHERE produs_id = ?;
                    """;
            return toReturn;
        }
        if (produs instanceof PerecheSchi) {
            String toReturn = sql + """
                    UPDATE pereche_schi
                    SET lungime = ?, flexibilitate = ?, nivel_experienta = ?
                    WHERE produs_id = ?;
                    """;
            return toReturn;
        }
        if (produs instanceof Snowboard) {
            String toReturn = sql + """
                    UPDATE skateboard
                    SET stil = ?, lungime = ?, latime = ?
                    WHERE produs_id = ?;
                    """;
            return toReturn;
        }

        return "";
    }

    private OraclePreparedStatement prepInsertStatement(String sql, Produs produs) {
        try {
            OraclePreparedStatement prepedStatement = (OraclePreparedStatement)
                    dbConnection.getConn().prepareStatement(sql);

            prepedStatement.setInt(1, produs.getProdus_id());
            prepedStatement.setString(2, produs.getNume());
            prepedStatement.setInt(3, produs.getPret());
            prepedStatement.setInt(4, produs.getDisponibilitate());
            prepedStatement.setString(5, produs.getBrand());

            if (produs instanceof Accesoriu) {
                Accesoriu accesoriu = (Accesoriu) produs;
                prepedStatement.setInt(6, accesoriu.getProdus_id());
                prepedStatement.setString(7, accesoriu.getMarime());
                prepedStatement.setString(8, accesoriu.getColor());
                prepedStatement.setInt(9, accesoriu.getProdus_id());
            }

            if (produs instanceof PerechePatine) {
                PerechePatine perechePatine = (PerechePatine) produs;
                prepedStatement.setFloat(6, perechePatine.getMarime());
                prepedStatement.setString(7, perechePatine.getMaterial());
                prepedStatement.setString(8, perechePatine.getTip());
                prepedStatement.setString(9, perechePatine.getTip());
            }

            if (produs instanceof PerecheSchi) {
                PerecheSchi perecheSchi = (PerecheSchi) produs;
                prepedStatement.setInt(6, perecheSchi.getLungime());
                prepedStatement.setString(7, perecheSchi.getFlexibilitate());
                prepedStatement.setString(8, perecheSchi.getNivel_experienta());
                prepedStatement.setInt(9, perecheSchi.getProdus_id());
            }

            if (produs instanceof Snowboard) {
                Snowboard snowboard = (Snowboard) produs;
                prepedStatement.setString(6, snowboard.getStil());
                prepedStatement.setInt(7, snowboard.getLungime());
                prepedStatement.setInt(8, snowboard.getLatime());
                prepedStatement.setInt(9, snowboard.getProdus_id());
            }

            return prepedStatement;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private OraclePreparedStatement prepUpdateStatement(String sql, Produs produs) {
        try {
            OraclePreparedStatement prepedStatement = (OraclePreparedStatement)
                    dbConnection.getConn().prepareStatement(sql);

            prepedStatement.setString(1, produs.getNume());
            prepedStatement.setInt(2, produs.getPret());
            prepedStatement.setInt(3, produs.getDisponibilitate());
            prepedStatement.setString(4, produs.getBrand());
            prepedStatement.setInt(5, produs.getProdus_id());

            if (produs instanceof Accesoriu) {
                Accesoriu accesoriu = (Accesoriu) produs;
                prepedStatement.setString(5, accesoriu.getMarime());
                prepedStatement.setString(6, accesoriu.getColor());
                prepedStatement.setInt(7, produs.getProdus_id());
            }

            if (produs instanceof PerechePatine) {
                PerechePatine perechePatine = (PerechePatine) produs;
                prepedStatement.setFloat(5, perechePatine.getMarime());
                prepedStatement.setString(6, perechePatine.getMaterial());
                prepedStatement.setString(7, perechePatine.getTip());
                prepedStatement.setInt(8, produs.getProdus_id());
            }

            if (produs instanceof PerecheSchi) {
                PerecheSchi perecheSchi = (PerecheSchi) produs;
                prepedStatement.setInt(5, perecheSchi.getLungime());
                prepedStatement.setString(6, perecheSchi.getFlexibilitate());
                prepedStatement.setString(7, perecheSchi.getNivel_experienta());
                prepedStatement.setInt(8, produs.getProdus_id());
            }

            if (produs instanceof Snowboard) {
                Snowboard snowboard = (Snowboard) produs;
                prepedStatement.setString(5, snowboard.getStil());
                prepedStatement.setInt(6, snowboard.getLungime());
                prepedStatement.setInt(7, snowboard.getLatime());
                prepedStatement.setInt(8, produs.getProdus_id());
            }

            return prepedStatement;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void add(Produs entity) {
        String sql = insertSQL(entity);
        OraclePreparedStatement prepedStatement = prepInsertStatement(sql, entity);

        try {
            prepedStatement.execute();
            audit.write("create", entity);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Produs get(int id) {
        String sql = """
                    SELECT * FROM produs WHERE produs_id = ?""";

        try {
            OraclePreparedStatement prepedStatement = (OraclePreparedStatement)
                    dbConnection.getConn().prepareStatement(sql);

            prepedStatement.setInt(1, id);

            ResultSet result = prepedStatement.executeQuery();
            result.next();
            String nume = result.getString(2);

            switch (nume) {
                case "pereche schi":
                    String sql2 = """
                            SELECT * FROM pereche_schi WHERE produs_id = ?""";

                    OraclePreparedStatement prepedStatement2 = (OraclePreparedStatement)
                            dbConnection.getConn().prepareStatement(sql2);
                    prepedStatement2.setInt(1, id);

                    ResultSet result2 = prepedStatement2.executeQuery();
                    result2.next();

                    return new PerecheSchi(id, nume, result.getInt(3), result.getInt(4),
                            result.getString(5), result2.getInt(2),
                            result2.getString(3), result2.getString(4));

                case "pereche patine":
                    sql2 = """
                            SELECT * FROM pereche_patine WHERE produs_id = ?""";

                    prepedStatement2 = (OraclePreparedStatement)
                            dbConnection.getConn().prepareStatement(sql2);
                    prepedStatement2.setInt(1, id);

                    result2 = prepedStatement2.executeQuery();
                    result2.next();

                    return new PerechePatine(id, nume, result.getInt(3), result.getInt(4),
                            result.getString(5), result2.getFloat(2),
                            result2.getString(3), result2.getString(4));

                case "snow-board":
                    sql2 = """
                            SELECT * FROM snow_board WHERE produs_id = ?""";

                    prepedStatement2 = (OraclePreparedStatement)
                            dbConnection.getConn().prepareStatement(sql2);
                    prepedStatement2.setInt(1, id);

                    result2 = prepedStatement2.executeQuery();
                    result2.next();

                    return new Snowboard(id, nume, result.getInt(3), result.getInt(4),
                            result.getString(5), result2.getString(2),
                            result2.getInt(3), result2.getInt(4));

                default:
                    sql2 = """
                            SELECT * FROM accesoriu WHERE produs_id = ?""";

                    prepedStatement2 = (OraclePreparedStatement)
                            dbConnection.getConn().prepareStatement(sql2);
                    prepedStatement2.setInt(1, id);

                    result2 = prepedStatement2.executeQuery();
                    result2.next();

                    return new Accesoriu(id, nume, result.getInt(3), result.getInt(4),
                            result.getString(5), result2.getString(2),
                            result2.getString(3));

            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public ArrayList<Produs> getAll() {
        String sql;
        ArrayList<String> tabele = new ArrayList<>();
        ArrayList<Produs> produse = new ArrayList<>();
        tabele.add("pereche_schi");
        tabele.add("pereche_patine");
        tabele.add("snow_board");
        tabele.add("accesoriu");
        try {
            for (String tabela : tabele) {
                sql = "SELECT * FROM " + tabela;
                Statement prepedStatement = dbConnection.getConn().createStatement();

                ResultSet result = prepedStatement.executeQuery(sql);
                while (result.next()) {
                    String sql2 = """
                            SELECT * from produs WHERE produs_id = ?""";

                    OraclePreparedStatement prepedStatement2 = (OraclePreparedStatement)
                            dbConnection.getConn().prepareStatement(sql2);
                    prepedStatement2.setInt(1, result.getInt(1));

                    ResultSet result2 = prepedStatement2.executeQuery();
                    result2.next();
                    switch (tabela) {
                        case "pereche_schi":
                            produse.add(new PerecheSchi(result.getInt(1), "pereche schi", result2.getInt(3),
                                    result2.getInt(4), result2.getString(5), result.getInt(2),
                                    result.getString(3), result.getString(4)));
                            break;
                        case "pereche_patine":
                            produse.add(new PerechePatine(result.getInt(1), "pereche patine", result2.getInt(3),
                                    result2.getInt(4), result2.getString(5), result.getFloat(2),
                                    result.getString(3), result.getString(4)));
                            break;
                        case "snow_board":
                            produse.add(new Snowboard(result.getInt(1), "snow-board", result2.getInt(3),
                                    result2.getInt(4), result2.getString(5), result.getString(2),
                                    result.getInt(3), result.getInt(4)));
                            break;
                        default:
                            produse.add(new Accesoriu(result.getInt(1), result2.getString(2), result2.getInt(3),
                                    result2.getInt(4), result2.getString(5), result.getString(2),
                                    result.getString(3)));
                            break;
                    }
                }
            }
            return produse;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void update(Produs entity) {
        String sql = updateSQL(entity);
        OraclePreparedStatement prepedStatement = prepUpdateStatement(sql, entity);

        try {
            prepedStatement.execute();
            audit.write("update", entity);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void delete(Produs entity) {

    }
}
