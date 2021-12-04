package ex30;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Adan Rodriguez
 */
class multiplicationTable {
    public static void main(String[] args){

        for(int i =1;i< 13; i++){
            for(int j =1; j< 13;j++){
                System.out.format("%5d",i * j);
            }
            System.out.print("\n");
        }
    }
}