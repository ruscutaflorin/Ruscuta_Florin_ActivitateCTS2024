package cts.ruscuta.florin.g1095.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class Magazin implements IMagazin{
    Map<String, Double> produse;
    List<IClient> emailClients;
    List<IClient> phoneClients;

    public Magazin() {
        produse = new HashMap<>();
        phoneClients = new ArrayList<>();
        emailClients = new ArrayList<>();
        produse.put("Cola", 1d);
        produse.put("Fanta", 2d);
        produse.put("Sprite", 10d);
        produse.put("PopCola", 5d);
    }

    public void subscribeToPhoneNotifications(IClient client) {
        phoneClients.add(client);
    }

    public void subscribeToEmailNotifications(IClient client) {
        emailClients.add(client);
    }

    public void unsubscribeToPhoneNotifications(IClient client) {
        phoneClients.remove(client);
    }

    public void unsubscribeToEmailNotifications(IClient client) {
        emailClients.remove(client);
    }
    public void notifyEmail(String mesaj) {
        System.out.println("Notificare clienti prin email:");
        for (IClient client : emailClients) {
            client.notifica(mesaj);
        }
    }

    public void notifyPhone(String mesaj) {
        System.out.println("Notificare clienti prin telefon:");
        for (IClient client : phoneClients) {
            client.notifica(mesaj);
        }
    }
}
