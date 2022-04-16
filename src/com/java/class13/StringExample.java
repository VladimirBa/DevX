package com.java.class13;

import java.util.Scanner;

public class StringExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = new String("Hello");
        String str2 = new String("Hello");

        if (str1 == str2) {
            System.out.println("True");
        }else{
            System.out.println("False");
        }

    }
}
