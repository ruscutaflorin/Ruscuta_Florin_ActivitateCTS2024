package clase;

public class FactoryPersonal {
    public PersonalSpital createPersonal(TipPersonal tipPersonal, String nume, int salariu, int vechime){
        switch(tipPersonal){
            case BRANCARDIER: return new Brancardier(nume, salariu);
            case ASISTENT: return new Asistent(nume, salariu);
            case MEDIC: return new Medic(nume, salariu, vechime);
            case INFIRMIER: return new Infirmier(nume, salariu);
            default: throw new RuntimeException("Exception");
        }
    }
}
