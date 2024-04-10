package proxy;

import model.AutobuzAbstract;

import java.util.ArrayList;
import java.util.List;

public class AutobuzProxy implements AutobuzAbstract {
    private List<String> statiiInterzise = new ArrayList<>();
    private AutobuzAbstract autobuz;

    public AutobuzProxy(AutobuzAbstract autobuz) {
        this.autobuz = autobuz;
    }

    public void adaugaStatie(String statie){
        statiiInterzise.add(statie);
    }

    @Override
    public void opresteStatie(String numeStatie) {
        if(!statiiInterzise.contains(numeStatie)){
            autobuz.opresteStatie(numeStatie);
        }else {
            System.out.println("Statie interzisa");
        }
    }

    @Override
    public int getNrCalatori() {
        return 0;
    }

    @Override
    public int getNrAutobuz() {
        return 0;
    }
}