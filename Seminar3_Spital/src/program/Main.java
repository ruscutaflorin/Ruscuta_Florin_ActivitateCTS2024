package program;

import clase.FactoryPersonal;
import clase.PersonalSpital;
import clase.TipPersonal;

public class Main {
    public static void main(String[] args) {
        FactoryPersonal obj = new FactoryPersonal();
        PersonalSpital medic = obj.createPersonal(TipPersonal.MEDIC, "Florin", 5000, 15);
        medic.afisare();
        PersonalSpital asistent = obj.createPersonal(TipPersonal.ASISTENT, "Sandy", 10000, 0);
        asistent.afisare();

    }
}
