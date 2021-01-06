package server;

import junit.framework.*;
import org.junit.After;
import org.junit.Before;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;

public class AllTests {
    public Utilizator utilizator;
    public ContUtilizator cont;
    public boolean x;
    public boolean y;

    PersistentaContUtilizator p = new PersistentaContUtilizator();;
    PersistentaUtilizator u = new PersistentaUtilizator();

    public int sansaImbolnavireDupaVarsta(int varsta){
        if(varsta > 10 && varsta < 25)
            return 1;
        else if(varsta >= 25 && varsta < 36)
            return 3;
        else if(varsta >= 36 && varsta <47)
            return 5;
        else if(varsta >= 47 && varsta <58)
            return 7;
        else if(varsta >= 58 && varsta <69)
            return 10;
        else return 0;
    }

    public double sansaImbolnavireDupaVarstaSiGen(int varsta, String gender){
        double chance = 1;
        if(gender.equals("male"))
            chance = 0.8;
        else if(gender.equals("female"))
            chance = 1.2;
        if(varsta > 10 && varsta < 25)
            return 1 * chance;
        else if(varsta >= 25 && varsta < 36)
            return 3 * chance;
        else if(varsta >= 36 && varsta <47)
            return 5 * chance;
        else if(varsta >= 47 && varsta <58)
            return 7 * chance;
        else if(varsta >= 58 && varsta <69)
            return 10 * chance;
        else return 0;
    }


    @Before
    public void setUp() {
        utilizator = new Utilizator("Popa", "Rares", "22", "123", "medic");
        cont = new ContUtilizator("medic3", "1234", "11");
        x = false;
        y = false;
    }

    @Test
    public void testRisc10_25() {
        int k = 0;
        ArrayList<Utilizator> conturi = u.viewUtilizatori();
        for(Utilizator z : conturi){
            int l = sansaImbolnavireDupaVarsta(Integer.parseInt(z.varsta));
            if (l == 1) k++;
        }
        assertTrue(k < 10);
    }

    @Test
    public void testRisc25_36() {
        int k = 0;
        ArrayList<Utilizator> conturi = u.viewUtilizatori();
        for(Utilizator z : conturi){
            int l = sansaImbolnavireDupaVarsta(Integer.parseInt(z.varsta));
            if (l == 3) k++;
        }
        assertTrue(k < 10);
    }

    @Test
    public void testRisc36_47() {
        int k = 0;
        ArrayList<Utilizator> conturi = u.viewUtilizatori();
        for(Utilizator z : conturi){
            int l = sansaImbolnavireDupaVarsta(Integer.parseInt(z.varsta));
            if (l == 5) k++;
        }
        assertTrue(k < 10);
    }

    @Test
    public void testRisc47_58() {
        int k = 0;
        ArrayList<Utilizator> conturi = u.viewUtilizatori();
        for(Utilizator z : conturi){
            int l = sansaImbolnavireDupaVarsta(Integer.parseInt(z.varsta));
            if (l == 7) k++;
        }
        assertTrue(k < 10);
    }

    @Test
    public void testRisc58_69() {
        int k = 0;
        ArrayList<Utilizator> conturi = u.viewUtilizatori();
        for(Utilizator z : conturi){
            int l = sansaImbolnavireDupaVarsta(Integer.parseInt(z.varsta));
            if (l == 10) k++;
        }
        assertTrue(k < 10);
    }

    @Test
    public void testPacientiPreaTineri() {
        int k = 0;
        ArrayList<Utilizator> conturi = u.viewUtilizatori();
        for(Utilizator z : conturi){
            if(Integer.parseInt(z.varsta) < 10)
                 k++;
        }
        assertEquals(0,k);
    }

    @Test
    public void testPacientiPreaBatrani() {
        int k = 0;
        ArrayList<Utilizator> conturi = u.viewUtilizatori();
        for(Utilizator z : conturi){
            if(Integer.parseInt(z.varsta) > 69)
                k++;
        }
        assertEquals(0,k);
    }

    @Test
    public void testUtilizatorCreate() {
        assertEquals("Popa", utilizator.getNume());
        assertEquals("Rares", utilizator.getPrenume());
        assertEquals("22", utilizator.getVarsta());
        assertEquals("123", utilizator.getNrLegitimatie());
        assertEquals("medic", utilizator.getRol());
    }

    @Test
    public void testVizualizareConturi(){
        ArrayList<ContUtilizator> conturi = p.viewConturi();
        int nrConturi = conturi.size();
        assertEquals(6, conturi.size());
    }

    @Test
    public void testAdaugareConturi(){
        ArrayList<ContUtilizator> conturi = p.viewConturi();
        int nrConturi = conturi.size();
        x = p.addCont(cont);
        ArrayList<ContUtilizator> conturi1 = p.viewConturi();
        if(x) //s-a adaugat contul cu succes(nu exista deja)
            assertEquals(nrConturi + 1, conturi1.size());
        else
            assertEquals(nrConturi, conturi1.size());
    }

    @Test
    public void testStergereConturi(){
        ArrayList<ContUtilizator> conturi = p.viewConturi();
        int nrConturi = conturi.size();
        y = p.deleteCont("11");
        ArrayList<ContUtilizator> conturi1 = p.viewConturi();
        if(y) //s-a sters contul cu succes(acesta exista inainte)
            assertEquals(nrConturi - 1, conturi1.size());
        else
            assertEquals(nrConturi, conturi1.size());
    }

    @Test
    public void ContUtilizatorCreate() {
        assertEquals("medic3", cont.getUser());
        assertEquals("1234", cont.getParola());
        assertEquals("11", cont.getNrLegitimatie());
    }

    @After
    public void tearDown(){
        utilizator = new Utilizator();
        cont = new ContUtilizator();
        x = false;
        y = false;
    }
}
