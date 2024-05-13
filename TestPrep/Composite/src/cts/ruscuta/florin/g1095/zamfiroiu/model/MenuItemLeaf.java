package cts.ruscuta.florin.g1095.zamfiroiu.model;

public class MenuItemLeaf implements MenuItem {
    private String denumire;

    public MenuItemLeaf(String denumire) {
        this.denumire = denumire;
    }

    public String getDenumire() {
        return denumire;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    @Override
    public void display() {
        System.out.println(denumire);
    }
}
