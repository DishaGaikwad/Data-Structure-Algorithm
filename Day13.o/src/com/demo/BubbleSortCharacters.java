package com.demo;

import java.util.Scanner;

public class BubbleSortCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;

        // Input validation for number of characters
        while (true) {
            System.out.print("Enter number of characters: ");
            if (sc.hasNextInt()) {
                n = sc.nextInt();
                if (n > 0) break;
                else System.out.println("Please enter a positive number.");
            } else {
                System.out.println("Invalid input. Please enter a valid integer.");
                sc.next(); // consume invalid token
            }
        }

        char[] arr = new char[n];

        // Accept characters
        System.out.println("Enter " + n + " characters:");
        for (int i = 0; i < n; i++) {
            while (true) {
                String input = sc.next();
                if (input.length() == 1) {
                    arr[i] = input.charAt(0);
                    break;
                } else {
                    System.out.println("Please enter a single character:");
                }
            }
        }

        // Bubble sort with swap count
        for (int i = 0; i < n - 1; i++) {
            int swaps = 0;
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap
                    char temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swaps++;
                }
            }
            System.out.println("Iteration " + (i + 1) + ": " + swaps + " swap(s)");
        }

        // Display sorted array
        System.out.print("Sorted characters: ");
        for (char c : arr) {
            System.out.print(c + " ");
        }
    }
}
