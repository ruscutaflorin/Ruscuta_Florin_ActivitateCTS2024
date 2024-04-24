package restaurant;

import observer.Observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Subiect {
    List<Observer> observerList;

    public Subiect() {
        this.observerList = new ArrayList<>();
    }

    public void adaugaClient(Observer observer){
        observerList.add(observer);
    }

    public void stergeClient(Observer observer){
        observerList.remove(observer);
    }

    protected void notificaClienti(String mesaj){
        for(Observer observer: observerList){
            observer.primesteNotificari(mesaj);
        }
    }

    public abstract void  notificareMeniuNou();
    public abstract void  notificarePretNou();
    public abstract void  notificareEveniment(String data);
}