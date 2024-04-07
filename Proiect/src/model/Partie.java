package model;

public class Partie {
    private int partie_id;
    private int statiune_id;
    private Statiune statiune;
    private String nume;
    private int inaltime;
    private int lungime;
    private String grad_dificultate;

    public Partie() { }

    public Partie(int partie_id, int statiune_id, Statiune statiune, String nume, int inaltime, int lungime,
                  String grad_dificultate) {
        this.partie_id = partie_id;
        this.statiune_id = statiune_id;
        this.statiune = statiune;
        this.nume = nume;
        this.inaltime = inaltime;
        this.lungime = lungime;
        this.grad_dificultate = grad_dificultate;
    }

    public int getPartie_id() {
        return partie_id;
    }

    public void setPartie_id(int partie_id) {
        this.partie_id = partie_id;
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

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getInaltime() {
        return inaltime;
    }

    public void setInaltime(int inaltime) {
        this.inaltime = inaltime;
    }

    public int getLungime() {
        return lungime;
    }

    public void setLungime(int lungime) {
        this.lungime = lungime;
    }

    public String getGrad_dificultate() {
        return grad_dificultate;
    }

    public void setGrad_dificultate(String grad_dificultate) {
        this.grad_dificultate = grad_dificultate;
    }

    @Override
    public String toString() {
        String statiuneString = " ";
        if (this.statiune != null) {
            statiuneString = this.statiune.toString();
        }
        return "Partie{" +
                "partie_id=" + partie_id +
                ", statiune_id=" + statiune_id +
                ", statiune=" + statiuneString +
                ", nume='" + nume + '\'' +
                ", inaltime=" + inaltime +
                ", lungime=" + lungime +
                ", grad_dificultate='" + grad_dificultate + '\'' +
                '}';
    }
}
