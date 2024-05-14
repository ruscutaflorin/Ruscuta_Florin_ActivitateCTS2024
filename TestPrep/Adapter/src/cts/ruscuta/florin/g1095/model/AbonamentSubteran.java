package cts.ruscuta.florin.g1095.model;

import java.util.GregorianCalendar;

public class AbonamentSubteran extends CalatorieSubteran{
    private GregorianCalendar dataExpirareAbonament;
    public AbonamentSubteran(String numeClient, String cnp) {
        super(numeClient, cnp);
        this.dataExpirareAbonament=new GregorianCalendar();
    }
    @Override
    public boolean esteValid() {
        return this.dataExpirareAbonament.before(new GregorianCalendar());
    }
}
