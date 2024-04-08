package model.produs;

public class PerechePatine extends Produs{
    private float marime;
    private String material;
    private String tip;

    public PerechePatine(int produs_id, String nume, int pret, int disponibilitate, String brand, float marime,
                         String material, String tip) {
        super(produs_id, nume, pret, disponibilitate, brand);
        this.marime = marime;
        this.material = material;
        this.tip = tip;
    }

    public PerechePatine() { }

    public float getMarime() {
        return marime;
    }

    public void setMarime(float marime) {
        this.marime = marime;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    @Override
    public String toString() {
        return "PerechePatine{" +
                "marime=" + marime +
                ", material='" + material + '\'' +
                ", tip='" + tip + '\'' +
                ", produs_id=" + produs_id +
                ", nume='" + nume + '\'' +
                ", pret=" + pret +
                ", disponibilitate=" + disponibilitate +
                ", brand='" + brand + '\'' +
                '}';
    }
}
