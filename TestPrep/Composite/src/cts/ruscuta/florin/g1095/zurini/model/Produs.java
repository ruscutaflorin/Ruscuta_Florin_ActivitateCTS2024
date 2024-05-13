package cts.ruscuta.florin.g1095.zurini.model;

public class Produs implements IProdus{
    private String denumire;
    private int cantitate;

    public Produs(String denumire, int cantitate) {
        this.denumire = denumire;
        this.cantitate = cantitate;
    }

    @Override
    public String getDenumire() {
        return denumire;
    }

    @Override
    public int getCantitate() {
        return cantitate;
    }

    @Override
    public String toString() {
        return "Produs{" +
                "denumire='" + denumire + '\'' +
                ", cantitate=" + cantitate +
                '}';
    }
}
