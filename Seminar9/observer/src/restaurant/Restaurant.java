package restaurant;

public class Restaurant extends Subiect {
    private String adresa;

    public Restaurant(String adresa) {
        this.adresa = adresa;
    }

    @Override
    public void notificareMeniuNou() {
        notificaClienti("Restaurantul de la adresa " + adresa + " si-a schimbat meniul  ");
    }

    @Override
    public void notificarePretNou() {
        notificaClienti("Restaurantul de la adresa " + adresa + " are o oferta de pret ");

    }

    @Override
    public void notificareEveniment(String data) {
        notificaClienti("Restaurantul de la adresa " + adresa + " are un eveniment pe data de " + data);
    }
}