package edu.penzgtu.oop.task31;

public class App {
    public static void main( String[] args ) {
        App print = new App();

        double[] arr = {1, 2, 3, 4, 5, 5, 5};
        System.out.println(print.countMax(arr));
    }
    int countMax(double[] arr) {
        int count = 0;
        double max = -100000000;

        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        for (int k = 0; k < arr.length; k++) {
            if (arr[k] == max) {
                count++;
            }
        }
        return count;
    }
}