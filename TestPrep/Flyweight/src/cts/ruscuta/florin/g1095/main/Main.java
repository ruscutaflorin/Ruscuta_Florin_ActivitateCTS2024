package cts.ruscuta.florin.g1095.main;

import cts.ruscuta.florin.g1095.model.Internare;
import cts.ruscuta.florin.g1095.model.Pacient;
import cts.ruscuta.florin.g1095.model.PacientFactory;

public class Main {
    public static void main(String[] args) {
        PacientFactory pacientFactory = new PacientFactory();

        Pacient pacient1 = pacientFactory.getPacient("Ion", "098", "nr. 10");
        Pacient pacient2 = pacientFactory.getPacient("Maria", "754", "nr. 20");
        Pacient pacient3 = pacientFactory.getPacient("Ion", "345", "nr. 10");

        Internare internare1 = new Internare(pacient1, 101, 1, 5);
        Internare internare2 = new Internare(pacient2, 102, 2, 3);
        Internare internare3 = new Internare(pacient3, 103, 3, 7);

        System.out.println(pacient1);
        System.out.println(pacient2);
        System.out.println(pacient3);
        System.out.println(internare3);

        System.out.println("Pacient1 și Pacient3 sunt același obiect: " + (pacient1 == pacient3));
    }
}
