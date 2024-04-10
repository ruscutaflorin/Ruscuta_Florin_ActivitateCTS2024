package decorator;


import model.Bilet;
import model.BiletAbstract;

public class BiletAniversareSTB extends Decorator{
    public BiletAniversareSTB(BiletAbstract bilet) {
        super(bilet);
    }

    @Override
    public void printare() {
        getBilet().printare();
        System.out.println("La multi ani STB");
    }

    @Override
    public void reducerePret() {
        ((Bilet)getBilet()).setPret(0);
    }
}
