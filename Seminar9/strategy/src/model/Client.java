package model;

public class Client {
    private String nume;
    private ModPlata  modPlata;

    public Client(String nume) {
        this.nume = nume;
        modPlata = new Card();
    }

    public void realizeazaPlata(int suma){
        modPlata.plateste(suma,nume);
    }

    public void setModPlata(ModPlata modPlata) {
        this.modPlata = modPlata;
    }
}