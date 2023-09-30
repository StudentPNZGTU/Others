package edu.penzgtu.oop.task12;

public class App {
    public static void main( String[] args ) {
        App print = new App();

        for (int i = 0; i < 2024; i++) {
            print.leapYear(i);
        }
    }
    void leapYear(int value) {
        if (value % 400 == 0 || value % 4 == 0) {
            System.out.printf("%d год високосный\n", value);
        } else if (value % 100 == 0) {
            System.out.printf("%d год не високосный\n", value);
        } else {
            System.out.printf("%d год не високосный\n", value);
        }
    }
}
