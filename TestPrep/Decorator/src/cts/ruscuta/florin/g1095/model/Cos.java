package cts.ruscuta.florin.g1095.model;

import java.util.List;

public class Cos implements ICosCumparaturi{

    private List<Produs> produse;

    public Cos(List<Produs> produse) {
        this.produse = produse;
    }

    public void adaugaProdus(Produs produs){
        produse.add(produs);
    }

    @Override
    public double getTotal() {
        double total = 0;
        for (Produs produs : produse) {
            total += produs.getCantitate() * produs.getPret();
        }
        return total;
    }
}
