package cts.ruscuta.florin.g1095.zamfiroiu.model;

import java.util.ArrayList;
import java.util.List;

public class MenuSection implements MenuItem{
    private String denumire;
    private List<MenuItem> items;

    public MenuSection(String denumire) {
        this.denumire = denumire;
        items = new ArrayList<>();
    }

    @Override
    public void display() {
        System.out.println("Section, " + denumire + ": ");
        for(var i : items){
            i.display();
        }
    }

    public void add(MenuItem item){
        items.add(item);
    }

    public void remove(MenuItem item) {
        items.remove(item);
    }

}
