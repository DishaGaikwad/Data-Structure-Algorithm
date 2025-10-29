package com.day1.arrays;

import java.util.Scanner;

public class Array2DOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        int[][] arr = new int[rows][cols];

        System.out.println("Enter elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("\nArray:");
        printArray(arr);

        int sum = 0;
        for (int[] row : arr) {
            for (int val : row) {
                sum += val;
            }
        }
        System.out.println("\nSum of all elements: " + sum);

        // Transpose
        System.out.println("\nTranspose:");
        int[][] transpose = new int[cols][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = arr[i][j];
            }
        }
        printArray(transpose);

        // Search for an element
        System.out.print("\nEnter element to search: ");
        int key = sc.nextInt();
        boolean found = false;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (arr[i][j] == key) {
                    System.out.println("Found at position: (" + i + ", " + j + ")");
                    found = true;
                }
            }
        }
        if (!found) {
            System.out.println("Element not found.");
        }

        int max = arr[0][0], min = arr[0][0];
        for (int[] row : arr) {
            for (int val : row) {
                if (val > max) max = val;
                if (val < min) min = val;
            }
        }
        System.out.println("\nMaximum element: " + max);
        System.out.println("Minimum element: " + min);

        sc.close();
    }

    public static void printArray(int[][] array) {
        for (int[] row : array) {
            for (int val : row) {
                System.out.print(val + "\t");
            }
            System.out.println();
        }
    }
}
