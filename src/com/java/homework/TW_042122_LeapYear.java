package com.java.homework;

import java.util.Scanner;
/**
 * Write a java program to find out if the given year is leap or not
 *
 *  sample output:
 * enter any calendar year : 2000
 * 2000 is a leap year
 */
public class TW_042122_LeapYear {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ;
        TW_042122_LeapYear leapYear = new TW_042122_LeapYear();

        //TODO write your code here
        System.out.println("Enter any calendar year :");
        int year = scanner.nextInt();
        if (leapYear.leapOrNot(year)) {
            System.out.println(year + " is a leap year");
        } else {
            System.out.println(year + " is not a leap year");
        }
    }

    public boolean leapOrNot(int year) {
        //TODO remove code for students...
        return ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0));
    }
}




