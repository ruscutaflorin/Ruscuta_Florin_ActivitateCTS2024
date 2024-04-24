package observer;

public class Turist implements Observer{

    @Override
    public void primesteNotificari(String mesaj) {
        System.out.println("Turistul a primit mesajul " + mesaj);
    }
}