package cts.ruscuta.florin.g1095.model;

public class ProxyFarmacie implements Medicament{
    private Farmacie farmacie;
    public ProxyFarmacie(){
        this.farmacie = new Farmacie();
    }
    @Override
    public void cumparaMedicament(String cnp, String nume, boolean areReteta) {
        if (areReteta) {
            farmacie.cumparaMedicament(cnp, nume, areReteta);
        } else {
            System.out.println("Clientul " + cnp + " nu poate achiziționa medicamente fără rețetă.");
        }
    }
}
