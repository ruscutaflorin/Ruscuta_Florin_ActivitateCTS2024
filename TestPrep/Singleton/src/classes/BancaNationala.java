package classes;

public class BancaNationala {
    private String nume;
    private int numarAngajati;

    public BancaNationala(String nume, int numarAngajati) {
        this.nume = nume;
        this.numarAngajati = numarAngajati;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getNumarAngajati() {
        return numarAngajati;
    }

    public void setNumarAngajati(int numarAngajati) {
        this.numarAngajati = numarAngajati;
    }

    @Override
    public String toString() {
        return "BancaNationala{" +
                "nume='" + nume + '\'' +
                ", numarAngajati=" + numarAngajati +
                '}';
    }
}
