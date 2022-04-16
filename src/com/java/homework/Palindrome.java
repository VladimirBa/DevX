package com.java.homework;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word to check if it is Palindrome: ");
        String str = input.nextLine();
        String reverseStr = "";

        for (int i = (str.length() - 1); i >=0; --i) {
            reverseStr = reverseStr + str.charAt(i);
        }

        if (str.toLowerCase().equals(reverseStr.toLowerCase())) {
            System.out.println(str + " is a Palindrome word.");
        }
        else {
            System.out.println(str + " is not a Palindrome word.");
        }
    }
}
