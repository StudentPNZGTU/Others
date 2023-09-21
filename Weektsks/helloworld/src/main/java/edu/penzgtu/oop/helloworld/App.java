package edu.penzgtu.oop.helloworld;

import java.util.Scanner;

/**
 * Hello world!
 */
public class App
{
    public static void main( String[] args )
    {
        System.out.println( "Enter username");
        Scanner scan = new Scanner(System.in);
        String userName = scan.next();
        System.out.println( "Hello " + userName + "!");
        scan.close();
    }
}
