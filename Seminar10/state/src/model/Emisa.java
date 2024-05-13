package model;

public class Emisa implements State{
    @Override
    public void schimbaStare(Reteta reteta) {
        reteta.setStare(this);
    }
}
