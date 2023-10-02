package edu.penzgtu.oop.task33;

import java.util.Arrays;

public class MedianArray {
    public static void main( String[] args ) {
        MedianArray print = new MedianArray();

        int[] arr = {1, 2, -145, 33, 13, 34};
        System.out.println(print.medianArr(arr));
    }
    int medianArr(int[] arr) {
        if (arr.length == 0) {
            System.err.println("arr.length == 0");
            throw new RuntimeException("arr.length == 0");
        }

        Arrays.stream(arr).sorted();
        if (arr.length % 2 == 0) {
            return (arr[arr.length/2] + arr[(arr.length/2)-1])/2;
        }
        return arr[arr.length/2];
    }
}
