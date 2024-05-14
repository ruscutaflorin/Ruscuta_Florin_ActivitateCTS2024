package cts.ruscuta.florin.g1095.main;

import cts.ruscuta.florin.g1095.model.Client;
import cts.ruscuta.florin.g1095.model.Medicament;
import cts.ruscuta.florin.g1095.model.ProxyFarmacie;

public class Main {
    public static void main(String[] args) {
        Medicament farmacieProxy = new ProxyFarmacie();
        Client client1 = new Client("flo", true, "Paracetamol");
        Client client2 = new Client("marian", false, "Ibuprofen");
        Client client3 = new Client("gabi", true, "Aspirina");

        client1.incearcaSaCumpereMedicament(farmacieProxy);
        client2.incearcaSaCumpereMedicament(farmacieProxy);
        client3.incearcaSaCumpereMedicament(farmacieProxy);
    }
}
