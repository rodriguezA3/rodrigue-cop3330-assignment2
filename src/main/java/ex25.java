package ex25;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Adan Rodriguez
 */

import java.util.Scanner;

class App {
    public static void main( String[] args ) {

        System.out.println("\nEnter a password, and I'll check the password's strength. ");
        System.out.println("\nEnter a password: ");
        Scanner passwordInput = new Scanner(System.in);
        String password = passwordInput.next();

        int passwordStrength = passwordValidator(password);

        switch (passwordStrength) {
            case 1:
                System.out.println("\nThe password \"" + password + "\" is a very weak password. ");
                break;
            case 2:
                System.out.println("\nThe password \"" + password + "\" is a weak password. ");
                break;
            case 3:
                System.out.println("\nThe password \"" + password + "\" is a strong password. ");
                break;
            case 4:
                System.out.println("\nThe password \"" + password + "\" is a very strong password. ");
                break;
        }

    }

    public static int passwordValidator(String password) {

        int veryWeakPassword = 1;
        int weakPassword = 2;
        int strongPassword = 3;
        int veryStrongPassword = 4;


        int numPasswordNumbers = 0;
        int numSpecialCharacters = 0;


        String specialCharactersString = "!@#$%&*()'+,-./:;<=>?[]^_`{|}~";

        int passwordLength = password.length();

        if(passwordLength < 8) {
            if(password.matches("[0-9]+")) {
                return veryWeakPassword;
            }
            else if(password.matches("[a-zA-Z]+")) {
                return weakPassword;
            }
            else {
                return weakPassword;
            }
        }
        else { //if password has 8 or more characters
            char[] passwordArray = password.toCharArray();

            for (int i = 0; i < passwordLength; i++) {
                if(Character.isDigit(passwordArray[i])) {
                    numPasswordNumbers++;
                }
                if(specialCharactersString.contains(Character.toString(passwordArray[i]))) {
                    numSpecialCharacters++;
                }
            }
            if((numPasswordNumbers > 1) && (numSpecialCharacters > 0)) {
                return veryStrongPassword;
            }
            else if(numPasswordNumbers >= 1) {
                return strongPassword;
            }
            else if((numPasswordNumbers == 0) && (numSpecialCharacters > 0)) {
                return strongPassword;
            }
            else {
                return strongPassword;
            }
        }
    }
}

