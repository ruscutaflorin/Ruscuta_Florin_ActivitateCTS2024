package cts.ruscuta.florin.g1095.decorator;

import cts.ruscuta.florin.g1095.model.IMagazin;

public abstract class BaseDecorator implements IMagazin {
    private IMagazin magazin;

    public BaseDecorator(IMagazin magazin) {
        this.magazin = magazin;
    }
}
