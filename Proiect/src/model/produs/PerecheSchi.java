package model.produs;

public class PerecheSchi extends Produs{
    private int lungime;
    private String flexibilitate;
    private String nivel_experienta;

    public PerecheSchi() { }

    public PerecheSchi(int produs_id, String nume, int pret, int disponibilitate, String brand, int lungime,
                       String flexibilitate, String nivel_experienta) {
        super(produs_id, nume, pret, disponibilitate, brand);
        this.lungime = lungime;
        this.flexibilitate = flexibilitate;
        this.nivel_experienta = nivel_experienta;
    }

    public int getLungime() {
        return lungime;
    }

    public void setLungime(int lungime) {
        this.lungime = lungime;
    }

    public String getFlexibilitate() {
        return flexibilitate;
    }

    public void setFlexibilitate(String flexibilitate) {
        this.flexibilitate = flexibilitate;
    }

    public String getNivel_experienta() {
        return nivel_experienta;
    }

    public void setNivel_experienta(String nivel_experienta) {
        this.nivel_experienta = nivel_experienta;
    }

    @Override
    public String toString() {
        return "PerecheSchi{" +
                "lungime=" + lungime +
                ", flexibilitate='" + flexibilitate + '\'' +
                ", nivel_experienta='" + nivel_experienta + '\'' +
                ", produs_id=" + produs_id +
                ", nume='" + nume + '\'' +
                ", pret=" + pret +
                ", disponibilitate=" + disponibilitate +
                ", brand='" + brand + '\'' +
                '}';
    }
}
