package main;

import model.Card;
import model.Cash;
import model.Client;

public class Main {
    public static void main(String[] args) {
        Client client = new Client("Sorinel");
        client.realizeazaPlata(100);
        client.setModPlata(new Cash());
        client.realizeazaPlata(50);


    }
}