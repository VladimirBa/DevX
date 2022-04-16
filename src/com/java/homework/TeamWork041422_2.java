package com.java.homework;

import java.util.Scanner;

/**
 * Take an input from the user and print middle char(s)
 * 1) when odd number of chars and more than 2 chars, print a middle character. ex: cat -> a
 * 2) when even number of chars and more than 3 chars, print 2 middle characters. ex: java -> av
 * 3) if a single character, print character 3 times. ex: & -> &&&
 * 4) if a double character, print characters 2 times. ex: @@ -> @@@@
 */

public class TeamWork041422_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String str = sc.nextLine();
        String newStr = "";
        int length = str.length();
        int middle = str.length() / 2;

        if (length == 1) {
            newStr = str + str + str;
        } else if (length == 2 && str.charAt(0) == str.charAt(1)) {
            newStr = str + str;
        } else if (length % 2 == 1 && length > 2) {
            newStr = str.substring(middle, middle + 1);
        } else if (length % 2 == 0 && length > 3) {
            newStr = str.substring(middle - 1, middle + 1);
        }
        System.out.println(newStr);


    }
}
