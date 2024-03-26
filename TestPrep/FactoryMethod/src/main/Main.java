package main;

import classes.Supe;
import fabrici.FactorySupaVita;
import fabrici.FactorySupe;

public class Main {
    public static void main(String[] args) {
        FactorySupe obj = new FactorySupaVita();
        Supe vita = obj.creeazaSupe(15, 250);
        vita.afisare();
    }
}
