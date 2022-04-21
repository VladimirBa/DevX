package com.java.class16;

import java.util.Locale;
import java.util.Scanner;

public class FindOccuranceOfChar {
    public static void main(String[] args) {
        System.out.println("Enter any sentence: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println("There are " + str.length() + " characters totally in the sentence");
        System.out.println("Enter a char that you want to find in entered sentence");

        char c = sc.next().charAt(0);  //<= Does not work with it!
//        char c = ' ';
        int counter = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.toLowerCase().charAt(i) == c) {
                counter++;
            }
        }
        System.out.println("There are " + counter + " characters " + c + " in the entered sentence.");

    }
}
