package main;

import model.Reteta;

public class Main {
    public static void main(String[] args) {
        Reteta reteta = new Reteta(1234,5);

        reteta.cumparaMedicamente();

        reteta.solicitaMedicamente();
        reteta.respingeAchizitie();
        reteta.solicitaMedicamente();
        reteta.solicitaMedicamente();
        reteta.cumparaMedicamente();
    }
}