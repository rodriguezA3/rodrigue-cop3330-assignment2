/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright Adan Rodriguez
 */
package ex24;

import java.util.*;
class main {
    public static int isAnagram(String str1, String str2){
        if(str1.length() != str2.length())
            return 0;
        char[] a1 = str1.toLowerCase().toCharArray();
        char[] a2 = str2.toLowerCase().toCharArray();
        Arrays.sort(a1);
        Arrays.sort(a2);
        if (Arrays.equals(a1,a2))
            return 1;
        else
            return 0;
    }
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        System.out.printf("Enter two strings and i'll tell you if they're anagrams:\nEnter the first string: ");
        String str1 = sc.nextLine();
        System.out.printf("Enter the second string: ");
        String str2 = sc.nextLine();
        if (isAnagram(str1,str2) == 1)
            System.out.printf("\"%s\" and \"%s\" are anagrams.", str1, str2);
        else
            System.out.printf("\"%s\" and \"%s\" are not anagrams.", str1, str2);
    }
}
