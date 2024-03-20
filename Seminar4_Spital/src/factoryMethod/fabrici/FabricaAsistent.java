package factoryMethod.fabrici;

import factoryMethod.clase.Asistent;
import factoryMethod.clase.PersonalSpital;

public class FabricaAsistent implements FactoryPersonal {
    @Override
    public PersonalSpital createPersonal(String nume, int salariu) {
        return new Asistent(nume, salariu);
    }
}
