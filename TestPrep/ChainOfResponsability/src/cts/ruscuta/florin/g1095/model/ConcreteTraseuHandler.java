package cts.ruscuta.florin.g1095.model;

public abstract class ConcreteTraseuHandler implements TransportHandler {
    private TransportHandler nextHandler;
    @Override
    public void setNextHandler(TransportHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void recomandaTransport(double distanta) {
        if(nextHandler != null){
            nextHandler.recomandaTransport(distanta);
        }
    }
}
