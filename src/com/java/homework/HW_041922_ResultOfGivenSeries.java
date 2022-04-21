package com.java.homework;

public class HW_041922_ResultOfGivenSeries {
    public static void main(String[] args) {
        int sum = 0;
        int n;
        for (int i = 1; i <= 10; i++) {
            if (i % 3 == 0) {
                n = - i;
            }else {
                n = i;
            }
            sum += n;
        }
        System.out.println("Sum of given sequence is: " + sum);


    }
}
