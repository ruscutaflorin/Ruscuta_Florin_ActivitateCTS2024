package classes;

public class FactorySupa {
    public Supe creareSupa(TipSupa tipSupa, int gramaj, int pret){
        switch(tipSupa){
            case VITA: return new SupaVita(gramaj, pret);
            case LEGUME: return new SupaLegume(gramaj, pret);
            case CIUPERCI: return new SupaCiuperci(gramaj, pret);
            default: return null;
        }
    }
}
