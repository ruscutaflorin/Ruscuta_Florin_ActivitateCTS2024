package cts.ruscuta.florin.g1095.model;

import cts.ruscuta.florin.g1095.payment.PaymentService;

public class Client implements IClient{
    private String nume;

    public Client(String nume) {
        this.nume = nume;
    }

    @Override
    public String getNume() {
        return nume;
    }

    @Override
    public void notifica(String mesaj) {
    }

    @Override
    public void platesteComanda(String comanda, double total, PaymentService paymentService) {
        paymentService.pay(total);
    }
}
