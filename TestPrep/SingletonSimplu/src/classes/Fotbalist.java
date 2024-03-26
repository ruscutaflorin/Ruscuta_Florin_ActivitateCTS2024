package classes;

public class Fotbalist {
    private int varsta;
    private String nume;
    private boolean isRetras;

    private static Fotbalist instance;

    private Fotbalist(int varsta, String nume, boolean isRetras) {
        this.varsta = varsta;
        this.nume = nume;
        this.isRetras = isRetras;
    }

    public synchronized static Fotbalist getInstance(String nume, int varsta, boolean isRetras){
        if(instance == null){
            instance = new Fotbalist(varsta, nume, isRetras);
        }
        return instance;
    }

    @Override
    public String toString() {
        return "Fotbalist{" +
                "varsta=" + varsta +
                ", nume='" + nume + '\'' +
                ", isRetras=" + isRetras +
                '}';
    }
}
