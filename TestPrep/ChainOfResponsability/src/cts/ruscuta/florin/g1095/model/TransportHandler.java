package cts.ruscuta.florin.g1095.model;

public interface TransportHandler {
    void setNextHandler(TransportHandler nextHandler);
    void recomandaTransport(double distanta);
}
