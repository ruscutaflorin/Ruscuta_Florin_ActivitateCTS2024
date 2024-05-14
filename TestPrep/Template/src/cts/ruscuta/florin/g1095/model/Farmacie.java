package cts.ruscuta.florin.g1095.model;

import java.util.HashMap;
import java.util.Map;

public class Farmacie extends FarmacieTemplate{
    private Map<String, Integer> stocMedicamente;

    public Farmacie() {
        stocMedicamente = new HashMap<>();
        stocMedicamente.put("Paracetamol", 100);
        stocMedicamente.put("Ibuprofen", 50);
    }

    @Override
    protected void primesteReteta(Reteta reteta) {
        System.out.println("Reteta a fost primita pentru medicamentul: " + reteta.getNumeMedicament());
    }

    @Override
    protected boolean verificaStoc(Reteta reteta) {
        String medicament = reteta.getNumeMedicament();
        int cantitateNecesara = reteta.getCantitate();
        if (stocMedicamente.containsKey(medicament) && stocMedicamente.get(medicament) >= cantitateNecesara) {
            System.out.println("Stocul este suficient pentru medicamentul: " + medicament);
            return true;
        } else {
            System.out.println("Stocul nu este suficient pentru medicamentul: " + medicament);
            return false;
        }
    }

    @Override
    protected void aduceMedicamente() {
        System.out.println("Medicamentele sunt aduse din depozit.");
    }

    @Override
    protected void incaseazaBanii() {
        System.out.println("Banii au fost incasati.");
    }

    @Override
    protected void scadeDinStoc(Reteta reteta) {
        String medicament = reteta.getNumeMedicament();
        int cantitateNecesara = reteta.getCantitate();
        stocMedicamente.put(medicament, stocMedicamente.get(medicament) - cantitateNecesara);
        System.out.println("Stocul a fost actualizat pentru medicamentul: " + medicament);
    }

    @Override
    protected void emiteBon() {
        System.out.println("Bonul fiscal a fost emis.");
    }

    @Override
    protected void refuzaAchizitia() {
        System.out.println("Achizitia a fost refuzata din cauza stocului insuficient.");
    }
}
