package de.hdm_stuttgart.mi;

import de.hdm_stuttgart.mi.Testing.GeneralValues;
import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test of {@link GeneralValues}.
 */

public class TestingGeneralValues {
    // @Test drüber schreiben, testet auf Syntax Error
    @Test
    public void testCalculate(){

    /* 1) Test für richtigen Wert: assertEquals
    * Ich behaupte, dass ich wenn ich die Testing.calculate aufrufe mit 5,10 aufrufe,
    * dass 15 rauskommen,
    * sonst wird Fehler geworfen */
    Assert.assertEquals(15,GeneralValues.calculate(5,10));
    // Assert.assertEquals(10,Testing.calculate(5,10)); // Expected to fail

    // 2) Test für bigger Value: assertTrue ODER  assertNotTrue
    Assert.assertTrue(GeneralValues.biggerTen(11));
    Assert.assertFalse(GeneralValues.biggerTen(5)); // IMMER AUCH AUF NEGATIV TESTEN
    }

    // 3) Test for correct sum of two arguments: assertEquals
    @Test
    public void testApp() {
        Assert.assertEquals( 33, GeneralValues.add(30, 3));
    }

    // 4) Test ob Primzahl ist
    @Test
    public void testIsPrime(){
        Assert.assertTrue(GeneralValues.isPrime(11));
        Assert.assertTrue(GeneralValues.isPrime(5));
        Assert.assertTrue(GeneralValues.isPrime(3));
        Assert.assertTrue(GeneralValues.isPrime(7));
        Assert.assertTrue(GeneralValues.isPrime(4));
    }
}