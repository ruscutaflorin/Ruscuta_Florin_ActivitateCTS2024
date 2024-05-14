package cts.ruscuta.florin.g1095.model;

public class AdapterCalatorie extends CalatorieTerestra{
    private CalatorieSubteran calatorieMetrou;

    public AdapterCalatorie(String cnp, String nume) {
        super(cnp, nume);
    }

    public AdapterCalatorie(CalatorieSubteran calatorie) {
        super(calatorie.getNumeClient(), calatorie.getCnp());
        this.calatorieMetrou = calatorie;
    }

    @Override
    public void validareCalatorie() {
        if(this.calatorieMetrou.esteValid()){
            System.out.println("Acces Permis!");
        }else{
            System.out.println("Acces Respins!");
        }
    }
}
