package main;

import decorator.BiletSarbatori;
import decorator.Decorator;
import model.Bilet;
import model.BiletAbstract;
import decorator.BiletAniversareSTB;

public class Main {
    public static void main(String[] args) {
        BiletAbstract bilet = new Bilet(30,"adasdc");
        printareBilet(bilet);

        Decorator decorator = new BiletSarbatori(bilet);
        decorator.reducerePret();
        printareBilet(decorator);

        Decorator decorator1 = new BiletAniversareSTB(decorator);
        printareBilet(decorator1);
    }
    public static void printareBilet(BiletAbstract bilet){
        bilet.printare();
    }
}
