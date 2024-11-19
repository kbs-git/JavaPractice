package com.qapitol.javaPractice;

import java.util.Scanner;

public class Caluculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        while (true) {
            System.out.println("Menu:");
            System.out.println("1 -> Add:");
            System.out.println("2 ->Subtract");
            System.out.println("3 ->Multiple");
            System.out.println("4 ->Divide");
            System.out.println("0 ->Exit");

            System.out.print("Enter the option to perform actions");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Option 1 Selected: Addition");
                    System.out.println("Enter num1");
                    int num1=scanner.nextInt();
                    System.out.println("Enter num1");
                    int num2=scanner.nextInt();
                    System.out.println("Result of addition: " + (num1 + num2));
                    break;

                case 2:
                    System.out.println("Option 2 Selected: Subtraction");
                    System.out.print("Enter num1 ");
                    double num3 = scanner.nextDouble();
                    System.out.print("Enter num2 ");
                    double num4 = scanner.nextDouble();
                    System.out.println("Result of subtraction: " + (num3 - num4));
                    break;

                case 3:
                    System.out.println("Option 3 Selected: Multiplication");
                    System.out.print("Enter num1 ");
                    double num5 = scanner.nextDouble();
                    System.out.print("Enter num2 ");
                    double num6 = scanner.nextDouble();
                    System.out.println("Result of multiplication: " + (num5 * num6));
                    break;

                case 4:
                    System.out.println("Option 4 Selected: Division");
                    System.out.print("Enter num1 ");
                    double num7 = scanner.nextDouble();
                    System.out.print("Enter num2");
                    double num8 = scanner.nextDouble();
                    if (num8 != 0) {
                        System.out.println("Result of division: " + (num8 / num7));
                    } else {
                        System.out.println("Error: Division by zero is not allowed.");
                    }
                    break;

                case 0:
                    System.out.println("Exiting program.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        }
    }
}
