package com.java.class07;

import java.util.Scanner;

public class PrintNumberOfDayUsingSwitch {
    public static void main(String[] args) {
        System.out.println("Enter name of the month: ");
        Scanner sc = new Scanner(System.in);
        String month = sc.nextLine();

        switch (month) {
            case "January" :
            case "March" :
            case "May" :
            case "July" :
            case "August" :
            case "October" :
            case "December" :
                System.out.printf("There are 31 days in %s.", month);
                break;
            case "February" :
                System.out.printf("There are 28/29 days  in %s.", month);
                break;

            case "April" :
            case "June" :
            case "September" :
            case "November" :
                System.out.printf("There are 30 days in %s.", month);
                break;
            default:
                System.out.println("Enter correct name of the month!");

        }

    }
}
