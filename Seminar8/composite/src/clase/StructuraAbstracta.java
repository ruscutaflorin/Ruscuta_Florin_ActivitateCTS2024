package clase;

public interface StructuraAbstracta {
    void aduagareCategorie(StructuraAbstracta structuraAbastracta);
    void stergereCategorie(StructuraAbstracta  structuraAbastracta);
    StructuraAbstracta getCategorie(int index);
    void afisareProspect(String indentare);
    void calculeazaPret(double procentDiscount);
}
