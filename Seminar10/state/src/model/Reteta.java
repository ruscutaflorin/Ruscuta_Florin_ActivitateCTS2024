package model;


public class Reteta {
    private int nrReteta;
    private int nrMedicamente;
    private State stare;

    public Reteta(int nrReteta, int nrMedicamente) {
        this.nrReteta = nrReteta;
        this.nrMedicamente = nrMedicamente;
        this.stare = new Emisa();
    }

    protected void setStare(State stare) {
        this.stare = stare;
    }

    public void solicitaMedicamente() {
        if (stare instanceof Emisa) {
            setStare(new Solicitata());
            System.out.println("Pentru reteta cu numarul " + nrReteta + " au fost solicitate " + nrMedicamente);
        } else {
            System.out.println("Medicamentele din reteta " + nrReteta + " nu pot fi solicitate");
        }
    }
    public void cumparaMedicamente(){
        if(stare instanceof Solicitata){
            new Achizitionata().schimbaStare(this);
            System.out.println("Pentru reteta cu numarul " + nrReteta + " au fost achizitionate " + nrMedicamente);
        }else{
            System.out.println("Medicamentele din reteta " + nrReteta + " nu pot fi achizitionate");
        }
    }

    public void respingeAchizitie(){
        if(stare instanceof Solicitata){
            setStare(new Emisa());
            System.out.println("Reteta a fost respinsa");
        }else{
            System.out.println("Reteta nu poate fi respinsaW");
        }
    }

    @Override
    public String
    toString() {
        final StringBuilder sb = new StringBuilder("Reteta{");
        sb.append("nrReteta=").append(nrReteta);
        sb.append(", nrMedicamente=").append(nrMedicamente);
        sb.append(", stare=").append(stare);
        sb.append('}');
        return sb.toString();
    }
}