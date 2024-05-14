package cts.ruscuta.florin.g1095.model;

public class Internare {
    private Pacient pacient;
    private int numarSalon;
    private int numarPat;
    private int numarZileSpitalizare;

    public Internare(Pacient pacient, int numarSalon, int numarPat, int numarZileSpitalizare) {
        this.pacient = pacient;
        this.numarSalon = numarSalon;
        this.numarPat = numarPat;
        this.numarZileSpitalizare = numarZileSpitalizare;
    }

    @Override
    public String toString() {
        return "Internare{" +
                "pacient=" + pacient +
                ", numarSalon=" + numarSalon +
                ", numarPat=" + numarPat +
                ", numarZileSpitalizare=" + numarZileSpitalizare +
                '}';
    }
}
