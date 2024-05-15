package model.tabele_asociative;

public class TranzactieProdus {
    private int tranzactie_produs_id;
    private int tranzactie_id;
    private int produs_id;
    private int cantitate;

    public TranzactieProdus() { }

    public TranzactieProdus(int tranzactie_produs_id, int tranzactie_id, int produs_id, int cantitate) {
        this.tranzactie_produs_id = tranzactie_produs_id;
        this.tranzactie_id = tranzactie_id;
        this.produs_id = produs_id;
        this.cantitate = cantitate;
    }

    public int getTranzactie_produs_id() {return tranzactie_produs_id; }

    public void setTranzactie_produs_id(int tranzactie_produs_id) {this.tranzactie_produs_id = tranzactie_produs_id; }

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
                "tranzactie_produs_id = " + tranzactie_produs_id +
                ", tranzactie_id=" + tranzactie_id +
                ", produs_id=" + produs_id +
                ", cantitate=" + cantitate +
                '}';
    }
}
