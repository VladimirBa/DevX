package com.java.class13;

import java.util.Scanner;

public class StringAssignment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = "Java";
        String str2 = "Java";
        String str3 = sc.nextLine();
        if (str1 == str2) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
        if (str1 == str3) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
        if (str1.equals(str3)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }


    }
}
