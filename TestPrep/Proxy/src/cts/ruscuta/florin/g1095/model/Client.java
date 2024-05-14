package cts.ruscuta.florin.g1095.model;

public class Client {
    private String nume;
    private boolean areReteta;
    private String numeMedicament;

    public Client(String nume, boolean areReteta, String numeMedicament) {
        this.nume = nume;
        this.areReteta = areReteta;
        this.numeMedicament = numeMedicament;
    }

    public String getNume() {
        return nume;
    }

    public boolean isAreReteta() {
        return areReteta;
    }

    public String getNumeMedicament() {
        return numeMedicament;
    }

    public void incearcaSaCumpereMedicament(Medicament medicament) {
        medicament.cumparaMedicament(this.nume, this.numeMedicament, this.areReteta);
    }
}
