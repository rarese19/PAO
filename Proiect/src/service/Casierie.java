package service;

import model.*;
import model.tabele_asociative.TranzactieProdus;
import persistence.*;
import model.produs.Produs;
import oracle.jdbc.OraclePreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;

public class Casierie {
    private static Casierie instance = null;
    private static TranzactieRepository tranzactieRepository = TranzactieRepository.getInstance();
    private static TranzactieProdusRepository  tranzactieProdusRepository = TranzactieProdusRepository.getInstance();
    DBConnection dbConnection = DBConnection.getInstance();

    private Casierie() {}

    public static Casierie getInstance() {
        if (instance == null) {
            instance = new Casierie();
        }
        return instance;
    }

    public void genereazaFactura(Client client, Magazin magazin, HashMap<Produs, Integer> produse, String metoda
        , Date data_returnare) {
        Date data = Date.valueOf(LocalDate.now());
        Tranzactie tranzactie = new Tranzactie();
        tranzactie.setClient_id(client.getClient_id());
        tranzactie.setMagazin_id(magazin.getMagazin_id());
        tranzactie.setMetoda_plata(metoda);
        tranzactie.setStatus("In derulare");
        tranzactie.setData(data);
        tranzactie.setData_returnare(data_returnare);
        tranzactieRepository.add(tranzactie);

        String sql = """
                SELECT MAX(tranzactie_id) from tranzactie
                """;
        int tranzactie_id = 0;
        try {
            OraclePreparedStatement prepedStatement = (OraclePreparedStatement)
                    dbConnection.getConn().prepareStatement(sql);
            ResultSet result = prepedStatement.executeQuery();
            result.next();
            tranzactie_id = result.getInt(1);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        TranzactieProdus tp = new TranzactieProdus();
        int total = 0;
        tp.setTranzactie_id(tranzactie_id);
        for (Produs produs : produse.keySet()) {
            tp.setProdus_id(produs.getProdus_id());
            tp.setCantitate(produse.get(produs));
            tranzactieProdusRepository.add(tp);
            System.out.println(produs.getNume() + " " + produs.getPret() + "x" + produse.get(produs));
            total = total + produs.getPret() * produse.get(produs);
        }
        System.out.println("Total:\t\t" + total + " RON");

    }

}
