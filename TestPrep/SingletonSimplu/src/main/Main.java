package main;

import classes.Fotbalist;

public class Main {
    public static void main(String[] args) {
        Fotbalist obj = Fotbalist.getInstance("florin", 2, true);
        Fotbalist obj1 = Fotbalist.getInstance("cosmin", 3, false);
        System.out.println(obj + " " + obj1);
    }
}
