package fabrici;

import classes.SupaCiuperci;
import classes.Supe;

public class FactorySupaCiuperci implements FactorySupe{
    @Override
    public Supe creeazaSupe(int gramaj, int pret) {
        return new SupaCiuperci(gramaj, pret);
    }
}
