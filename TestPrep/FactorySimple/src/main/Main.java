package main;

import classes.FactorySupa;
import classes.Supe;
import classes.TipSupa;

public class Main {
    public static void main(String[] args) {
        FactorySupa obj = new FactorySupa();
        Supe supa = obj.creareSupa(TipSupa.VITA, 23, 540);
        supa.afisare();
    }
}
