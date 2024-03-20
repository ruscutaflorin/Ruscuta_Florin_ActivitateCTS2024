package factoryMethod.main;

import factoryMethod.clase.PersonalSpital;
import factoryMethod.fabrici.FabricaAsistent;
import factoryMethod.fabrici.FabricaInfirmier;
import factoryMethod.fabrici.FabricaMedic;
import factoryMethod.fabrici.FactoryPersonal;

public class Main {
    public static void main(String[] args) {
        FactoryPersonal obj = new FabricaAsistent();
        FactoryPersonal obj1 = new FabricaMedic();
        FactoryPersonal obj2 = new FabricaInfirmier();
        procesareAngajat(obj, "flo", 123);
        procesareAngajat(obj1, "rares", 321);
        procesareAngajat(obj2, "alex", 7300);
    }

    public static void procesareAngajat(FactoryPersonal obj, String nume, int salariu){
        PersonalSpital angajat = obj.createPersonal(nume, salariu);
        angajat.afisare();
    }
}
