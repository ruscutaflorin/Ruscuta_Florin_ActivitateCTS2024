package classes;

public class SupaCiuperci extends Supe{
    public SupaCiuperci(int gramaj, int pret) {
        super(gramaj, pret);
    }

    @Override
    public void afisare() {
        System.out.println("Supa Ciuperci " + super.getGramaj() + " " + super.getPret());
    }
}
