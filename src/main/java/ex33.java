package ex33;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Adan Rodriguez
 */
import java.util.*;
class main {
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        String[] r = {"Yes", "No", "Maybe", "Ask again later"};
        System.out.printf("What's your question?\n> ");
        sc.nextLine();
        int num = (int) (Math.random() * (3 + 1));
        System.out.printf("%s.", r[num]);
    }
}