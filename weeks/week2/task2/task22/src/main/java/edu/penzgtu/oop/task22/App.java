package edu.penzgtu.oop.task22;

public class App {
    public static void main( String[] args ) {
        App print = new App();

        System.out.println(print.getSqrt(25));
    }

    int getSqrt(float value) {
        float x = 1.0F;
        if (value < 1) {
            System.out.println("Число меньше 1");
            throw new ArithmeticException("Sqrt(arg) < 0");
        }

        while (Math.abs(x*x-value) > 0.00001F) {
            x = (x * x + value) / 2.F / x;
        }
        return (int)x;
    }
}