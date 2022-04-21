package com.java.homework;

public class HW_042122_Method_5Divisor {
    public static void main(String[] args) {
        for (int n = 1; n <= 50; n++) {
            if (_5Divisors(n)) {
                System.out.print(n + " ");
            }
        }
    }

    static boolean _5Divisors(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        if (count > 5) {
            return true;
        } else {
            return false;
        }
    }


}
