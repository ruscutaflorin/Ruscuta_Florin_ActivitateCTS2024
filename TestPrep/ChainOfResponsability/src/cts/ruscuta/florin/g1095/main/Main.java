package cts.ruscuta.florin.g1095.main;

import cts.ruscuta.florin.g1095.model.MetrouHandler;
import cts.ruscuta.florin.g1095.model.TransportHandler;
import cts.ruscuta.florin.g1095.model.TroleuHandler;

public class Main {
    public static void main(String[] args) {
        TransportHandler troleuHandler = new TroleuHandler();
        TransportHandler metrouHandler = new MetrouHandler();
        troleuHandler.setNextHandler(metrouHandler);
        troleuHandler.recomandaTransport(2);
    }
}
