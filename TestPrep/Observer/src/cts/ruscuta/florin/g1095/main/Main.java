package cts.ruscuta.florin.g1095.main;

import cts.ruscuta.florin.g1095.model.Client;
import cts.ruscuta.florin.g1095.model.IClient;
import cts.ruscuta.florin.g1095.model.Magazin;
import cts.ruscuta.florin.g1095.model.MagazinConcret;
import cts.ruscuta.florin.g1095.observer.EmailNotificationService;
import cts.ruscuta.florin.g1095.observer.SMSNotificationService;

public class Main {
    public static void main(String[] args) {
        IClient client1 = new Client("Andrei");
        IClient client2 = new Client("Mihai");

        Magazin magazin = new MagazinConcret();
        magazin.subscribeToEmailNotifications(client1);
        magazin.subscribeToEmailNotifications(client2);
        magazin.subscribeToPhoneNotifications(client2);
        magazin.modificaPret(20,"Cola");
        magazin.modificaPret(20,"Ciocolata");
    }
}
