package cts.ruscuta.florin.g1095.zurini.main;

import cts.ruscuta.florin.g1095.zurini.model.CategorieProduse;
import cts.ruscuta.florin.g1095.zurini.model.IProdus;
import cts.ruscuta.florin.g1095.zurini.model.Produs;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        CategorieProduse electronice = new CategorieProduse("Electronice");
        CategorieProduse electrocasnice = new CategorieProduse("Electrocasnice");
        CategorieProduse imbracaminte = new CategorieProduse("Imbracaminte");

        // Adăugăm produse în categorii
        electronice.adaugaProdus(new Produs("Telefon", 10));
        electronice.adaugaProdus(new Produs("Laptop", 5));
        electrocasnice.adaugaProdus(new Produs("Frigider", 3));
        electrocasnice.adaugaProdus(new Produs("Masina de spalat", 2));
        imbracaminte.adaugaProdus(new Produs("Tricou", 20));
        imbracaminte.adaugaProdus(new Produs("Pantaloni", 15));

        // Adăugăm subcategorii
        CategorieProduse telefoane = new CategorieProduse("Telefoane");
        telefoane.adaugaProdus(new Produs("iPhone", 3));
        telefoane.adaugaProdus(new Produs("Samsung", 5));
        electronice.adaugaProdus(telefoane);

        // Afișăm toate produsele pe categorii
        afiseazaProduseCategorii(electronice);
    }

    private static void afiseazaProduseCategorii(IProdus produs) {
        if (produs instanceof CategorieProduse) {
            System.out.println("Categorie: " + produs.getDenumire());
            List<IProdus> produse = ((CategorieProduse) produs).getProduse();
            for (IProdus p : produse) {
                afiseazaProduseCategorii(p);
            }
        } else {
            System.out.println("Produs: " + produs.getDenumire() + ", Cantitate: " + produs.getCantitate());
        }
    }
}
