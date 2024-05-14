package cts.ruscuta.florin.g1095.main;

import cts.ruscuta.florin.g1095.model.*;

public class Main {
    public static void main(String[] args) {
        CalatorieTerestra abonamentStb = new AbonamentTerestru("5020", "Florin");
        CalatorieTerestra stb = new OnlineTicketTerestru("5021", "Cos", 23);
        CalatorieSubteran abonamentMetrou = new AbonamentSubteran("adi", "50234223");
        CalatorieSubteran metrou = new OnlineTicketSubteran("matei", "23213", 21);
        CalatorieTerestra biletMixt = new AdapterCalatorie(abonamentMetrou);
        System.out.println(abonamentMetrou.esteValid());
        abonamentStb.validareCalatorie();
        biletMixt.validareCalatorie();
    }
}
