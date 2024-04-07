package model.tabele_asociative;

public class Tranzactie_Produs {
    private int tranzactie_id;
    private int produs_id;
    private int cantitate;

    public Tranzactie_Produs() { }

    public Tranzactie_Produs(int tranzactie_id, int produs_id, int cantitate) {
        this.tranzactie_id = tranzactie_id;
        this.produs_id = produs_id;
        this.cantitate = cantitate;
    }

    public int getTranzactie_id() {
        return tranzactie_id;
    }

    public void setTranzactie_id(int tranzactie_id) {
        this.tranzactie_id = tranzactie_id;
    }

    public int getProdus_id() {
        return produs_id;
    }

    public void setProdus_id(int produs_id) {
        this.produs_id = produs_id;
    }

    public int getCantitate() {
        return cantitate;
    }

    public void setCantitate(int cantitate) {
        this.cantitate = cantitate;
    }

    @Override
    public String toString() {
        return "Tranzactie_Produs{" +
                "tranzactie_id=" + tranzactie_id +
                ", produs_id=" + produs_id +
                ", cantitate=" + cantitate +
                '}';
    }
}
