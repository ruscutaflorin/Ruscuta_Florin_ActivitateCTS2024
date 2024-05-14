package cts.ruscuta.florin.g1095.main;

import cts.ruscuta.florin.g1095.model.Client;
import cts.ruscuta.florin.g1095.payment.BankPayment;
import cts.ruscuta.florin.g1095.payment.CardPayment;

public class Main {
    public static void main(String[] args) {
        Client client = new Client("John Doe");

        client.platesteComanda("Comanda 123", 100.0, new CardPayment());

        client.platesteComanda("Comanda 456", 150.0, new BankPayment());
    }
}
