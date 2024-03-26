package classes;

public abstract class Supe {
    private int gramaj;
    private int pret;

    public Supe(int gramaj, int pret) {
        this.gramaj = gramaj;
        this.pret = pret;
    }

    public int getGramaj() {
        return gramaj;
    }

    public void setGramaj(int gramaj) {
        this.gramaj = gramaj;
    }

    public int getPret() {
        return pret;
    }

    public void setPret(int pret) {
        this.pret = pret;
    }

    public abstract void afisare();
}
