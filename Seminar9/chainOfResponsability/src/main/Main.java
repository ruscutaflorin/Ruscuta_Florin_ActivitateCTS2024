package main;

import clase.Client;

public class Main {
    public static void main(String[] args) {
        Client client = new Client("Ovidel");
        client.realizeazaPlata(20);
        client.realizeazaPlata(20);
        client.realizeazaPlata(80);
    }
}