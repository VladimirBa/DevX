package com.java.class17;

// To check numbers to print odd/even from 1 t0 15
public class MethodExample {

    static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 15; i++) {
            if (isEven(i)) {
                System.out.println(i + " is even");
            } else {
                System.out.println(i + " is odd");
            }
        }
    }
}
