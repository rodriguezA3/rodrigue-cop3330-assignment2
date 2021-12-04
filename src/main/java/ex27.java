/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Adan Rodriguez
 */
package ex27;

import java.util.*;
class main {
    public static int validn(String s){
        if(s.length() == 0)
            return 2;
        if(s.length() < 2)
            return 0;
        return 1;
    }
    public static int validid(String s){
        //s.charAt(2) != '-' || Character.isLetter(s.charAt(0)) == false || Character.isLetter(s.charAt(1)) == false ||
        if(s.matches("^[A-Z]{2}-[0-9]{4}$") == false)
            return 0;
        return 1;
    }
    public static int validzc(int zc){
        if (String.valueOf(zc).length() != 5)
            return 0;
        return 1;
    }
    public static void validateInput(String fn, String ln, int zc, String id){
        if(validn(fn) == 1 && validn(ln) == 1 && validzc(zc) == 1 && validid(id) == 1)
            System.out.printf("There were no errors found.");
        if(validn(fn) == 0)
            System.out.printf("The first name must be at least 2 characters long.\n");
        if(validn(fn) == 2)
            System.out.printf("The first name must be at least 2 characters long.\nThe first name must be filled in.\n");
        if(validn(ln) == 0)
            System.out.printf("The last name must be at least 2 characters long.\n");
        if(validn(ln) == 2)
            System.out.printf("The last name must be at least 2 characters long.\nThe last name must be filled in.\n");
        if(validid(id) == 0)
            System.out.printf("The employee ID must be in the format of AA-1234.\n");
        if(validzc(zc) == 0)
            System.out.printf("The zipcode must be a 5 digit number.");
    }
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        System.out.printf("Enter the first name: ");
        String fn = sc.nextLine();
        System.out.printf("Enter the last name: ");
        String ln = sc.nextLine();
        System.out.printf("Enter the ZIP code: ");
        int zc = sc.nextInt();
        sc.nextLine();
        System.out.printf("Enter the employee ID: ");
        String id = sc.nextLine();
        validateInput(fn, ln, zc, id);
    }
}
