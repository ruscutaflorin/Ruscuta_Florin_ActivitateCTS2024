package cts.ruscuta.florin.g1095.model;

public class Produs implements IProdus{
    private int pret;
    private String denumire;
    private int cantitate;


    public Produs(int pret, String denumire, int cantitate) {
        this.pret = pret;
        this.denumire = denumire;
        this.cantitate = cantitate;
    }

    public int getPret() {
        return pret;
    }

    public void setPret(int pret) {
        this.pret = pret;
    }

    @Override
    public String getDenumire() {
        return denumire;
    }

    @Override
    public int getCantitate() {
        return cantitate;
    }
}
