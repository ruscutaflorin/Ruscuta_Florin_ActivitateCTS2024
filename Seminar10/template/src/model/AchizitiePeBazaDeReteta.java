package model;

public class AchizitiePeBazaDeReteta extends AchizitieMedicamente {

    private Reteta reteta;

    public AchizitiePeBazaDeReteta(Reteta reteta) {
        this.reteta = reteta;
    }

    @Override
    public void primesteReteta() {
        System.out.println("A fost primita reteta cu numarul " + reteta.getNrReteta());
    }

    @Override
    public boolean verificaStoc() {
        for (String medicament : reteta.getMedicamente()) {
            if (!super.stocuri.containsKey(medicament)){
                System.out.println("Medicamentul " + medicament + " nu este in stoc");
                return false;
            }
        }
        System.out.println("Medicamentele se afla in stoc");
        return true;
    }

    @Override
    public void aducereMedicamente() {
        System.out.println("Medicamentele suntn aduse din depozit");
        for (String medicament : reteta.getMedicamente()) {
            int stoc = super.stocuri.get(medicament);
            super.stocuri.replace(medicament, --stoc);
        }
    }

    @Override
    public void incaseaza() {
        System.out.println("A fost incasata reteta");
    }

    @Override
    public void emitereBon() {
        System.out.println("A fost emis bonul pentru reteta "  + reteta.getNrReteta() );
    }

    @Override
    public void respingeAchizitie() {
        System.out.println("Medicamentele nu sunt disponibile");
    }
}
