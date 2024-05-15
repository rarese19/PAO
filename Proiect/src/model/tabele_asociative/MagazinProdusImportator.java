package model.tabele_asociative;

public class MagazinProdusImportator {
    private int magazin_id;
    private int produs_id;
    private int importator_id;
    private int cantitate;

    public MagazinProdusImportator() { }

    public MagazinProdusImportator(int magazin_id, int produs_id, int importator_id, int cantitate) {
        this.magazin_id = magazin_id;
        this.produs_id = produs_id;
        this.importator_id = importator_id;
        this.cantitate = cantitate;
    }

    public int getMagazin_id() {
        return magazin_id;
    }

    public void setMagazin_id(int magazin_id) {
        this.magazin_id = magazin_id;
    }

    public int getProdus_id() {
        return produs_id;
    }

    public void setProdus_id(int produs_id) {
        this.produs_id = produs_id;
    }

    public int getImportator_id() {
        return importator_id;
    }

    public void setImportator_id(int importator_id) {
        this.importator_id = importator_id;
    }

    public int getCantitate() {
        return cantitate;
    }

    public void setCantitate(int cantitate) {
        this.cantitate = cantitate;
    }

    @Override
    public String toString() {
        return "Magazin_Produs_Importator{" +
                "magazin_id=" + magazin_id +
                ", produs_id=" + produs_id +
                ", importator_id=" + importator_id +
                ", cantitate=" + cantitate +
                '}';
    }
}
