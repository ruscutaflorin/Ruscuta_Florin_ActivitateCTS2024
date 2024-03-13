package factoryMethod.fabrici;

import factoryMethod.clase.Medic;
import factoryMethod.clase.PersonalSpital;

public class FabricaMedic implements FactoryPersonal{
    @Override
    public PersonalSpital createPersonal(String nume, int salariu) {
        return new Medic(nume, salariu);
    }
}
