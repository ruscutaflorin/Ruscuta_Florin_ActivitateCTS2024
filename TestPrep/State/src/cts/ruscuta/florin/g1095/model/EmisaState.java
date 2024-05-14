package cts.ruscuta.florin.g1095.model;

public class EmisaState implements State{
    @Override
    public void solicitaMedicamente(Reteta reteta) {
        System.out.println("Rețeta a fost solicitată.");
        reteta.setStare(new SolicitataState());
    }

    @Override
    public void cumparaMedicamente(Reteta reteta) {

    }
}
