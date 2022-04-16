package com.java.homework;

import java.util.Scanner;

public class HW_040622_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount of numbers for multiplication table:");
        int number = sc.nextInt();
        System.out.println("Enter the multiplier for multiplication table:");
        int multiplier = sc.nextInt();
        int i = 1;
        while (i <= number) {
            System.out.println(multiplier * i++);
        }
    }
}
