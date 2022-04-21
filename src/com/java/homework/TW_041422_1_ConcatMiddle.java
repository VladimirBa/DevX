package com.java.homework;
/** Take two words from from the user and concatenate two words together
        * however if the concatenation creates a  double char, then omit one of the characters. Save the result of concatenation and print it out.
        * ex:
        * "abc" "cat" -> "abcat"
        *
        * ex2:
        * abc", "xyz" -> "abcxyz"
        *
        * ex3:
        * "happy", "yolk" -> happyolk

        */
import java.util.Scanner;
/* Concatenate 2 string. If last char of first equals first cahr of second remove one this char: abc + cat => abcat.*/
public class TW_041422_1_ConcatMiddle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        String newStr = "";
        if (str1.charAt(str1.length() - 1) == str2.charAt(0)) {
            newStr = str1 + str2.substring(1);
        } else {
            newStr = str1 + str2;
        }
        System.out.println(newStr);
    }
}
