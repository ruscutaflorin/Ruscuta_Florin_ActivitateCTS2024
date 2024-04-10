package main;

import model.Autobuz;
import model.AutobuzAbstract;
import proxy.AutobuzDeNoapte;
import proxy.AutobuzProxy;

public class Main {
    public static void main(String[] args) {
        AutobuzAbstract autobuzAbstract = new Autobuz(11,368,"Mihai");
        autobuzAbstract.opresteStatie("Romana");

        AutobuzAbstract autobuzAbstract1 = new AutobuzDeNoapte(autobuzAbstract);
        autobuzAbstract1.opresteStatie("Romana");

        AutobuzAbstract autobuzAbstract2 = new Autobuz(0,131,"Mihai");
        AutobuzAbstract autobuzAbstract3 = new AutobuzDeNoapte(autobuzAbstract2);
        autobuzAbstract3.opresteStatie("Romana");


        AutobuzProxy autobuzAbstract4 = new AutobuzProxy(autobuzAbstract);
        autobuzAbstract4.adaugaStatie("Romana");
        autobuzAbstract4.adaugaStatie("Victoriei");
        autobuzAbstract4.opresteStatie("Romana");


    }
}