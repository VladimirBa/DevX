package com.java.homework;

import java.util.Scanner;

//1. Write a java program to get marks from users and print grades based on marks (feel free to use any statements)
//        If marks are from 90 to 100 Print A
//        If marks are from 80 to 89 Print B
//        If marks are from 70 to 79 Print C
//        If marks are from 60 to 69 Print D
//        If marks are from 50 to 59 Print E
//        If marks are from 0 to 49 Print Fail
public class HW_033022_1 {
    public static void main(String[] args) {
        System.out.println("Please, enter your mark");

        Scanner scan = new Scanner(System.in);
        int mark = scan.nextInt();

        if (mark >= 90 && mark <= 100) {
            System.out.println("A");
        } else if (mark >= 80) {
            System.out.println("B");
        } else if (mark >= 70) {
            System.out.println("C");
        } else if (mark >= 60) {
            System.out.println("D");
        } else if (mark >= 50) {
            System.out.println("E");
        } else if (mark >= 0) {
            System.out.println("Fail");
        }
    }
}
