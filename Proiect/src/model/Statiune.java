package model;

import java.util.ArrayList;
import java.sql.SQLOutput;

public class Statiune {
    private int statiune_id;
    private String regiune;
    private String stat;
    private String nume;
    private ArrayList<Partie> partii;
    private ArrayList<Magazin> magazine;

    public Statiune() { }

    public Statiune(int statiune_id, String regiune, String stat, String nume, ArrayList<Partie> partii,
                    ArrayList<Magazin> magazine) {
        this.statiune_id = statiune_id;
        this.regiune = regiune;
        this.stat = stat;
        this.nume = nume;
        this.partii = partii;
        this.magazine = magazine;
    }

    public Statiune(int statiune_id, String regiune, String stat, String nume) {
        this.statiune_id = statiune_id;
        this.regiune = regiune;
        this.stat = stat;
        this.nume = nume;
    }

    public int getStatiune_id() {
        return statiune_id;
    }

    public void setStatiune_id(int statiune_id) {
        this.statiune_id = statiune_id;
    }

    public String getRegiune() {
        return regiune;
    }

    public void setRegiune(String regiune) {
        this.regiune = regiune;
    }

    public String getStat() {
        return stat;
    }

    public void setStat(String stat) {
        this.stat = stat;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public ArrayList<Partie> getPartii() {
        return partii;
    }

    public void setPartii(ArrayList<Partie> partii) {
        this.partii = partii;
    }

    public ArrayList<Magazin> getMagazine() {
        return magazine;
    }

    public void setMagazine(ArrayList<Magazin> magazine) {
        this.magazine = magazine;
    }

    @Override
    public String toString() {
        String partiiList = " { }";
        String magazineList = " { }";
        if (this.partii != null) {
            partiiList = String.join(", ", this.partii.toString());
        }
        if (this.magazine != null) {
            magazineList = String.join(", ", this.magazine.toString());
        }

        return "Statiune{" +
                "statiune_id=" + statiune_id +
                ", regiune='" + regiune + '\'' +
                ", stat='" + stat + '\'' +
                ", nume='" + nume + '\'' +
                ", partii=" + partiiList +
                ", magazine=" + magazineList +
                '}';
    }
}
