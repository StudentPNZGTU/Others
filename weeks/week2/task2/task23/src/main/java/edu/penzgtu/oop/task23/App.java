package edu.penzgtu.oop.task23;

import java.util.Arrays;

public class App {
    public static void main( String[] args ) {
        App print = new App();
        int value = 21;
        System.out.println("Input: " + value + Arrays.toString(print.simpleNum(value)));
    }

    int[] simpleNum(int value) {
        int[] arr;
        arr = new int[value+1];
        for (int i = 2; i < value+1; ++i) {
            arr[i] = i;
        }
        int i = 2;
        while (i < value+1) {
            if (arr[i] != 0) {
                int j = i+i;
                while (j < value+1) {
                    arr[j] = 0;
                    j = j + i;
                }
            }
            i++;
        }
        int[] res;
        int count = 0;
        i = 0;
        for (int k = 2; k < arr.length; k++) {
            if (arr[k] != 0) {
                count++;
            }
        }
        res = new int[count];
        for (int j = 0; j < arr.length; j++) {
            if (i == res.length) {
                break;
            }
            if (arr[j] != 0) {
                res[i] = arr[j];
                i++;
            }
        }
        return res;
    }
}
