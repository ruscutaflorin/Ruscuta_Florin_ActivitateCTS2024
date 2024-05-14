package cts.ruscuta.florin.g1095.model;

public class Reteta {
    private String numeMedicament;
    private int cantitate;

    public Reteta(String numeMedicament, int cantitate) {
        this.numeMedicament = numeMedicament;
        this.cantitate = cantitate;
    }
    public String getNumeMedicament() {
        return numeMedicament;
    }

    public int getCantitate() {
        return cantitate;
    }
}
