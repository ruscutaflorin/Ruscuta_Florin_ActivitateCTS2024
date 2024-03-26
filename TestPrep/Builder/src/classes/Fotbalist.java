package classes;

public class Fotbalist {
    private String nume;
    private int varsta;

    private boolean isRetras;

    protected Fotbalist() {
        this.isRetras = false;
        this.nume = "";
        this.varsta = 0;
    }

    protected Fotbalist(String nume, int varsta, boolean isRetras) {
        this.nume = nume;
        this.varsta = varsta;
        this.isRetras = isRetras;
    }

    @Override
    public String toString() {
        return "Fotbalist{" +
                "nume='" + nume + '\'' +
                ", varsta=" + varsta +
                ", isRetras=" + isRetras +
                '}';
    }
}
