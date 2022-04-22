package com.java.homework;

import java.util.Scanner;
/**
 *
 * Write a java program that calculates to metric system
 * if incorrect input print result as -1
 *
 * 1 lb = 0.45359237 kg
 * 1 oz = 28.34952 g
 *
 * 1 ft = 0.3048 m
 * 1 ft = 30.48 cm
 * 1 in = 2.54cm
 *
 * C = (F - 32) × 5/9
 *
 *
 * Example output:
 * Enter amount:
 * 1
 * Enter type:
 * in
 * To:
 * cm
 * Result: 2.54
 *
 */
public class TW_042122_Converter {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        TW_042122_Converter converter = new TW_042122_Converter();
        System.out.println("Enter amount: ");
        double amount = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Enter from what type you want to convert: ");
        String type = scanner.nextLine();
        System.out.println("Enter to what type you want to convert: ");
        String to = scanner.nextLine();
        //TODO write your code here
        if (converter.isLength(type)) {
            converter.printResult(converter.calculateLength(type, to, amount));
        } else if (converter.isWeight(type)) {
            converter.printResult(converter.calculateWeight(type, to, amount));
        } else if (converter.isTemperature(type)) {
            converter.printResult(converter.calculateTemperature(type, to, amount));
        }

    }

    public boolean isWeight(String type) {
        // TODO IMPLEMENT METHOD

        return (type.equals("lb") || type.equals("oz"));
    }

    public boolean isLength(String type) {
        // TODO IMPLEMENT METHOD
        return (type.equals("ft") || type.equals("in"));
    }

    public boolean isTemperature(String type) {
        // TODO IMPLEMENT METHOD
        return (type.equals("C") || type.equals("F"));
    }

    public double calculateWeight(String type, String to, double amount) {
        // TODO IMPLEMENT METHOD
        if (type.equals("lb")) {
            if (to.equals("kg")) {
                return amount * 0.45359237;
            }
            if (to.equals("g")) {
                return amount * 453.59237;
            }
        }
        if (type.equals("oz")) {
            if (to.equals("kg")) {
                return amount * 0.02834952;
            }
            if (to.equals("g")) {
                return amount * 28.34952;
            }
        }
        return -1;
    }

    public double calculateLength(String type, String to, double amount) {
        // TODO IMPLEMENT METHOD
        if (type.equals("ft")) {
            if (to.equals("m")) {
                return amount * 0.3048;
            }
            if (to.equals("cm")) {
                return amount * 30.48;
            }
        }
        if (type.equals("in")) {
            if (to.equals("cm")) {
                return amount * 2.54;
            }
            if (to.equals("m")) {
                return amount * 0.0254;
            }
        }
        return -1;
    }

    public double calculateTemperature(String type, String to, double amount) {
        // TODO IMPLEMENT METHOD
        if (type.equals("C") && to.equals("F")) {
            return (amount * 9 / 5) + 32;
        }
        if (type.equals("F") && to.equals("C")) {
            return (amount - 32) * 5 / 9;
        }
        return -1;
    }

    public void printResult(double result) {
        // TODO IMPLEMENT METHOD
        System.out.println(result);
    }

}






