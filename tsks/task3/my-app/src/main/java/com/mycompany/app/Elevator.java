package com.mycompany.app;

import java.util.Arrays;
import java.util.Scanner;

/**
 * В здании N этажей и M лифтов, которые вызываются одной кнопкой. На первом всегда должен быть свободный лифт.
 * По нажатию на кнопку на любом этаже должен приехать лифт, расположенный наиболее близко.
 * Реализуйте задачу, применив принципы ООП.
 */

public class Elevator
{
    public static void countGenerate(Elevators e) {
        e.elevators = new int[e.quantity];
        Arrays.fill(e.elevators, 1);
        int i = 0;
        while (i < e.count) {
            elevator(recursiveInput(e), e);
            i++;
        }
        System.out.println("-----------------------------------");
        System.out.println("Well done, you've had a great ride)");
    }

    private static int recursiveInput(Elevators e) {
        System.out.println("Which floor will we go up/down to?");
        Scanner scanner = new Scanner(System.in);
        int floor = scanner.nextInt();
        if (floor > e.max || floor < 1) {
            System.out.println("Wrong floor!");
            return recursiveInput(e);
        }
        return floor;
    }
    private static void elevator(int floorNum, Elevators e) {
        int ind = SearchMin(floorNum, e);
        System.out.println("We took the elevator under the number " + ind + " from the " + e.elevators[ind] + " floor");
        e.elevators[ind] = floorNum;
    }

    private static int SearchMin(int floorNum, Elevators e) {
        int min = 1000000000;
        int ind = 0;
        for (int i = 0; i < e.elevators.length; i++) {
            if (Math.abs(floorNum - e.elevators[i]) < min) {
                min = Math.abs(floorNum - e.elevators[i]);
                ind = i;
            }
        }
        return ind;
    }
}

class Elevators {
    int quantity;
    int[] elevators;
    int max;
    int count;
}
