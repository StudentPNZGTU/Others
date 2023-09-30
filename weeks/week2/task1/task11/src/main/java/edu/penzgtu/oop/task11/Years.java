package edu.penzgtu.oop.task11;

public class Years {

    public static void main( String[] args ) {
        Years obj = new Years();

        for (int i = 0; i < 123; i++) {
            System.out.println(i + obj.getYears(i));
        }
    }
    String getYears(int value) {
        String string = "";
        int mod = value%10;
        if (value%100 > 10 && value%100 < 15) {
            string += " лет";
        } else if (mod == 1) {
            string += " год";
        } else if (mod == 0) {
            string += " лет";
        } else if (0 < mod && mod < 5) {
            string += " года";
        }else {
            string += " лет";
        }
        return string;
    }
}
