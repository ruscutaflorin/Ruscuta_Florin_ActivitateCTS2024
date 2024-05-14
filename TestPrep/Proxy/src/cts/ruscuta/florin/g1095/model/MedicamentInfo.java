package cts.ruscuta.florin.g1095.model;

public class MedicamentInfo {
    private String nume;
    private int cantitate;

    public MedicamentInfo(String nume, int cantitate) {
        this.nume = nume;
        this.cantitate = cantitate;
    }

    public String getNume() {
        return nume;
    }

    public int getCantitate() {
        return cantitate;
    }

    public void scadeCantitatea(int cantitate) {
        this.cantitate -= cantitate;
    }
}
