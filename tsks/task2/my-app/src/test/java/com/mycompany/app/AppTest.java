package com.mycompany.app;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest 
{
    /**
     * Sorting test
     */
    @org.junit.jupiter.api.Test
    public void testQuicksort()
    {
        List<Integer>  res = null;
        Quicksort srt = new Quicksort();
        res = srt.Sort(Arrays.asList());
        assertEquals(Arrays.asList(), res);

        res = srt.Sort(Arrays.asList(1));
        assertEquals(Arrays.asList(1), res);

        res = srt.Sort(Arrays.asList(1, 2, 3));
        assertEquals(Arrays.asList(1, 2, 3), res);

        res = srt.Sort(Arrays.asList(-1, 5, 2, 3, -8, 1, 1));
        assertEquals(Arrays.asList(-8, -1, 1, 1, 2, 3, 5), res);

        // print random
        Generate example = new Generate();
        example.printSortsLists();
    }
}
