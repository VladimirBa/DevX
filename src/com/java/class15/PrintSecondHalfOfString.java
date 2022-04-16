package com.java.class15;

import java.util.Scanner;

public class PrintSecondHalfOfString {
    public static void main(String[] args) {

        System.out.println("Enter any string: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        if (str.length() % 2 == 0) {
            System.out.println(str.substring(str.length() / 2, str.length()));
        } else {
            System.out.println(str.substring((str.length() / 2 + 1), str.length()));
        }
    }

}