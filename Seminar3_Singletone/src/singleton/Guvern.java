package singleton;

public class Guvern {
    private int nrGuvernatori;
    private String numePrimMinistru;
    private int nrLuni;
    private static Guvern instance;

    //    constructorul trebuie sa fie privat
    private Guvern(int nrGuvernatori, String numePrimMinistru, int nrLuni) {
        this.nrGuvernatori = nrGuvernatori;
        this.numePrimMinistru = numePrimMinistru;
        this.nrLuni = nrLuni;
    }
    public synchronized static Guvern getInstance(int nrGuvernatori, String numePrimMinistru, int nrLuni){
        if(instance == null){
            instance = new Guvern(nrGuvernatori, numePrimMinistru, nrLuni);
        }
        return instance;
    }

    public int getNrGuvernatori() {
        return nrGuvernatori;
    }

    public void setNrGuvernatori(int nrGuvernatori) {
        this.nrGuvernatori = nrGuvernatori;
    }

    public String getNumePrimMinistru() {
        return numePrimMinistru;
    }

    public void setNumePrimMinistru(String numePrimMinistru) {
        this.numePrimMinistru = numePrimMinistru;
    }

    public int getNrLuni() {
        return nrLuni;
    }

    public void setNrLuni(int nrLuni) {
        this.nrLuni = nrLuni;
    }

    @Override
    public String toString() {
        return "Guvern{" +
                "nrGuvernatori=" + nrGuvernatori +
                ", numePrimMinistru='" + numePrimMinistru + '\'' +
                ", nrLuni=" + nrLuni +
                '}';
    }
}
