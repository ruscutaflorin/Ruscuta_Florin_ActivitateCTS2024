package decorator;

import model.Bilet;
import model.BiletAbstract;

public class BiletSarbatori extends Decorator{
    private static int discount=10;
    public BiletSarbatori(BiletAbstract bilet) {
        super(bilet);
    }

    @Override
    public void printare() {
        getBilet().printare();
        System.out.println("Sarbatori fericite!");
    }

    @Override
    public void reducerePret() {
        ((Bilet)getBilet()).setPret((((Bilet)getBilet()).getPret() - discount));
    }
}