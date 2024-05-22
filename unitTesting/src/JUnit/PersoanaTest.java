package JUnit;

import Model.IPersoana;
import Model.Persoana;
import org.junit.Test;

import static org.junit.Assert.*;

public class PersoanaTest {

    @org.junit.Test
    public void testGetSexMasculin() {
        IPersoana persoana = new Persoana("Florin", "5020202123456");
        assertEquals("M", persoana.getSex());
    }
    @org.junit.Test
    public void testGetSexFeminin() {
        IPersoana persoana = new Persoana("Florina", "4020202123456");
        assertEquals("F", persoana.getSex());
    }

    @org.junit.Test
    public void testGetMinBoundaries() {
        IPersoana persoana = new Persoana("Florin", "1020202123456");
        assertEquals("M", persoana.getSex());
    }

    @org.junit.Test
    public void testGetMaxBoundaries() {
        IPersoana persoana = new Persoana("Florin", "6020202123456");
        assertEquals("F", persoana.getSex());
    }

    @org.junit.Test
    public void testCrossCheck(){
        Persoana persoana = new Persoana("Ramona", "6020202123456");
        int cifra = persoana.CNP.charAt(0);
        String caracter = (cifra % 2 == 0 ? "F" : "M");
        assertEquals("F", persoana.getSex());
    }

    @org.junit.Test(expected = IllegalArgumentException.class)
    public void testError(){
        Persoana persoana = new Persoana("Ramona", "-020202123456");
        persoana.getSex();
    }

    @org.junit.Test(expected = StringIndexOutOfBoundsException.class)
    public void testNoCNP(){
        Persoana persoana = new Persoana("Ramona", "");
        persoana.getSex();
    }

    @Test(timeout = 100)
    public void testPerformance(){
        Persoana persoana = new Persoana("Florin", "5020202123456");
        persoana.getSex();
    }

    @Test
    public void testConformance(){
        Persoana persoana = new Persoana("Ramona", "6020202123456");
        String letters = persoana.getSex();
        assertTrue(letters == "F");
    }

    @Test
    public void testOrderSex(){
        Persoana persoana = new Persoana("Ramona", "6020202123456");
        Persoana persoana2 = new Persoana("Florin", "5020202123456");
        assertTrue(persoana.getSex().compareTo(persoana2.getSex()) <0 );
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSexExistence(){
        Persoana persoana = new Persoana("Ramona", null);
        persoana.getSex();
    }
}