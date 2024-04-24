package main;

import observer.Client;
import observer.Observer;
import observer.Turist;
import restaurant.Restaurant;
import restaurant.SalaSport;
import restaurant.Subiect;

public class Main {
    public static void main(String[] args) {
        Subiect restaurant = new Restaurant("Piata Romana nr.1");

        Observer client1 = new Client("Andrei");
        Observer client2 = new Client("Flo");
        Observer client3 = new Client("Cosmin");
        Observer client4 = new Client("Alex");

        restaurant.adaugaClient(client1);
        restaurant.adaugaClient(client2);
        restaurant.notificareEveniment("Tomorrowland");

        restaurant.stergeClient(client2);
        restaurant.adaugaClient(client3);
        restaurant.adaugaClient(client4);
        restaurant.notificareMeniuNou();
        restaurant.notificarePretNou();

        Observer turist = new Turist();
        restaurant.adaugaClient(turist);
        restaurant.notificarePretNou();

        SalaSport salaSport = new SalaSport();
        salaSport.adaugaClient(client3);
        salaSport.notificareMeciVolei();
    }
}