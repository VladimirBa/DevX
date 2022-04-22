package com.java.homework;

public class HW_042122_Method_DivisibleBy6 {
    public static void main(String[] args) {
        for (int n =1; n <= 50; n++) {
            if (DivisibleBy6(n)) {
                System.out.print(n + " ");
            }
        }
    }
    static boolean DivisibleBy6(int n) {
        if (n % 6 == 0) {
            return true;
        }else{
            return false;
        }
    }




}
