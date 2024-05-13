package cts.ruscuta.florin.g1095.zurini.model;

import java.util.ArrayList;
import java.util.List;

public class CategorieProduse implements IProdus {
    private String denumire;
    private List<IProdus> produse = new ArrayList<>();

    public CategorieProduse(String denumire) {
        this.denumire = denumire;
    }

    public void adaugaProdus(IProdus produs) {
        produse.add(produs);
    }

    public void stergeProdus(IProdus produs) {
        produse.remove(produs);
    }

    public List<IProdus> getProduse() {
        return produse;
    }

    @Override
    public String getDenumire() {
        return denumire;
    }

    @Override
    public int getCantitate() {
        int totalCantitate = 0;
        for (IProdus produs : produse) {
            totalCantitate += produs.getCantitate();
        }
        return totalCantitate;
    }
}
