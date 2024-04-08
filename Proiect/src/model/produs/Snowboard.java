package model.produs;

public class Snowboard extends Produs{
    private String stil;
    private int lungime;
    private int latime;

    public Snowboard(int produs_id, String nume, int pret, int disponibilitate, String brand, String stil, int lungime, int latime) {
        super(produs_id, nume, pret, disponibilitate, brand);
        this.stil = stil;
        this.lungime = lungime;
        this.latime = latime;
    }

    public Snowboard() { }

    public String getStil() {
        return stil;
    }

    public void setStil(String stil) {
        this.stil = stil;
    }

    public int getLungime() {
        return lungime;
    }

    public void setLungime(int lungime) {
        this.lungime = lungime;
    }

    public int getLatime() {
        return latime;
    }

    public void setLatime(int latime) {
        this.latime = latime;
    }

    @Override
    public String toString() {
        return "Snowboard{" +
                "stil='" + stil + '\'' +
                ", lungime=" + lungime +
                ", latime=" + latime +
                ", produs_id=" + produs_id +
                ", nume='" + nume + '\'' +
                ", pret=" + pret +
                ", disponibilitate=" + disponibilitate +
                ", brand='" + brand + '\'' +
                '}';
    }
}
