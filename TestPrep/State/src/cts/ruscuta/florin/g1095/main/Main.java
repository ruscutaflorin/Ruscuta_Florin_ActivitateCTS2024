package cts.ruscuta.florin.g1095.main;

import cts.ruscuta.florin.g1095.model.Reteta;

public class Main {
    public static void main(String[] args) {
        Reteta reteta = new Reteta();
        System.out.println("Stare inițiala: Emisa");
        reteta.solicitaMedicamente();
        reteta.cumparaMedicamente();

        reteta.solicitaMedicamente();
        reteta.cumparaMedicamente();
    }
}
