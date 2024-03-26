package classes;

public class FotbalistBuilder implements Builder{
    private String nume;
    private int varsta;
    private boolean isRetras;

    public FotbalistBuilder() {
        this.isRetras = false;
        this.nume = "";
        this.varsta = 0;
    }

    @Override
    public Fotbalist build() {
        return new Fotbalist(nume, varsta, isRetras);
    }

    public FotbalistBuilder setNume(String nume) {
        this.nume = nume;
        return this;
    }

    public FotbalistBuilder setVarsta(int varsta) {
        this.varsta = varsta;
        return this;
    }

    public  FotbalistBuilder setRetras(boolean retras) {
        isRetras = retras;
        return this;
    }
}
