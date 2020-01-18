package de.hdm_stuttgart.mi;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test of {@link Testing}.
 */
public class AppTest {
    // @Test drüber schreiben, testet auf Syntax Error
    @Test
    public void testCalculate(){

        /* WICHTIGSTE VERGLEICHSMETHODEN:
        1) assertEquals ODER assertNotEquals
        2) assertTrue ODER  assertNotTrue

        1) assertEquals ODER assertNotEquals
        * Ich behaupte, dass ich wenn ich die Testing.calculate aufrufe mit 5,10 aufrufe,
        * dass 15 rauskommen,
        * sonst schmeiße Fehler */
        Assert.assertEquals(10,Testing.calculate(5,10));
        Assert.assertEquals(15,Testing.calculate(5,10));

        // 2) assertTrue ODER  assertNotTrue
        Assert.assertTrue(Testing.biggerTen(11));
        Assert.assertFalse(Testing.biggerTen(5)); // IMMER AUCH AUF NEGATIV TESTEN
    }

    // Test for correct sum of two arguments.
    @Test
    public void testApp() {
        Assert.assertEquals( 33, Testing.add(30, 3));
    }

    // Test ob Primzahl ist
    @Test
    public void testIsPrime(){
        Assert.assertTrue(Testing.isPrime(11));
        Assert.assertTrue(Testing.isPrime(5));
        Assert.assertTrue(Testing.isPrime(3));
        Assert.assertTrue(Testing.isPrime(7));
        Assert.assertTrue(Testing.isPrime(4));
    }

    // TEST FÜR DOUBLE-Werte
    @Test
    public void test(){
        Assert.assertEquals(0,Testing.test(), 5E-15); // E verstehen!!!
    }
}