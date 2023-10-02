package edu.penzgtu.oop.task12;

public class LeapYear {
    public static void main( String[] args ) {
        LeapYear obj = new LeapYear();

        for (int i = 0; i < 2024; i++) {
            if (obj.leapYear(i)) {
                System.out.println("Год високосный");
            } else {
                System.out.println("Год не високосный");
            }
        }
    }
    boolean leapYear(int value) {
        if ((value % 400 == 0) || (value % 100 != 0) && value % 4 == 0) {
            return true;
        }
        return false;
    }
}
