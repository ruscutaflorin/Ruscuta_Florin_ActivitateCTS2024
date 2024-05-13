package cts.ruscuta.florin.g1095.model;

public class Client implements IClient{
    private String adresa;
    private String nume;
    private String email;


    public Client(String adresa, String nume, String email) {
        this.adresa = adresa;
        this.nume = nume;
        this.email = email;
    }

    @Override
    public String getAdresa() {
        return adresa;
    }

    @Override
    public String getNume() {
        return nume;
    }

    @Override
    public String getEmail() {
        return email;
    }
}
