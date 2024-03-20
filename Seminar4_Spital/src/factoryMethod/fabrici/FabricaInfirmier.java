package factoryMethod.fabrici;

import factoryMethod.clase.Infirmier;
import factoryMethod.clase.PersonalSpital;

public class FabricaInfirmier implements FactoryPersonal{
    @Override
    public PersonalSpital createPersonal(String nume, int salariu) {
        return new Infirmier(nume, salariu);
    }
}
