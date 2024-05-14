package cts.ruscuta.florin.g1095.model;

public class Pacient {
    private String stare;
    private String nume;


    public Pacient(String stare, String nume){
        this.stare = stare;
        this.nume = nume;
    }

    public String getStare() {
        return stare;
    }

    public void setStare(String stare) {
        this.stare = stare;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

}
