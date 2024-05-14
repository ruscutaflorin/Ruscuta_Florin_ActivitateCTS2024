package cts.ruscuta.florin.g1095.model;

public class AchizitionataState implements State {
    @Override
    public void solicitaMedicamente(Reteta reteta) {
        System.out.println("Medicamentele au fost deja achiziționate. Nu se poate solicita din nou.");
    }

    @Override
    public void cumparaMedicamente(Reteta reteta) {
        System.out.println("Medicamentele au fost deja achiziționate.");
    }
}
