package guvernelelumii.main;

import guvernelelumii.model.Guvern;
import guvernelelumii.model.GuvernRegistry;

public class Program {
    public static void main(String[] args) {
        GuvernRegistry guvern = GuvernRegistry.getInstance();
        guvern.adaugareGuvern("Romania", "Popescu", 12);
        guvern.adaugareGuvern("Romania", "Marcel", 10);
        guvern.adaugareGuvern("Ungaria", "Loti", 2);
        guvern.getGuvern("Romania").setNumePrimMinistru("Bodi");
        System.out.println(guvern.getGuvern("Romania"));
        System.out.println(guvern.getGuvern("Ungaria"));

    }
}
