package interfaces.ex3.meserii;

import interfaces.ex3.persoane.Om;

public class AbstractContabil implements Om {
    private String nume = null;

    private int varsta = 0;

    private String poateLucra = null;

    @Override
    public String getNume() {
        return this.nume;
    }

    @Override
    public int getVarsta() {
        return this.varsta;
    }

    @Override
    public String getPoateLucra() {
        return this.poateLucra;
    }

    @Override
    public void setNume(String nume) {
        this.nume = nume;
    }

    @Override
    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    @Override
    public void setPoateLucra(String poateLucra) {
        this.poateLucra = poateLucra;
    }
}
