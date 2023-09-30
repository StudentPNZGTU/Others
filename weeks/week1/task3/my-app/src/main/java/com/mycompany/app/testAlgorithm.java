package com.mycompany.app;

public class testAlgorithm {

    static Elevators e;
    public static int SearchMin(int floorNum) {

        int min = 1000000000;
        int ind = 0;
        for (int i = 0; i < e.elevators.length; i++) {
            if (Math.abs(floorNum - e.elevators[i]) < min) {
                min = Math.abs(floorNum - e.elevators[i]);
                ind = i;
            }
        }
        e.elevators[ind] = floorNum;
        return ind;
    }
}