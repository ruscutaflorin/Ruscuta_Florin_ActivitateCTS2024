package cts.ruscuta.florin.g1095.model;

public class TroleuHandler extends ConcreteTraseuHandler{
    @Override
    public void recomandaTransport(double distanta) {
        if(distanta < 3){
            System.out.println("Se recomanda Troleul!");
        }else{
            super.recomandaTransport(distanta);
        }
    }
}
