package cts.ruscuta.florin.g1095.main;

import cts.ruscuta.florin.g1095.model.Facade;
import cts.ruscuta.florin.g1095.model.Medic;
import cts.ruscuta.florin.g1095.model.Pacient;
import cts.ruscuta.florin.g1095.model.Salon;

public class Main {

    public static void main(String[] args) {
        Pacient pacient = new Pacient("grav", "anaissd");
        Pacient pacient1 = new Pacient("usor", "alonso");
        Pacient pacient2 = new Pacient("grav", "mirelaasd");
        Salon salon = new Salon(25);
        Salon salon2 = new Salon(1);
        Medic medic = new Medic();
        Facade facade = new Facade(medic, salon2);
        verificareRezultat(facade, pacient);
        verificareRezultat(facade, pacient1);
        verificareRezultat(facade, pacient2);
    }

    public static void verificareRezultat(Facade facade, Pacient pacient){
        if(facade.internarePacient(pacient)){
            System.out.println("Internare cu succes");
        }else{
            System.out.println("Neinternat!");
        }
    }
}
