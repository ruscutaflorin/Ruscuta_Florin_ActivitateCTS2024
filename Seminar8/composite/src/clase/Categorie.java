package clase;

import java.util.ArrayList;
import java.util.List;

public class Categorie implements StructuraAbstracta{
    private List<StructuraAbstracta> medicamente;
    private double procentReducere;
    private String denumire;

    public Categorie(double procentReducere, String denumire) {
        this.procentReducere = procentReducere;
        this.denumire = denumire;
        medicamente = new ArrayList<>();
    }

    public double getProcentReducere() {
        return procentReducere;
    }

    public String getDenumire() {
        return denumire;
    }

    @Override
    public void aduagareCategorie(StructuraAbstracta structuraAbastracta) {
        medicamente.add(structuraAbastracta);
    }

    @Override
    public void stergereCategorie(StructuraAbstracta structuraAbastracta) {
        medicamente.remove(structuraAbastracta);
    }

    @Override
    public StructuraAbstracta getCategorie(int index) {
        return medicamente.get(index);
    }

    @Override
    public void afisareProspect(String indentare) {
        System.out.println( indentare +"Categoria cu numele " + denumire + " are urmatoarele subcategorii: ");
        for(var subCateg: medicamente){
            subCateg.afisareProspect(indentare);
        }
    }

    @Override
    public void calculeazaPret(double procentDiscount) {
        for(var subCateg: medicamente){
            subCateg.calculeazaPret(procentDiscount);
        }
    }
}