package model;

import java.util.ArrayList;

public class Magazin {
    private int magazin_id;
    private int statiune_id;
    private Statiune statiune;
    private String numar_contact;
    private String adresa_mail;
    private ArrayList<Angajat> angajati;

    public Magazin() { }

    public Magazin(int magazin_id, int statiune_id, Statiune statiune, String numar_contact, String adresa_mail,
                   ArrayList<Angajat> angajati) {
        this.magazin_id = magazin_id;
        this.statiune_id = statiune_id;
        this.statiune = statiune;
        this.numar_contact = numar_contact;
        this.adresa_mail = adresa_mail;
        this.angajati = angajati;
    }

    public Magazin(int magazin_id, int statiune_id, Statiune statiune, String numar_contact, String adresa_mail) {
        this.magazin_id = magazin_id;
        this.statiune_id = statiune_id;
        this.statiune = statiune;
        this.numar_contact = numar_contact;
        this.adresa_mail = adresa_mail;
    }

    public Magazin(int magazin_id, int statiune_id, String numar_contact, String adresa_mail) {
        this.magazin_id = magazin_id;
        this.statiune_id = statiune_id;
        this.numar_contact = numar_contact;
        this.adresa_mail = adresa_mail;
    }

    public int getMagazin_id() {
        return magazin_id;
    }

    public void setMagazin_id(int magazin_id) {
        this.magazin_id = magazin_id;
    }

    public int getStatiune_id() {
        return statiune_id;
    }

    public void setStatiune_id(int statiune_id) {
        this.statiune_id = statiune_id;
    }

    public Statiune getStatiune() {
        return statiune;
    }

    public void setStatiune(Statiune statiune) {
        this.statiune = statiune;
    }

    public String getNumar_contact() {
        return numar_contact;
    }

    public void setNumar_contact(String numar_contact) {
        this.numar_contact = numar_contact;
    }

    public String getAdresa_mail() {
        return adresa_mail;
    }

    public void setAdresa_mail(String adresa_mail) {
        this.adresa_mail = adresa_mail;
    }

    public ArrayList<Angajat> getAngajati() {
        return angajati;
    }

    public void setAngajati(ArrayList<Angajat> angajati) {
        this.angajati = angajati;
    }

    @Override
    public String toString() {
        String angajatiList = " { }";
        String statiuneString = " ";
        if (this.angajati != null) {
            angajatiList = String.join(", ", this.angajati.toString());
        }
        if (this.statiune != null) {
            statiuneString = this.statiune.toString();
        }

        return "Magazin{" +
                "magazin_id=" + magazin_id +
                ", statiune_id=" + statiune_id +
                ", statiune=" + statiuneString +
                ", numar_contact='" + numar_contact + '\'' +
                ", adresa_mai='" + adresa_mail + '\'' +
                ", angajati=" + angajatiList +
                '}';
    }
}
