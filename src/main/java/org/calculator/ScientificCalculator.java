// src/main/java/org/calculator/ScientificCalculator.java
package org.calculator;

// ScientificCalculator.java
// Author: Girish Kumar Sahu
// Date: 25th Feb 2025
// Mini Project: Scientific Calculator with DevOps

import java.util.Scanner;

public class ScientificCalculator {

    public static void main(String[] args) {
        runCalculator();
    }

    public static void runCalculator() {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            displayMenu();
            choice = sc.nextInt();
            processChoice(choice, sc);
        } while (choice != 5);

        sc.close();
    }

    private static void displayMenu() {
        System.out.println("\nScientific Calculator");
        System.out.println("1. Square Root (√x)");
        System.out.println("2. Factorial (x!)");
        System.out.println("3. Natural Logarithm (ln(x))");
        System.out.println("4. Power (x^b)");
        System.out.println("5. Exit");
        System.out.print("Enter your choice: ");
    }

    private static void processChoice(int choice, Scanner sc) {
        switch (choice) {
            case 1:
                System.out.print("Enter number: ");
                double num = sc.nextDouble();
                System.out.println("Square Root: " + calculateSquareRoot(num));
                break;

            case 2:
                System.out.print("Enter number: ");
                int n = sc.nextInt();
                System.out.println("Factorial: " + calculateFactorial(n));
                break;

            case 3:
                System.out.print("Enter number: ");
                double x = sc.nextDouble();
                System.out.println("Natural Logarithm: " + calculateLogarithm(x));
                break;

            case 4:
                System.out.print("Enter base (x): ");
                double base = sc.nextDouble();
                System.out.print("Enter exponent (b): ");
                double exponent = sc.nextDouble();
                System.out.println("Power: " + calculatePower(base, exponent));
                break;

            case 5:
                System.out.println("Exiting...");
                break;

            default:
                System.out.println("Invalid choice! Please try again.");
        }
    }

    public static double calculateSquareRoot(double num) {
        return Math.sqrt(num);
    }

    public static long calculateFactorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
        }
        if (n == 0 || n == 1) return 1;
        long fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static double calculateLogarithm(double x) {
        if (x <= 0) {
            throw new IllegalArgumentException("Logarithm is not defined for non-positive numbers.");
        }
        return Math.log(x);
    }

    public static double calculatePower(double base, double exponent) {
        return Math.pow(base, exponent);
    }
}