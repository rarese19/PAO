package model.produs;

public class Accesoriu extends Produs{
    private String marime;
    private String color;

    public Accesoriu(int produs_id, String nume, int pret, int disponibilitate, String brand, String marime, String color) {
        super(produs_id, nume, pret, disponibilitate, brand);
        this.marime = marime;
        this.color = color;
    }

    public Accesoriu() { }

    public String getMarime() {
        return marime;
    }

    public void setMarime(String marime) {
        this.marime = marime;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Accesoriu{" +
                "marime=" + marime +
                ", color='" + color + '\'' +
                ", produs_id=" + produs_id +
                ", nume='" + nume + '\'' +
                ", pret=" + pret +
                ", disponibilitate=" + disponibilitate +
                ", brand='" + brand + '\'' +
                '}';
    }
}
