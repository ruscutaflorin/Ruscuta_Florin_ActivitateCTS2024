package cts.ruscuta.florin.g1095.model;

import java.util.HashMap;
import java.util.Map;

public class PacientFactory {
    private Map<String, Pacient> pacienti;

    public PacientFactory() {
        this.pacienti = new HashMap<>();
    }

    public Pacient getPacient(String nume, String numarTelefon, String adresa) {
        String key = nume + numarTelefon + adresa;
        if (!pacienti.containsKey(key)) {
            pacienti.put(key, new Pacient(nume, numarTelefon, adresa));
        }
        return pacienti.get(key);
    }
}
