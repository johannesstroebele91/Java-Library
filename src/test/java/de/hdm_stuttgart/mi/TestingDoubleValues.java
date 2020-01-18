package de.hdm_stuttgart.mi;

import de.hdm_stuttgart.mi.Testing.DoubleValues;
import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test of {@link DoubleValues}.
 */
public class TestingDoubleValues {

    // TEST FÜR DOUBLE-Werte
    @Test
    public void test(){
        Assert.assertEquals(0,DoubleValues.testDoubleValues(), 5E-15); // E verstehen!!!
    }
}