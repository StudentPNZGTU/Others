package edu.penzgtu.oop.dodecahedron;

import java.util.Scanner;

/**
 * Вычисление объема додекаедра по длине: (15 + 7*sqrt(5))*(a^3/4)
 */
public class App
{
    public static void main( String[] args )
    {
        System.out.println("Determine the length of the dodecahedron : ");
        Scanner scan = new Scanner(System.in);
        if (!scan.hasNextDouble()) {
            throw new IncompatibleClassChangeError("Error type input");
        }
        System.out.println(volumeDodecahedron(scan.nextDouble()));
    }

    static double volumeDodecahedron(double a) {
        if (a <= 0) {
            throw new ArithmeticException("Number error length <= 0!");
        }
        return 7.663118960624632*Math.pow(a, 3);
    }
}