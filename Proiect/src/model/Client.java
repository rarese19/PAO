package model;

import java.util.ArrayList;

public class Client {
    private int client_id;
    private String nume;
    private String prenume;
    private long cnp;
    private String adresa;
    private String numar_telefon;
    private ArrayList<Tranzactie> tranzactii;

    public Client() { }

    public Client(int client_id, String nume, String prenume, long cnp, String adresa, String numar_telefon,
                  ArrayList<Tranzactie> tranzactii) {
        this.client_id = client_id;
        this.nume = nume;
        this.prenume = prenume;
        this.cnp = cnp;
        this.adresa = adresa;
        this.numar_telefon = numar_telefon;
        this.tranzactii = tranzactii;
    }

    public Client(int client_id) {
        this.client_id = client_id;
    }

    public Client(int client_id, String nume, String prenume, long cnp, String adresa, String numar_telefon) {
        this.client_id = client_id;
        this.nume = nume;
        this.prenume = prenume;
        this.cnp = cnp;
        this.adresa = adresa;
        this.numar_telefon = numar_telefon;
    }

    public int getClient_id() {
        return client_id;
    }

    public void setClient_id(int client_id) {
        this.client_id = client_id;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public long getCnp() {
        return cnp;
    }

    public void setCnp(long cnp) {
        this.cnp = cnp;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public String getNumar_telefon() {
        return numar_telefon;
    }

    public void setNumar_telefon(String numar_telefon) {
        this.numar_telefon = numar_telefon;
    }

    public ArrayList<Tranzactie> getTranzactii() {
        return tranzactii;
    }

    public void setTranzactii(ArrayList<Tranzactie> tranzactii) {
        this.tranzactii = tranzactii;
    }

    @Override
    public String toString() {
        String tranzactiiString = " ";
        if (tranzactii != null) {
            tranzactiiString = tranzactii.toString();
        }
        return "Client{" +
                "client_id=" + client_id +
                ", nume='" + nume + '\'' +
                ", prenume='" + prenume + '\'' +
                ", cnp=" + cnp +
                ", adresa='" + adresa + '\'' +
                ", numar_telefon='" + numar_telefon + '\'' +
                ", tranzactii=" + tranzactiiString +
                '}';
    }
}
