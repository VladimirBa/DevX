package com.java.homework;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word to check if it is Palindrome: ");
        String str = input.nextLine();
        String reverseStr = "";


        for (int i = (str.length() - 1); i >= 0; --i) {
            reverseStr = reverseStr + str.charAt(i);
        }

        if (str.toLowerCase().equals(reverseStr.toLowerCase())) {
            System.out.println(str + " is a Palindrome word.");
        } else {
            System.out.println(str + " is not a Palindrome word.");
        }
    }
    //////////////////////////////////// Another method for Palindrome:
//    public static void main(String[] args) {
//        System.out.println("Enter any String: ");
//        Scanner sc = new Scanner(System.in);
//        String str = sc.nextLine();
//        IsPalindrome(str);
//    }
//
//
//    static void IsPalindrome(String str) {
//        String res = "";
//        for (int i = 0; i < str.length() / 2; i++) {
//
//            if (str.charAt(i) == str.charAt(str.length() - 1 - i)) {
//                res = "Palindrome";
//            } else {
//                res = "Not Palindrome";
//            }
//        }
//        System.out.println(res);
//    }
}
