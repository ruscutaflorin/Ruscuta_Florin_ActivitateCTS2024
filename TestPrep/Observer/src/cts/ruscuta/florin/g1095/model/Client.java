package cts.ruscuta.florin.g1095.model;


public class Client implements IClient{
    private String nume;
    public Client(String nume){
        this.nume = nume;
    }
    @Override
    public String getNume() {
        return nume;
    }

    @Override
    public void notifica(String mesaj) {
        System.out.println("Clientul " + nume + " a primit mesajul: " + mesaj);
    }

    @Override
    public void platesteComanda(String comanda, double total) {
        System.out.println("Comanda " + comanda + " in valoare de " + total + " a fost platita");
    }
}
