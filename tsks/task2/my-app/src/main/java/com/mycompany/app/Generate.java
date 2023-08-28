package com.mycompany.app;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
public class Generate {
    public static List<Integer> generate(int value) {
        List<Integer> list = new ArrayList<Integer>();
        Random rand = new Random();
        for (int i = 0; i < value; i++) {
            list.add(rand.nextInt(100));
        }
        return list;
    }

    public static void printSortsLists() {
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 1; i < 10; i++) {
            list = generate(i);
            System.out.println("Before random " + list);
            list = Quicksort.Sort(list);
            System.out.println("After " + Quicksort.Sort(list));
        }
    }
}