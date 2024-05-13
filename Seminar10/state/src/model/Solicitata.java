package model;

public class Solicitata implements State{
    @Override
    public void schimbaStare(Reteta reteta) {
        reteta.setStare(this);
    }
}
