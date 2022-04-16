package com.java.class05;

import java.util.Scanner;

public class ScannerClassExample {
    public static void main(String[] args) {
        System.out.println("To compare two numbers enter them, please.");
        Scanner sc = new Scanner((System.in));
        int num1 = sc.nextInt(), num2 = sc.nextInt();
        if (num1 > num2) {
            System.out.printf("%s is greater than %s", num1, num2);
        }else if (num2 > num1){
            System.out.printf("%s is greater than %s", num2, num1);
        }else{
            System.out.println("Both numbers are equal.");
        }
    }
}
