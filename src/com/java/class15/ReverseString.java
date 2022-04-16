package com.java.class15;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        System.out.println("Enter any string: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        for (int i=str.length() - 1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }
//        System.out.println("Reversed word: "+ newchar);
    }
}
