package com.mycompany.app;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

/**
 * В здании N этажей и M лифтов, которые вызываются одной кнопкой. На первом всегда должен быть свободный лифт.
 * По нажатию на кнопку на любом этаже должен приехать лифт, расположенный наиболее близко.
 * Реализуйте задачу, применив принципы ООП.
 */

public class Elevator
{
    private static Elevators e = new Elevators();
    public static void countGenerate(int maximum, int quantity, int count) {
        e.max = maximum;
        e.quantity = quantity;
        e.count = count;
        e.elevators = new int[quantity];
        Arrays.fill(e.elevators, 1);

        int i = 0;
        while (i < e.count) {
            System.out.println("Which floor will we go up/down to?");
            elevator(recursiveInput());
            i++;
        }
        end();
    }

    public static int recursiveInput() {

        Scanner scanner = new Scanner(System.in);
        if (!scanner.hasNextInt()) {
            if (scanner.hasNextLine() && Objects.equals(scanner.nextLine(), "exit")) {
                end();
                System.exit(0);
            } else {
                System.out.println("Enter an integer!");
                return recursiveInput();
            }
        }
        int floor = scanner.nextInt();
        if (e == null) {
            return floor;
        }
        if (floor > e.max || floor < 1) {
            System.out.println("Wrong floor!");
            return recursiveInput();
        }
        return floor;
    }
    private static void elevator(int floorNum) {
        int ind = SearchMin(floorNum);
        System.out.println("We took the elevator under the number " + ind + " from the " + e.elevators[ind] + " floor");
        e.elevators[ind] = floorNum;
    }

    private static int SearchMin(int floorNum) {
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
    private static void end() {
        System.out.println("-----------------------------------");
        System.out.println("Well done, you've had a great ride)");
    }
}

class Elevators {
    int quantity = 0;
    int[] elevators = new int[0];
    int max = 1000000000;
    int count = 0;
}
