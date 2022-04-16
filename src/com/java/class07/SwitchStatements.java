package com.java.class07;
// Take 1 num. (0 - 9) from user

import java.util.Scanner;

//Example input - 1, otput - One
//Example input - 7, otput - Seven
public class SwitchStatements {
    public static void main(String[] args) {
        System.out.println("Enter your number: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        switch  (number) {
            case 0 :
            System.out.println("ZERO");
                break;
            case 1 :
            System.out.println("ONE");
                break;
            case 2 :
            System.out.println("TWO");
                break;
            case 3 :
            System.out.println("THREE");
                break;
            case 4 :
            System.out.println("FOUR");
                break;
            case 5 : System.out.println("FIVE");
                break;
            default:
                System.out.println("Please, enter number from 0 to 5");
        }

//        switch (number) {
//            case 0 -> System.out.println("ZERO");
//            case 1 -> System.out.println("ONE");
//            case 2 -> System.out.println("TWO");
//            case 3 -> System.out.println("THREE");
//            case 4 -> System.out.println("FOUR");
//            case 5 -> System.out.println("FIVE");
//            default -> System.out.println("Please, enter number from 0 to 5");
//        }

    }
}
