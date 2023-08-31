package com.mycompany.app;

import org.junit.jupiter.api.Test;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
/**
 * Algorithm test for finding a nearby elevator
 */
public class AppTest 
{

    @org.junit.jupiter.api.Test
    public void testElevator()
    {
        Elevators e = new Elevators();
        // example input
        e.max = 10;
        e.quantity = 3;
        e.count = 10;
        e.elevators = new int[e.quantity];
        Arrays.fill(e.elevators, 1);

        int res = testAlgorithm.SearchMin(7, e);
        assertEquals(res, 0);

        res = testAlgorithm.SearchMin(7, e);
        assertEquals(res, 0);

        res = testAlgorithm.SearchMin(3, e);
        assertEquals(res, 1);

        res = testAlgorithm.SearchMin(3, e);
        assertEquals(res, 1);

        res = testAlgorithm.SearchMin(4, e);
        assertEquals(res, 1);

        res = testAlgorithm.SearchMin(1, e);
        assertEquals(res, 2);

        res = testAlgorithm.SearchMin(10, e);
        assertEquals(res, 0);

        res = testAlgorithm.SearchMin(9, e);
        assertEquals(res, 0);

        res = testAlgorithm.SearchMin(8, e);
        assertEquals(res, 0);

        res = testAlgorithm.SearchMin(5, e);
        assertEquals(res, 1);
    }
}
