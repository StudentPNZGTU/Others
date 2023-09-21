package edu.penzgtu.oop.hellouser;

import java.util.Scanner;

/**
 * Hello world!
 */
public class App
{
    public static void main( String[] args )
    {
        System.out.println( "Enter username: ");
        Scanner scan = new Scanner(System.in);
        if (scan.hasNextInt()) {
            throw new RuntimeException("Enter a string!");
        }

        System.out.println( "Hello, " + scan.next() + "!");
        scan.close();
    }
}
