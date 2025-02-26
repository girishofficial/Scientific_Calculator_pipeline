// src/main/java/org/calculator/ScientificCalculator.java
                    package org.calculator;

                    import java.util.Scanner;

                    public class ScientificCalculator {
                        public static void main(String[] args) {
                            Scanner sc = new Scanner(System.in);
                            int choice;

                            do {
                                System.out.println("\nScientific Calculator");
                                System.out.println("1. Square Root (√x)");
                                System.out.println("2. Factorial (x!)");
                                System.out.println("3. Natural Logarithm (ln(x))");
                                System.out.println("4. Power (x^b)");
                                System.out.println("5. Exit");
                                System.out.print("Enter your choice: ");
                                choice = sc.nextInt();

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
                            } while (choice != 5);

                            sc.close();
                        }

                        public static double calculateSquareRoot(double num) {
                            if (num < 0) {
                                throw new IllegalArgumentException("Number must be non-negative");
                            }
                            return Math.sqrt(num);
                        }

                        public static long calculateFactorial(int n) {
                            if (n < 0) {
                                throw new IllegalArgumentException("Number must be non-negative");
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
                                throw new IllegalArgumentException("Number must be positive");
                            }
                            return Math.log(x);
                        }

                        public static double calculatePower(double base, double exponent) {
                            return Math.pow(base, exponent);
                        }
                    }