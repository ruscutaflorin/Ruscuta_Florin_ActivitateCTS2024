package cts.ruscuta.florin.g1095.model;

public class SolicitataState implements State{
    @Override
    public void solicitaMedicamente(Reteta reteta) {
        System.out.println("Rețeta a fost deja solicitată.");
    }

    @Override
    public void cumparaMedicamente(Reteta reteta) {
        System.out.println("Medicamentele au fost achiziționate.");
        reteta.setStare(new AchizitionataState());
    }
}
