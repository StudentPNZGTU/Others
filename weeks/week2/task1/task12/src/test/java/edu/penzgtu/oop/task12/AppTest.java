package edu.penzgtu.oop.task12;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


import org.junit.Test;

public class AppTest {

    LeapYear testing = new LeapYear();

    @Test
    public void testLeapYear() {
        assertEquals(testing.leapYear(400), true);
        assertEquals(testing.leapYear(4), true);
        assertEquals(testing.leapYear(8), true);
        assertEquals(testing.leapYear(800), true);
    }

    @Test
    public void testYear() {
        assertEquals(testing.leapYear(413), false);
        assertEquals(testing.leapYear(41), false);
        assertEquals(testing.leapYear(100), false);
    }
}
