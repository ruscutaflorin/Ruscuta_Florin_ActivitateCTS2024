package classes;

public class SupaLegume extends Supe{
    public SupaLegume(int gramaj, int pret) {
        super(gramaj, pret);
    }

    @Override
    public void afisare() {
        System.out.println("Supa Legume " + super.getGramaj() + " " + super.getPret());
    }
}
