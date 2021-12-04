/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Adan Rodriguez
 */
import java.util.*;
class badInput {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int returnRate=-1;


        do{
            System.out.print("What is the rate of return? ");
            returnRate = sc.nextInt();
            if(returnRate <= 0 )
                System.out.print("Invalid input!\n");


        } while(returnRate <=0 );

        int years = 72 / returnRate;
        System.out.print("It will take "+ years+" years to double your investment");
    }
}