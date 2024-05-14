package cts.ruscuta.florin.g1095.model;

public class Salon {
    private int paturiLibere;
    public Salon(int paturi){
        paturiLibere = paturi;
    }
    public boolean verificaDisponibilitatePat() {
        return paturiLibere > 0;
    }

    public void ocupaPat() {
        paturiLibere--;
    }

    public void elibereazaPat() {
        paturiLibere++;
    }
}
