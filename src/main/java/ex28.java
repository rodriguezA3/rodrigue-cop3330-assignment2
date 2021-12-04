package ex28;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Adan Rodriguez
 */

import java.util.Scanner;

class App {
    public static void main( String[] args ) {
        int sumResult = 0;

        for(int i = 0; i < 5; i++) {
            System.out.println("\nEnter a number: ");
            Scanner numberInput = new Scanner(System.in);
            int number = numberInput.nextInt();

            sumResult = sumResult + number;
        }

        System.out.println("\nThe total is " + sumResult + ".");

    }
}
