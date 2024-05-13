package cts.ruscuta.florin.g1095.main;

import cts.ruscuta.florin.g1095.decorator.DiscountDecorator;
import cts.ruscuta.florin.g1095.model.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        IClient client = new Client("Bucuresti", "John Doe", "john@example.com");
        Produs produs = new Produs(10, "Ciocolata", 5);
        Produs produs1 = new Produs(20, "Apa", 5);
        Produs produs2 = new Produs(30, "Cola", 5);
        Produs produs3 = new Produs(40, "Copac", 5);

        List<Produs> produse = List.of(produs1, produs2, produs);
        ICosCumparaturi cos = new Cos(produse);
        ICosCumparaturi cos2 = new Cos(produse);
        List<Produs> produse2 = List.of(produs, produs3);

        ICosCumparaturi cos3 = new Cos(produse2);
        IMagazin magazin = new Magazin();
        IMagazin decoratedMagazin = new DiscountDecorator(magazin);

        double totalCost = decoratedMagazin.getTotal(cos, client);
        double totalCost2 = decoratedMagazin.getTotal(cos2, client);
        double totalCost3 = decoratedMagazin.getTotal(cos3, client);
        System.out.println("Total cost including discount on first comand: " + totalCost + "\nsecond, " + totalCost2 + "\nthird, " + totalCost3);
    }
}
