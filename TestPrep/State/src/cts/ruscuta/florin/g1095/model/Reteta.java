package cts.ruscuta.florin.g1095.model;

public class Reteta {
    private State stare;
    public Reteta(){
        this.stare = new EmisaState();
    }
    public void setStare(State stare) {
        this.stare = stare;
    }

    public void solicitaMedicamente(){
        stare.solicitaMedicamente(this);
    }

    public void cumparaMedicamente(){
        stare.cumparaMedicamente(this);
    }
}
