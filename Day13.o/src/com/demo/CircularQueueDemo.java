package com.demo;

import java.util.Scanner;

public class CircularQueueDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Set the size of the circular queue
        System.out.print("Enter size of circular queue: ");
        int n = sc.nextInt();

        int[] queue = new int[n];
        int front = 0, rear = 0, count = 0, removedCount = 0;

        while (true) {
            System.out.print("Enter number (-1 to stop): ");
            int num = sc.nextInt();

            if (num == -1) {
                break;
            }

            if (count == n) {
                // Queue is full, remove one from front
                front = (front + 1) % n;
                count--;
                removedCount++;
            }

            // Add new number
            queue[rear] = num;
            rear = (rear + 1) % n;
            count++;
        }

        System.out.println("Total numbers removed from queue: " + removedCount);
    }
}

