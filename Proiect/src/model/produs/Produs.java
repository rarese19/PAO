package model.produs;

public abstract class Produs {
    protected int produs_id;

    protected String nume;
    protected int pret;
    protected int disponibilitate;
    protected String brand;
    public Produs() { }

    public Produs(int produs_id, String nume, int pret, int disponibilitate, String brand) {
        this.produs_id = produs_id;
        this.nume = nume;
        this.pret = pret;
        this.disponibilitate = disponibilitate;
        this.brand = brand;
    }

    public int getProdus_id() {
        return produs_id;
    }

    public void setProdus_id(int produs_id) {
        this.produs_id = produs_id;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getPret() {
        return pret;
    }

    public void setPret(int pret) {
        this.pret = pret;
    }

    public int getDisponibilitate() {
        return disponibilitate;
    }

    public void setDisponibilitate(int disponibilitate) {
        this.disponibilitate = disponibilitate;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Produs{" +
                "produs_id=" + produs_id +
                ", nume='" + nume + '\'' +
                ", pret=" + pret +
                ", disponibilitate=" + disponibilitate +
                ", brand='" + brand + '\'' +
                '}';
    }
}
