package com.mycompany.app;

import org.junit.jupiter.api.Test;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
/**
 * Algorithm test for finding a nearby elevator
 */
public class AppTest 
{

    @Test
    public void testElevator()
    {
        Elevators e = new Elevators();
        // example input
        e.max = 10;
        e.quantity = 3;
        e.count = 10;
        e.elevators = new int[e.quantity];
        Arrays.fill(e.elevators, 1);
        testAlgorithm.e = e;

        int res = testAlgorithm.SearchMin(7);
        assertEquals(res, 0);

        res = testAlgorithm.SearchMin(7);
        assertEquals(res, 0);

        res = testAlgorithm.SearchMin(3);
        assertEquals(res, 1);

        res = testAlgorithm.SearchMin(3);
        assertEquals(res, 1);

        res = testAlgorithm.SearchMin(4);
        assertEquals(res, 1);

        res = testAlgorithm.SearchMin(1);
        assertEquals(res, 2);

        res = testAlgorithm.SearchMin(10);
        assertEquals(res, 0);

        res = testAlgorithm.SearchMin(9);
        assertEquals(res, 0);

        res = testAlgorithm.SearchMin(8);
        assertEquals(res, 0);

        res = testAlgorithm.SearchMin(5);
        assertEquals(res, 1);
    }
}