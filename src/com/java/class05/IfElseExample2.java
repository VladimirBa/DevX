package com.java.class05;

import java.util.Scanner;

public class IfElseExample2 {
    public static void main(String[] args) {
        System.out.println("Enter any number -");
        Scanner cs = new Scanner(System.in);

        int num = cs.nextInt();
        if (num % 2 == 0) {
            System.out.printf("Number %s is even", num);
        } else {
            System.out.printf("Number %s is odd", num);
        }
    }
}
