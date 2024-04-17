package main;

import clase.Categorie;
import clase.Medicament;
import clase.StructuraAbstracta;

public class Main {
    public static void main(String[] args) {
        StructuraAbstracta medicamente = new Categorie(0d,"Medicament");
        StructuraAbstracta raceala = new Categorie(0.1,"Raceala");
        StructuraAbstracta durere = new Categorie(0.1,"Durere");

        StructuraAbstracta copil = new Categorie(0.3,"Copil");
        StructuraAbstracta adult = new Categorie(0.2,"Adult");

        StructuraAbstracta nurofen = new Medicament(12.2,"Nurofen");
        StructuraAbstracta paracetamol = new Medicament(22.2,"Paracetamol");

        medicamente.aduagareCategorie(raceala);
        medicamente.aduagareCategorie(durere);

        raceala.aduagareCategorie(copil);
        raceala.aduagareCategorie(adult);

        adult.aduagareCategorie(nurofen);
        copil.aduagareCategorie(nurofen);
        raceala.aduagareCategorie(paracetamol);

        medicamente.afisareProspect("  ");
        medicamente.calculeazaPret(0.2);
        medicamente.afisareProspect("        ");
    }
}
