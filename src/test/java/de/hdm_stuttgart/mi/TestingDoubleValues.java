package de.hdm_stuttgart.mi;

import de.hdm_stuttgart.mi.Testing.SpecialCase_Double;
import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test of {@link SpecialCase_Double}.
 */
public class TestingDoubleValues {

    // TEST FÜR DOUBLE-Werte
    @Test
    public void test(){
        Assert.assertEquals(0, SpecialCase_Double.testDoubleValues(), 5E-15); // E verstehen!!!
    }
}