package com.java.class07;
import java.util.Scanner;
// Take 1 num. (Marks) from user
// 90 to 100 => grade A
// 80 to 89 => grade B
// 70 to 79 => grade C
// 60 to 69 => grade D
// 50 to 59 => grade E
// 0 to 49 => grade Fail

import java.util.Scanner;

public class LadderIfElseWithLogicalOperatorAssignment {
    public static void main(String[] args) {
        System.out.println("Enter your Mark: ");
        Scanner sc = new Scanner(System.in);
        int mark = sc.nextInt();

        if (mark >= 90 && mark <= 100) {
            System.out.println("Grade A");
        }
        else if (mark >= 80 && mark <= 89) {
            System.out.println("Grade B");
        }
        else if (mark >= 70 && mark <= 79) {
            System.out.println("Grade C");
        }
        else if (mark >= 60 && mark <= 69) {
            System.out.println("Grade D");
        }
        else if (mark >= 50 && mark <= 59) {
            System.out.println("Grade E");
        }
        else if (mark >= 0 && mark <= 49) {
            System.out.println("Grade Fail");
        }else {
            System.out.println("You entered wrong mark!");
        }
    }
}

