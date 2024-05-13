package model;

public class Achizitionata implements State{
    @Override
    public void schimbaStare(Reteta reteta) {
        reteta.setStare(this);
    }
}