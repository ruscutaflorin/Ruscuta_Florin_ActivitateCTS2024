package JUnit;

import Dubluri.PersoanaFake;
import JUnit.Categorii.TesteEroare;
import JUnit.Categorii.TesteRange;
import Model.IPersoana;
import Model.PachetTuristic;
import Model.Persoana;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import static org.junit.Assert.*;

public class PachetTuristicTest {

    @org.junit.Test
    @Category(TesteRange.class)
    public void corectAplicaDiscountVarstnici() {
        IPersoana persoana = new Persoana("Florin", "1240202123456");
        PachetTuristic pachetTuristic = new PachetTuristic(persoana, "Dubai", 100d);
        pachetTuristic.aplicaDiscountVarstnici(10);
        assertEquals(90, pachetTuristic.getPret(), 0.01);
    }

    @org.junit.Test
    @Category(TesteRange.class)
    public void limitBoundaryAplicaDiscountVarstnici() {
        IPersoana persoana = new Persoana("Florin", "1590202123456");
        PachetTuristic pachetTuristic = new PachetTuristic(persoana, "Dubai", 200d);
        pachetTuristic.aplicaDiscountVarstnici(20);
        assertEquals(160, pachetTuristic.getPret(), 0.01);
    }

    @Test
    @Category(TesteRange.class)
    public void correctTestGetVarstaFake(){
        PersoanaFake persoana = new PersoanaFake();
        persoana.setVarsta(66);
        PachetTuristic pachetTuristic = new PachetTuristic(persoana, "Dubai", 250d);
        pachetTuristic.aplicaDiscountVarstnici(10);
        assertEquals(225d, pachetTuristic.getPret(), 0.01);
    }

    @Test
    @Category(TesteRange.class)
    public void correctTestGetVarstaFakeNoDiscount(){
        PersoanaFake persoana = new PersoanaFake();
        persoana.setVarsta(20);
        PachetTuristic pachetTuristic = new PachetTuristic(persoana, "Dubai", 250d);
        pachetTuristic.aplicaDiscountVarstnici(10);
        assertEquals(250d, pachetTuristic.getPret(), 0.01);
    }

    @Test
    @Category(TesteRange.class)
    public void correctTestGetVarstaFakeNoDiscountForElders(){
        PersoanaFake persoana = new PersoanaFake();
        persoana.setVarsta(67);
        PachetTuristic pachetTuristic = new PachetTuristic(persoana, "Dubai", 250d);
        pachetTuristic.aplicaDiscountVarstnici(0);
        assertEquals(250d, pachetTuristic.getPret(), 0.01);
    }

    @Test
    @Category(TesteRange.class)
    public void correctTestGetVarstaFakeFullDiscountForElders(){
        PersoanaFake persoana = new PersoanaFake();
        persoana.setVarsta(70);
        PachetTuristic pachetTuristic = new PachetTuristic(persoana, "Dubai", 250d);
        pachetTuristic.aplicaDiscountVarstnici(100);
        assertEquals(0, pachetTuristic.getPret(), 0.01);
    }

    @Test (expected = IllegalArgumentException.class)
    @Category({TesteRange.class, TesteEroare.class})
    public void correctTestGetVarstaFakeNoDiscountThrowsException(){
        PersoanaFake persoana = new PersoanaFake();
        persoana.setVarsta(20);
        PachetTuristic pachetTuristic = new PachetTuristic(persoana, "Dubai", 250d);
        pachetTuristic.aplicaDiscountVarstnici(-3);
    }

    @Test(timeout = 10)
    public void correctTestGetDiscountPerormance(){
        IPersoana persoana = new PersoanaFake();
        ((PersoanaFake)persoana).setVarsta(67);
        PachetTuristic pachetTuristic = new PachetTuristic(persoana, "Dubai", 100d);
        pachetTuristic.aplicaDiscountVarstnici(10);
    }

}

