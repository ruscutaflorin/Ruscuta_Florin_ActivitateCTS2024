package classes;

import java.util.ArrayList;
import java.util.List;

public class Reteta implements Prototype {
    private String nume;
    private int nrCompusi;

    private List<String> ingrediente;

    private Reteta() {
    }

    public Reteta(String nume, int nrCompusi, List<String> ingrediente) {
        this.nume = nume;
        this.nrCompusi = nrCompusi;
        this.ingrediente = ingrediente;
    }

    @Override
    public Prototype clone() {
        Reteta copy = new Reteta();
        copy.nume = this.nume;
        copy.nrCompusi = this.nrCompusi;
        copy.ingrediente = new ArrayList<>(this.ingrediente);
        return copy;
    }

    @Override
    public String toString() {
        return "Reteta{" +
                "nume='" + nume + '\'' +
                ", nrCompusi=" + nrCompusi +
                ", ingrediente=" + ingrediente +
                '}';
    }
}
