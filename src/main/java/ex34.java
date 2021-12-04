package ex34;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Adan Rodriguez
 */
import java.util.Scanner;
class App {
    public static void main( String[] args ) {
        String[] employeeNamesArray  = new String [5];
        employeeNamesArray[0] = "John Smith";
        employeeNamesArray[1] = "Jackie Jackson";
        employeeNamesArray[2] = "Chris Jones";
        employeeNamesArray[3] = "Amanda Cullen";
        employeeNamesArray[4] = "Jeremy Goodwin";
        System.out.println("\nThere are 5 employees:\nJohn Smith\nJackie Jackson\nChris Jones\nAmanda Cullen\nJeremy Goodwin ");

        System.out.print("\nEnter an employee name to remove: ");
        Scanner employeeNameInput = new Scanner(System.in);
        String employeeName = employeeNameInput.nextLine();

        System.out.println("\nThere are 4 employees: ");

        for(int i = 0; i < 5; i++) {
            if (!(employeeNamesArray[i].equals(employeeName))) {
                System.out.println(employeeNamesArray[i]);
            }
        }

    }
}