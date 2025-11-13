package com.demo;

import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept string from user
        System.out.print("Enter a string to check for palindrome: ");
        String input = scanner.nextLine();

        // Create stack with size equal to input length
        MyStack stack = new MyStack(input.length());

        // Push all characters to stack
        for (char ch : input.toCharArray()) {
            stack.push(ch);
        }

        // Pop characters to build reversed string
        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }

        // Check for palindrome
        if (input.equals(reversed.toString())) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is NOT a palindrome.");
        }

        scanner.close();
    }
}
