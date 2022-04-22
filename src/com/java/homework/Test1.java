package com.java.homework;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        for (int n = 1; n <= 50; n++) {
            if (_5Divisors(n) > 5) {
                System.out.print(n + " ");
            }
        }
    }
    static int _5Divisors(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        return count;
    }
}

