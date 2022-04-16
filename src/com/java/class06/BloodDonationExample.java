package com.java.class06;
// Nested condition / nested if-else

import java.util.Scanner;

//Wright program to print eligibility for the blood donation
// based on age and weight. Age >= 18, weight >= 50
public class BloodDonationExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = sc.nextInt();

        System.out.println("Enter your weight");
        int weight = sc.nextInt();

        if (age < 18) {
            if (weight >= 50) {
                System.out.println("You are eligible");
            }else{
                System.out.println("You are under weight");
            }

        }else{
            if (weight > 50) {
                System.out.println("You are too young");
            }else{
                System.out.println("You are totally not eligible");
            }
        }






    }
}
