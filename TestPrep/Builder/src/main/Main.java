package main;

import classes.Fotbalist;
import classes.FotbalistBuilder;

public class Main {
    public static void main(String[] args) {
        FotbalistBuilder obj = new FotbalistBuilder();
        Fotbalist sandy = obj.setNume("Sandu").build();
        System.out.println(sandy);

        FotbalistBuilder obj1 = new FotbalistBuilder();
        Fotbalist tudor = obj1.setNume("Tudor").build();
        System.out.println(tudor);


    }
}
