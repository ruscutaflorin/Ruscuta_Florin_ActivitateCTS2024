package factoryMethod.fabrici;

import factoryMethod.clase.PersonalSpital;

public interface FactoryPersonal {
    public PersonalSpital createPersonal(String nume, int salariu);
}
