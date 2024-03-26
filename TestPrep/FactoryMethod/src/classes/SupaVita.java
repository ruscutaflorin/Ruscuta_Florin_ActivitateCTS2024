package classes;

public class SupaVita extends Supe{

    public SupaVita(int gramaj, int pret) {
        super(gramaj, pret);
    }

    @Override
    public void afisare() {
        System.out.println("Supa vita " + super.getGramaj() + " " + super.getPret());
    }
}
