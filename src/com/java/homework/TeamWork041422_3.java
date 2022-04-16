package com.java.homework;

import java.util.Scanner;

/**
 * Take two words from the user, concatenate  words that have three characters one by one and print them
 * if any of the words has more than three characters print Error message "Incorrect input! Cannot merge".
 * <p>
 * ex
 * "ice", "sea"
 * <p>
 * <p>
 * output:
 * isceae
 * <p>
 * ex2:
 * "Hot", "Day"
 * <p>
 * output:
 * HDoaty
 * <p>
 * ex3:
 * "Hello", "Day"
 * output:
 * Incorrect input! Cannot merge
 */

public class TeamWork041422_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two words and each of no more than 3 letters:");
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        String newStr = "";

        if (str1.length() > 3 || str2.length() > 3) {
            System.out.println("Incorrect input! Cannot merge");
        } else {
            for (int i = 0; i < 3; i++) {
                newStr = newStr + str1.charAt(i) + str2.charAt(i);
            }
        }
        System.out.println(newStr);


    }
}
