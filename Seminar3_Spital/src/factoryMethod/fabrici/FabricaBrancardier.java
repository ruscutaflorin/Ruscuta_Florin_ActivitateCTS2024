package factoryMethod.fabrici;

import factoryMethod.clase.Brancardier;
import factoryMethod.clase.PersonalSpital;

public class FabricaBrancardier implements FactoryPersonal{
    @Override
    public PersonalSpital createPersonal(String nume, int salariu) {
        return new Brancardier(nume, salariu);
    }
}
