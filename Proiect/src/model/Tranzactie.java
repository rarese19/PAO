package model;

import java.sql.Date;

public class Tranzactie {
    private int tranzactie_id;
    private int client_id;
    private Client client;
    private int magazin_id;
    private Magazin magazin;
    private String metoda_plata;
    private String status;
    private Date data;
    private Date data_returnare;

    public Tranzactie(int tranzactie_id, int client_id, Client client, int magazin_id, Magazin magazin,
                      String metoda_plata, String status, Date data, Date data_returnare) {
        this.tranzactie_id = tranzactie_id;
        this.client_id = client_id;
        this.client = client;
        this.magazin_id = magazin_id;
        this.magazin = magazin;
        this.metoda_plata = metoda_plata;
        this.status = status;
        this.data = data;
        this.data_returnare = data_returnare;
    }

    public int getTranzactie_id() {
        return tranzactie_id;
    }

    public void setTranzactie_id(int tranzactie_id) {
        this.tranzactie_id = tranzactie_id;
    }

    public int getClient_id() {
        return client_id;
    }

    public void setClient_id(int client_id) {
        this.client_id = client_id;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public int getMagazin_id() {
        return magazin_id;
    }

    public void setMagazin_id(int magazin_id) {
        this.magazin_id = magazin_id;
    }

    public Magazin getMagazin() {
        return magazin;
    }

    public void setMagazin(Magazin magazin) {
        this.magazin = magazin;
    }

    public String getMetoda_plata() {
        return metoda_plata;
    }

    public void setMetoda_plata(String metoda_plata) {
        this.metoda_plata = metoda_plata;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Date getData_returnare() {
        return data_returnare;
    }

    public void setData_returnare(Date data_returnare) {
        this.data_returnare = data_returnare;
    }

    @Override
    public String toString() {
        return "Tranzactie{" +
                "tranzactie_id=" + tranzactie_id +
                ", client_id=" + client_id +
                ", client=" + client +
                ", magazin_id=" + magazin_id +
                ", magazin=" + magazin +
                ", metoda_plata='" + metoda_plata + '\'' +
                ", status='" + status + '\'' +
                ", data=" + data +
                ", data_returnare=" + data_returnare +
                '}';
    }
}
