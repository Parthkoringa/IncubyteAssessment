package org.Incubyte;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Unit test for simple StringCalculator.
 */
public class StringCalculatorTest
{
    @Test
    public void EmptyStringShouldReturnZero()
    {
        assertEquals("0",StringCalculator.add("") );
    }
}
