package service;

import oracle.jdbc.OraclePreparedStatement;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ManagerServices {
    private static ManagerServices instance = null;

    private ManagerServices() {}

    public static ManagerServices getInstance() {
        if (instance == null) {
            instance = new ManagerServices();
        }
        return instance;
    }

    public void getDetaliiTranzactii() {
        Map<Integer, ArrayList<String>> resultData = new HashMap<>();
        String sql = """
                SELECT s.regiune, t.tranzactie_id, t.data, p.nume, tp.cantitate
                FROM statiune s, magazin m, tranzactie t, produs p, tranzactie_produs tp
                WHERE t.magazin_id = m.magazin_id
                  AND s.statiune_id = m.statiune_id
                  AND tp.tranzactie_id = t.tranzactie_id
                  AND p.produs_id = tp.produs_id
                """;

        try {
            OraclePreparedStatement prepedStatement = (OraclePreparedStatement)
                    DBConnection.getInstance().getConn().prepareStatement(sql);

            ResultSet result = prepedStatement.executeQuery();

            while (result.next()) {
                if (!resultData.containsKey(result.getInt(2))) {
                    String rand = """
                            Pentru tranzactia %d efectuata la data de %s in regiunea %s s-au cumparat:
                            """.formatted(result.getInt(2), result.getDate(3),
                            result.getString(1));
                    resultData.put(result.getInt(2), new ArrayList<>());
                    resultData.get(result.getInt(2)).add(rand);
                }
                int tranzactie_id = result.getInt(2);
                String rand = """
                        %d produs(e) de tipul %s
                        """.formatted(result.getInt(5), result.getString(4));
                resultData.get(tranzactie_id).add(rand);
            }

            for (Map.Entry<Integer, ArrayList<String>> entry : resultData.entrySet()) {
                for (String s : entry.getValue()) {
                    System.out.println(s);
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
