package clase;

public abstract class ModPlata {
    private ModPlata succesor;
    public abstract void plateste(int suma, String nume);

    public void setSuccesor(ModPlata succesor) {
        this.succesor = succesor;
    }

    public ModPlata getSuccesor() {
        return succesor;
    }
}