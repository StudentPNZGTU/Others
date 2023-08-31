package com.mycompany.app;

import java.util.Scanner;

/**
 * application
 */
public class App
{
    public static void main( String[] args )
    {
        System.out.println( "How many times do we ride?" );
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();

        System.out.println("Quantity elevators?");
        int quantity = scanner.nextInt();

        System.out.println("How many floors?");
        int maximum = scanner.nextInt();

        Elevators e = new Elevators();
        e.max = maximum;
        e.quantity = quantity;
        e.count = count;
        Elevator.countGenerate(e);
    }
}
