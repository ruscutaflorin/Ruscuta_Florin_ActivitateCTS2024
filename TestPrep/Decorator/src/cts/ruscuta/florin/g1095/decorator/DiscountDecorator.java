package cts.ruscuta.florin.g1095.decorator;

import cts.ruscuta.florin.g1095.model.ICosCumparaturi;
import cts.ruscuta.florin.g1095.model.IClient;
import cts.ruscuta.florin.g1095.model.IMagazin;
import cts.ruscuta.florin.g1095.model.Magazin;

public class DiscountDecorator extends BaseDecorator {
    private boolean isFirstOrder;
    private IMagazin magazin;
    public DiscountDecorator(IMagazin magazin) {
        super(magazin);
        this.magazin = magazin;
        this.isFirstOrder = true;
    }

    @Override
    public double getTotal(ICosCumparaturi cos, IClient client) {
        double total = magazin.getTotal(cos, client);

        if (isFirstOrder) {
            total *= 0.9;
            isFirstOrder = false;
        }

        return total;
    }

}
