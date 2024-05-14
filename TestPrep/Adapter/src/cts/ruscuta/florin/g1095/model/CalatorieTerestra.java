package cts.ruscuta.florin.g1095.model;

public abstract class CalatorieTerestra {
    private String cnp;
    private String nume;

    public CalatorieTerestra(String cnp, String nume) {
        this.cnp = cnp;
        this.nume = nume;
    }

    public String getCnp() {
        return cnp;
    }

    public void setCnp(String cnp) {
        this.cnp = cnp;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public abstract void validareCalatorie();
}
