package main;

import classes.BancaNationalaRegistry;

public class Main {
    public static void main(String[] args) {
        BancaNationalaRegistry obj = BancaNationalaRegistry.getInstance();
        obj.adaugaBanca("Romania", 2);
        System.out.println(obj);
    }
}
