package edu.penzgtu.oop.task32;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SortingTest {
    MergeSort obj = new MergeSort();

    @Test
    void testMergeSort() {

        int[] arr = {-11,12, -3, 5, 2};
        int [] valid = arr;
        Arrays.stream(valid).sorted();

        assertArrayEquals(obj.mergesort(arr, 0, arr.length-1), valid);

        arr = new int[] {-12312, 3423, 1233, 41, 3, 1414, 34, -11111};
        valid = arr;
        Arrays.stream(valid).sorted();
        assertArrayEquals(obj.mergesort(arr, 0, arr.length-1), valid);

        arr = new int[] {1, 1, 1, 1, 1, 1, 1, 1};
        valid = arr;
        Arrays.stream(valid).sorted();
        assertArrayEquals(obj.mergesort(arr, 0, arr.length-1), valid);

        arr = new int[] {};
        valid = arr;
        Arrays.stream(valid).sorted();
        assertArrayEquals(obj.mergesort(arr, 0, arr.length-1), valid);
    }
}
