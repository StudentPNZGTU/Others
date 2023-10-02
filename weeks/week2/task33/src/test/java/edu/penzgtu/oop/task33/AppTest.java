package edu.penzgtu.oop.task33;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class AppTest 
{
    MedianArray obj = new MedianArray();
    @Test
    public void testMedian() {
        int [] arr;
        arr = new int[] {1, 2, -145, 33, 13, 34};
        assertEquals(obj.medianArr(arr), -56);

        arr = new int[] {1, 2, 3, 4, 5, 6};
        assertEquals(obj.medianArr(arr), 3);

        arr = new int[] {1, 2, 3, 4, 5, 6, 7};
        assertEquals(obj.medianArr(arr), 4);
    }

    @Test
    void exceptionTesting() {
        int [] arr;
        arr = new int[] {};
        RuntimeException thrown = assertThrows(
                RuntimeException.class,
                () -> obj.medianArr(arr),
                "Arr.length == 0"
        );
        assertTrue(thrown.getMessage().contains("arr.length == 0"));
    }
}
