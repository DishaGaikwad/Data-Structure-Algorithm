package com.demo;

import java.util.Scanner;

class MyStack {
    private char[] stack;
    private int top;
    private int capacity;

    // Constructor
    public MyStack(int size) {
        capacity = size;
        stack = new char[capacity];
        top = -1;
    }

    // Push operation
    public void push(char ch) {
        if (!isFull()) {
            stack[++top] = ch;
        } else {
            System.out.println("Stack is full. Cannot push " + ch);
        }
    }

    // Pop operation
    public char pop() {
        if (!isEmpty()) {
            return stack[top--];
        } else {
            System.out.println("Stack is empty. Cannot pop.");
            return '\0';
        }
    }

    // Display stack contents
    public void displayStack() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
        } else {
            System.out.print("Stack contents: ");
            for (int i = 0; i <= top; i++) {
                System.out.print(stack[i] + " ");
            }
            System.out.println();
        }
    }

    // Check if stack is empty
    public boolean isEmpty() {
        return top == -1;
    }

    // Check if stack is full
    public boolean isFull() {
        return top == capacity - 1;
    }
}


