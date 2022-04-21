package com.java.class18;

import java.util.Scanner;

public class Merge2Words {

    public static void main(String[] args) {
        /**
         * Merge two words with three characters one by one and print them
         * if words have more than three characters print Error message "Incorrect input! Cannot merge".
         *
         * ex
         * "ice", "sea"
         *
         *
         * output:
         * isceae
         *
         * ex2:
         * "Hot", "Day"
         *
         * output:
         * HDoaty
         *
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two words and each of no more than 3 letters:");
        String word1 = sc.nextLine(); // isceae
        String word2 = sc.nextLine();
        System.out.println("Merging words: " + word1 + ", " + word2);

        System.out.println(printMerge(word1, word2)); // Call method inside System.out.println
    }

    static String printMerge(String word1, String word2) {
        String newStr = "";
        if (word1.length() > 3 || word2.length() > 3) {
            System.out.println("Incorrect input! Cannot merge");
        } else {
            for (int i = 0; i < word2.length(); i++) {
                newStr = newStr + word1.charAt(i) + word2.charAt(i); // newStr in the beginning to make string
                // concatenation. There is not + for chars
            }
        }
        return newStr;
    }
}
