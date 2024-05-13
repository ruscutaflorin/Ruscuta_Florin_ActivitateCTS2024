package model;

import java.util.ArrayList;
import java.util.List;

public class Reteta {
    private int nrReteta;
    private List<String> medicamente;

    public Reteta(int nrReteta) {
        this.nrReteta = nrReteta;
        medicamente = new ArrayList<>();
    }

    public void adaugaMedicament(String medicament){
        medicamente.add(medicament);
    }

    public List<String> getMedicamente() {
        return medicamente;
    }

    public int getNrReteta() {
        return nrReteta;
    }
}