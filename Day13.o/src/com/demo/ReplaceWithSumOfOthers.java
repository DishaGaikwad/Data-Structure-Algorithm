package com.demo;

import java.util.Scanner;

public class ReplaceWithSumOfOthers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Accept number of elements
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Create result array
        int[] result = new int[n];

        // Replace each element with sum of all other elements
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 0; j < n; j++) {
                if (i != j) {
                    sum += arr[j];
                }
            }
            result[i] = sum;
        }

        // Print result
        System.out.print("Output: ");
        for (int val : result) {
            System.out.print(val + " ");
        }
    }
}

