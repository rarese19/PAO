package model;

public class Angajat {
    private int angajat_id;
    private int magazin_id;
    private Magazin magazin;
    private String nume;
    private String prenume;
    private long cnp;
    private long salariu;
    private String numar_telefon;

    public Angajat() { }

    public Angajat(int angajat_id, int magazin_id, Magazin magazin, String nume, String prenume, long cnp,
                   long salariu, String numar_telefon) {
        this.angajat_id = angajat_id;
        this.magazin_id = magazin_id;
        this.magazin = magazin;
        this.nume = nume;
        this.prenume = prenume;
        this.cnp = cnp;
        this.salariu = salariu;
        this.numar_telefon = numar_telefon;
    }

    public Angajat(int angajat_id, int magazin_id, String nume, String prenume, long cnp,
                   long salariu, String numar_telefon) {
        this.angajat_id = angajat_id;
        this.magazin_id = magazin_id;
        this.nume = nume;
        this.prenume = prenume;
        this.cnp = cnp;
        this.salariu = salariu;
        this.numar_telefon = numar_telefon;
    }

    public int getAngajat_id() {
        return angajat_id;
    }

    public void setAngajat_id(int angajat_id) {
        this.angajat_id = angajat_id;
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

    public long getSalariu() {
        return salariu;
    }

    public void setSalariu(long salariu) {
        this.salariu = salariu;
    }

    public String getNumar_telefon() {
        return numar_telefon;
    }

    public void setNumar_telefon(String numar_telefon) {
        this.numar_telefon = numar_telefon;
    }

    @Override
    public String toString() {
        String magazinString = "null";
        if (this.magazin != null) {
            magazinString = this.magazin.toString();
        }
        int magazin_id = 0;
        if (this.magazin != null) {
            magazin_id = this.magazin.getMagazin_id();
        }
        return "Angajat{" +
                "angajat_id=" + angajat_id +
                ", magazin_id=" + magazin_id +
                ", magazin=" + magazin +
                ", nume='" + nume + '\'' +
                ", prenume='" + prenume + '\'' +
                ", cnp=" + cnp +
                ", salariu=" + salariu +
                ", numar_telefon='" + numar_telefon + '\'' +
                '}';
    }
}
