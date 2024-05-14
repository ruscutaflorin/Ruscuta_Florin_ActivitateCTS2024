package cts.ruscuta.florin.g1095.main;

import cts.ruscuta.florin.g1095.model.Farmacie;
import cts.ruscuta.florin.g1095.model.Reteta;

public class Main {
    public static void main(String[] args) {
        Farmacie farmacie = new Farmacie();

        Reteta reteta1 = new Reteta("Paracetamol", 10);
        Reteta reteta2 = new Reteta("Ibuprofen", 60);
        Reteta reteta3 = new Reteta("Ibuprofen", 30);

        System.out.println("\nProcesare reteta 1:");
        farmacie.procesAchizitieMedicamente(reteta1);

        System.out.println("\nProcesare reteta 2:");
        farmacie.procesAchizitieMedicamente(reteta2);

        System.out.println("\nProcesare reteta 3:");
        farmacie.procesAchizitieMedicamente(reteta3);

    }
}
