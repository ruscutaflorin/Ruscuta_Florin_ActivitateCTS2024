package fabrici;


import classes.SupaLegume;
import classes.Supe;

public class FactorySupaLegume implements FactorySupe {
    @Override
    public Supe creeazaSupe(int gramaj, int pret) {
        return new SupaLegume(gramaj, pret);
    }
}
