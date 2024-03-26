package classes;

import java.util.HashMap;
import java.util.Map;

public class BancaNationalaRegistry {
    private Map<String, BancaNationala> bancileLumii;
    private static BancaNationalaRegistry instance;

    private BancaNationalaRegistry() {
        this.bancileLumii = new HashMap<>();
    }

    public synchronized static BancaNationalaRegistry getInstance(){
        if(instance == null){
            instance = new BancaNationalaRegistry();
        }
        return instance;
    }

    public void adaugaBanca(String nume, int nrAngajati){
        if(!bancileLumii.containsKey(nume)){
           bancileLumii.put(nume, new BancaNationala(nume, nrAngajati));
        }
    }

    public BancaNationala getBanca(String numeTara){
        return bancileLumii.get(numeTara);
    }


    @Override
    public String toString() {
        return "BancaNationalaRegistry{" +
                "bancileLumii=" + bancileLumii +
                '}';
    }
}
