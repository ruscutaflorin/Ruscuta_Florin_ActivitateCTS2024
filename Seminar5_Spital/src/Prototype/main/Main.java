package Prototype.main;



import Prototype.model.AbstractReteta;
import Prototype.model.Reteta;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String,Double> hartaIngrediente=new HashMap<>();
        hartaIngrediente.put("HCl",5.0);
        hartaIngrediente.put("Vitamina C",10.0);
        hartaIngrediente.put("Vitamina D",11.3);
        AbstractReteta reteta1=new Reteta("Mig400",hartaIngrediente,26.3);
        AbstractReteta reteta2=reteta1.cloneaza();
        reteta2.setNumeMedicament("Altceva");
        System.out.println(reteta1);
        System.out.println(reteta2);
        System.out.println(reteta1);
    }
}