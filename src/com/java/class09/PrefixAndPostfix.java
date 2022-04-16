package com.java.class09;

import java.util.Scanner;

public class PrefixAndPostfix {
    public static void main(String[] args) {
//        int i = 7;
//        i--;
//        i--;
//                i++;
//        System.out.println(i); //6
//////////////////////////////////////////
//        int j = 7;
//        --j;
//        --j;
//        ++j;
//        System.out.println(j); //6
////////////////////////////
//        int i = 1;
//        int j = 4;
//        int k = j++ + i; // For first action we ignore ++ due to precedence.
//        First we do + and then ++, that affects only j.
//        int k = i++ + j++; //First + => i + j (1 +4). Then ++ and ++ => i = i++ (2), j = j++ (5)
///////////////////
//        System.out.println(i); // 2
//        System.out.println(j); // 5
//        System.out.println(k); // 5
///////////////////
//        int q = ++i + ++j;
//        System.out.println(i); // 2
//        System.out.println(j); // 5
//        System.out.println(q); // 7
//////////////////////////////
//        int q = ++j + i++;
//        System.out.println(i); // 2
//        System.out.println(j); // 5
//        System.out.println(q); // 6
///////////////////////////////////
//        int q = i++ + ++j;
//        System.out.println(i); // 2
//        System.out.println(j); // 5
//        System.out.println(q); // 6
////////////////////////////////////
//int i = 0;
//int j = 0;
////int m = 0;
//        int q = i++ + j++ + ++m;
//        System.out.println(i); //1
//        System.out.println(j); // 1
//        System.out.println(m); // 1
//        System.out.println(q); // 1
        ///////////////////////////////
//int k = i++ + j++;
//int m = k++;
//        System.out.println(i); //1
//        System.out.println(j); // 1
//        System.out.println(m); // 0
//        System.out.println(k); // 1
//////////////////////////////////////
//        int i = 4;
//        int j = 4;
//        int k = i++ + --j; // 4 + (4-1) = 7 // i = 5 // j = 3
//        int m = k++ - i++;//  m = 7 - 5 = 2 // k => 7 + 1 = 8 // i = 5 +1 = 6
//        System.out.println(i); //6
//        System.out.println(j); // 3
//        System.out.println(m); // 2
//        System.out.println(k); // 8
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c;
               // Swapping a numbers  a and b.

//        c = a;
//        a = b;
//        b = c;
//        // w/o using third var
        a = a + b;
        b = a - b;
        a = a - b;

        // w/o using third var
        a = a * b;
        b = a / b;
        a = a / b;

        System.out.println(a);
        System.out.println(b);

    }
}
