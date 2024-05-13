package main;


import model.AchizitieMedicamente;
import model.AchizitiePeBazaDeReteta;
import model.Reteta;

public class Main {
    public static void main(String[] args) {
        Reteta reteta = new Reteta(1);
        reteta.adaugaMedicament("Paracetamol");
        reteta.adaugaMedicament("Nurofen");

        AchizitieMedicamente achizitieReteta = new AchizitiePeBazaDeReteta(reteta);
        achizitieReteta.achizitioneazaMedicamente();
    }
}
