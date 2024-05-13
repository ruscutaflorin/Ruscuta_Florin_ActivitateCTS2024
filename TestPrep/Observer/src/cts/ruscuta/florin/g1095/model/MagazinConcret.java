package cts.ruscuta.florin.g1095.model;

public class MagazinConcret extends Magazin{
    @Override
    public void modificaPret(double pretNou, String denumireProdus) {
        if (produse.containsKey(denumireProdus)) {
            produse.put(denumireProdus, pretNou);
            notifyEmail("Pret modificat pentru produsul " + denumireProdus);
            notifyPhone("Pret modificat pentru produsul " + denumireProdus);
        } else {
            System.out.println("Nu exista produsul!");
        }
    }
}
