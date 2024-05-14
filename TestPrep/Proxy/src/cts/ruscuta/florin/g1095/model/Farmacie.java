package cts.ruscuta.florin.g1095.model;

import java.util.HashMap;
import java.util.Map;

public class Farmacie implements Medicament{

    private Map<String, MedicamentInfo> medicamente;

    public Farmacie() {
        medicamente = new HashMap<>();
        medicamente.put("Paracetamol", new MedicamentInfo("Paracetamol", 34));
        medicamente.put("Ibuprofen", new MedicamentInfo("Ibuprofen", 44));
    }

    @Override
    public void cumparaMedicament(String cnp, String numeMedicament, boolean areReteta) {
        MedicamentInfo medicament = medicamente.get(numeMedicament);
        if (medicament != null && medicament.getCantitate() > 0){
            medicament.scadeCantitatea(1);
            System.out.println(cnp + " a achiziționat medicamentul " + numeMedicament);
        }else {
            System.out.println("Medicamentul " + numeMedicament + " nu este disponibil.");
        }
    }
}
