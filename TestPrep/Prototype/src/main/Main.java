package main;

import classes.Prototype;
import classes.Reteta;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> cv = new ArrayList<>();
        cv.add("Florin");
        cv.add("Tudor");
        Reteta obj = new Reteta("reteta 1", 2, cv);
        System.out.println(obj);
        Prototype opj2 = obj.clone();
        System.out.println(opj2);
    }
}
