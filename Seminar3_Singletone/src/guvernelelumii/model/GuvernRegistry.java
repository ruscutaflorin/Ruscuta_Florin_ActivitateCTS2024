package guvernelelumii.model;

import java.util.HashMap;
import java.util.Map;

public class GuvernRegistry {
    private Map<String, Guvern> guverneleLumii;

    private static GuvernRegistry instance;

    private GuvernRegistry() {
        this.guverneleLumii = new HashMap<>();
    }

    public synchronized static GuvernRegistry getInstance(){
        if(instance == null){
            instance = new GuvernRegistry();
        }
        return instance;
    }

    public void adaugareGuvern(String numeTara, String numePrimMinistru, int nrGuvernatori){
        if(this.guverneleLumii.containsKey(numeTara)){
            return;
        }
        this.guverneleLumii.put(numeTara, new Guvern(numeTara, numePrimMinistru, nrGuvernatori));
    }

    public Guvern getGuvern(String numeTara){
        return this.guverneleLumii.get(numeTara);
    }

    @Override
    public String toString() {
        return "GuvernRegistry{" +
                "guverneleLumii=" + guverneleLumii +
                '}';
    }
}
