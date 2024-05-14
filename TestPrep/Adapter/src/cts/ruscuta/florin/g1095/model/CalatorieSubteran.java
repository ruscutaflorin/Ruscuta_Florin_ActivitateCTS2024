package cts.ruscuta.florin.g1095.model;

public abstract class CalatorieSubteran {
    private String numeClient;
    private String cnp;

    public CalatorieSubteran(String numeClient, String cnp) {
        this.numeClient = numeClient;
        this.cnp = cnp;
    }

    public String getNumeClient() {
        return numeClient;
    }

    public void setNumeClient(String numeClient) {
        this.numeClient = numeClient;
    }

    public String getCnp() {
        return cnp;
    }

    public void setCnp(String cnp) {
        this.cnp = cnp;
    }
    public abstract boolean esteValid();
}
