package com.qapitol.javaPractice;

import java.util.Random;
import java.util.Scanner;

public class CoinFlip {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of times to flip the coin: ");
        int numFlips = scanner.nextInt();

        Random random = new Random();

        int headsCount = 0;
        int tailsCount = 0;

        for (int i = 1; i <= numFlips; i++) {
            // Generate a random number (0 or 1)
            int flip = random.nextInt(2);
            if (flip == 0) {
                System.out.println("Flip " + i + ": Heads");
                headsCount++;
            } else {
                System.out.println("Flip " + i + ": Tails");
                tailsCount++;
            }
        }
        System.out.println("\nResults:");
        System.out.println("Heads: " + headsCount);
        System.out.println("Tails: " + tailsCount);
        scanner.close();
    }
}
