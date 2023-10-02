package edu.penzgtu.oop.task22;

import org.junit.Test;

import static org.junit.Assert.*;

public class SqrtTest {
    Sqrt obj = new Sqrt();

    @Test
    public void testSqrt() {
        for (int i = 1; i < 30; i++) {
            assertEquals((int)Math.sqrt(i), obj.sqrt(i));
        }
    }

    @Test
    public void testSqrtMax() {
        double max = Math.pow(9.99999998, 17);
        assertEquals((int)Math.sqrt(max), obj.sqrt(max));
    }

    @Test(expected = ArithmeticException.class)
    public void testErrorSqrt() {
        obj.sqrt(0);
    }

    @Test(expected = ArithmeticException.class)
    public void testErrorMoreMax() {
        obj.sqrt(obj.maxDoubleForInt+65);
    }
}
