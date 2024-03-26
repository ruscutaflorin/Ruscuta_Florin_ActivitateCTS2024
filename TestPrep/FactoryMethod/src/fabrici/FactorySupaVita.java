package fabrici;

import classes.SupaVita;
import classes.Supe;

public class FactorySupaVita implements FactorySupe{
    @Override
    public Supe creeazaSupe(int gramaj, int pret) {
        return new SupaVita(gramaj, pret);
    }
}
