package com.java.class12;

import java.util.Scanner;

public class ForLoopExample {
    public static void main(String[] args) {

//        for (int i = 1; i <= 10; i++){
//            if (i % 2 == 0){
//            System.out.println(i);}
//        }
        ///////////////////
//        for (int i = 2; i <= 10; i+=2){
//                System.out.println(i);
//        }
        ///////////////////////////////
//        for (int i = 1; i <= 10; i++)
//            System.out.println(i);
        ///////////////////////////
//        for (int i = 10; i >= 1; i--) // From 10 t0 1
//            System.out.println(i);
        /////////////////////////////
//        for (int i = 9; i >= 1; i -=2) // Only odd numbers 9 - 1
//            System.out.println(i);
        /////////////////////////////////////
//        int sum = 0;
//        for (int i = 1; i <= 10; i++){ //Sum of numbers from 1 to 10 = 55
//            sum += i;
//        }
//            System.out.println(sum);
        ////////////////////////////////


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number for n!:");
        int number = sc.nextInt();
        int factorial = 1;
        for (int i = 1; i <= number; i++){ //Factorial of numbers from 1 to 5 = 120
            factorial *= i;
        }
        System.out.println(factorial);
    }
}
