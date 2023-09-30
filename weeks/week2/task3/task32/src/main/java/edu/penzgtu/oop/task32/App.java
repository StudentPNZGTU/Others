package edu.penzgtu.oop.task32;

public class App {
    public static void main( String[] args ) {
        App print = new App();

        int[] arr = {1, 2, 3, 4, 5, 5, 5, 6};
        System.out.println(print.medianArr(arr));
    }
    int medianArr(int[] arr) {
        if (arr.length % 2 == 0) {
            return (arr[arr.length/2] + arr[(arr.length/2)-1])/2;
        }
        return arr[arr.length/2];
    }
}