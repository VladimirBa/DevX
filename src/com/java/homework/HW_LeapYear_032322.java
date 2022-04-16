package com.java.homework;

import java.util.Scanner;

public class HW_LeapYear_032322 {
    public static void main(String[] args) {
        System.out.println("Please, enter year to check if it is leap or not: ");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if (year % 400 == 0) {
            System.out.printf("%s is leap year.", year);
        }else if (year % 100 == 0) {
            System.out.printf("%s is not leap year.", year);
        }else if (year % 4 == 0) {
            System.out.printf("%s is leap year.", year);
        }else {
            System.out.printf("%s is not leap year.", year);
        }
    }
}
