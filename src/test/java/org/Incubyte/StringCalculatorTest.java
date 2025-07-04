package org.Incubyte;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Unit test for simple StringCalculator.
 */
public class StringCalculatorTest
{
    @Test
    public void emptyString_ShouldReturnZero()
    {
        assertEquals(0,StringCalculator.add("") );
    }

    @Test
    public void singleNumber_ShouldReturnItSelf()
    {
        assertEquals(21,StringCalculator.add("21"));
    }

    @Test
    public void multipleNumbersSeperatedByComa_ShouldReturnSumOfTheNumbers()
    {
        assertEquals(6,StringCalculator.add("1,2,3"));
    }

    @Test
    public void numbersWithNewlineDelimiter_ShouldReturnSumOfTheNumbers()
    {
        assertEquals(10,StringCalculator.add("1\n2,7"));
    }

    @Test
    public void negativeNumbers_ShouldThrowException()
    {
        try
        {
            StringCalculator.add("-1,-3,4");
            fail("Negative numbers not allowed");
        }
        catch(IllegalArgumentException e)
        {
            assertTrue(e.getMessage().contains("-1"));
            assertTrue(e.getMessage().contains("-3"));
        }
    }
}
