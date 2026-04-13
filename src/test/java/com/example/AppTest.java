package com.example;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void addTest()
    {
        Integer result = App.add(2,3);
        assertTrue( result == 5 );
    }

    @Test
    public void productTest()
    {
        Integer result = App.product(2,3);
        assertTrue( result == 6 );
    }
}
