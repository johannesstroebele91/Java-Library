package de.hdm_stuttgart.mi;

import de.hdm_stuttgart.mi.Testing.GeneralValues;
import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test of {@link GeneralValues}.
 */

public class TestingGeneralValues {

    /** Comparison methods
     * assertEquals([String message],...)
     * assertArrayEquals([String message],...)
     * assertFalse([String message],...)
     * assertNotEquals([String message],...)
     * assertNull([String message],...)
     * fail([String message],...)
     */

    // @Test drüber schreiben, testet auf Syntax Error
    @Test
    public void testSomething() {}

    // 1) Test für bigger Value: assertTrue ODER  assertNotTrue
    @Test
    public void testBiggerTen(){
        Assert.assertTrue(GeneralValues.biggerTen(11));
        Assert.assertFalse(GeneralValues.biggerTen(5)); // IMMER AUCH AUF NEGATIV TESTEN
    }

    /* 2) Test for correct sum of two arguments: assertEquals
     * Ich behaupte, dass ich wenn ich die Testing.calculate aufrufe mit 5,10 aufrufe,
     * dass 15 rauskommen,
     * sonst wird Fehler geworfen */
    @Test
    public void testAdd() {
        Assert.assertEquals( 33, GeneralValues.add(30, 3));
    }

    // 3) Check whether a given value is prime or not
    @Test
    public void testIsPrime(){
        Assert.assertTrue(GeneralValues.isPrime(11));
        Assert.assertTrue(GeneralValues.isPrime(5));
        Assert.assertTrue(GeneralValues.isPrime(3));
        Assert.assertTrue(GeneralValues.isPrime(7));
        Assert.assertTrue(GeneralValues.isPrime(4));
    }
}