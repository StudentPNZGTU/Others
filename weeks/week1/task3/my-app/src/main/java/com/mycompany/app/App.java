package com.mycompany.app;

/**
 * application
 * limits: max num: int input
 * end the program: exit
 */
public class App
{
    public static void main( String[] args )
    {
        System.out.println("How many floors?");
        int maximum = Elevator.recursiveInput();

        System.out.println( "How many times do we ride?" );
        int count = Elevator.recursiveInput();

        System.out.println("Quantity elevators?");
        int quantity = Elevator.recursiveInput();

        Elevator.countGenerate(maximum, quantity, count);
    }
}
