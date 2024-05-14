package cts.ruscuta.florin.g1095.model;

public class MetrouHandler extends ConcreteTraseuHandler{
    @Override
    public void recomandaTransport(double distanta) {
        if(distanta > 3){
            System.out.println("Se recomanda metroul!");
        }
        else{
            super.recomandaTransport(distanta);
        }
    }
}
