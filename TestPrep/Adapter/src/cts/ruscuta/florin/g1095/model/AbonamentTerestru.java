package cts.ruscuta.florin.g1095.model;

import java.util.GregorianCalendar;

public class AbonamentTerestru extends CalatorieTerestra {
    private GregorianCalendar perioadaSfarsit;

    public AbonamentTerestru(String cnp, String nume) {
        super(cnp, nume);
        this.perioadaSfarsit = new GregorianCalendar();
    }

    @Override
    public void validareCalatorie() {
        if(perioadaSfarsit.before(new GregorianCalendar())){
            System.out.println("Abonament Acceptat!");
        }else{
            System.out.println("Expirat!");
        }
    }
}
