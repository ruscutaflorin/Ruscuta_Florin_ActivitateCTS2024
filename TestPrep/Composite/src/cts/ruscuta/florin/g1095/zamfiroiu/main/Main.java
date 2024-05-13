package cts.ruscuta.florin.g1095.zamfiroiu.main;

import cts.ruscuta.florin.g1095.zamfiroiu.model.MenuItemLeaf;
import cts.ruscuta.florin.g1095.zamfiroiu.model.MenuSection;

public class Main {
    public static void main(String[] args) {
        MenuSection menu = new MenuSection("Menu");

        MenuSection starters = new MenuSection("Starters");
        starters.add(new MenuItemLeaf("Salad"));
        starters.add(new MenuItemLeaf("Soup"));
        menu.add(starters);

        MenuSection drinks = new MenuSection("Drinks");
        MenuSection juices = new MenuSection("Juices");
        juices.add(new MenuItemLeaf("Orange Juice"));
        juices.add(new MenuItemLeaf("Apple Juice"));
        drinks.add(juices);
        drinks.add(new MenuItemLeaf("Water"));
        menu.add(drinks);

        menu.display();
    }
}
