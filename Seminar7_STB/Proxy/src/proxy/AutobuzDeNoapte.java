package proxy;

import model.AutobuzAbstract;

public class AutobuzDeNoapte implements AutobuzAbstract {
    private AutobuzAbstract autobuz;

    public AutobuzDeNoapte(AutobuzAbstract autobuz) {
        this.autobuz = autobuz;
    }

    @Override
    public void opresteStatie(String numeStatie) {
        if(autobuz.getNrCalatori()>0){
            autobuz.opresteStatie(numeStatie);
        }else{
            System.out.println("Autobuzul " + autobuz.getNrAutobuz() + " nu opreste.");
        }
    }

    @Override
    public int getNrCalatori() {
        return autobuz.getNrCalatori();
    }

    @Override
    public int getNrAutobuz() {
        return autobuz.getNrAutobuz();
    }
}
