package ex31;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Adan Rodriguez
 */
import java.util.*;
class main {
    public static int getinput(Scanner sc)
    {
        int n = 0;
        while(true) {
            String in = sc.nextLine();
            try {
                n = Integer.parseInt(in);
                break;
            } catch (NumberFormatException ne) {}
        }
        return n;
    }
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        System.out.printf("Resting Pulse: ");
        int rhr = getinput(sc);
        System.out.printf("Age: ");
        int age = getinput(sc);
        System.out.printf("Intensity\t| Rate\n------------|--------\n");
        for (int i = 55; i <= 95; i += 5)
            System.out.printf("%d%%\t\t\t| %.0f bpm\n", i, (((220 - (double)age) - (double)rhr) * ((double)i*.01)) + (double)rhr);
    }
}