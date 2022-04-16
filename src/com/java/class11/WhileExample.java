package com.java.class11;

import java.util.Scanner;

// Write a program to print below numbers as many tames as user want:
// 6 12 18 24 30 .......
public class WhileExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, enter how many numbers we need to print:");
        int n = sc.nextInt();
        int i = 1;
        while (i <= n) {
            System.out.println(6 * i++); // @ input = 5=> 6 12 18 24 30
        }
    }
}
