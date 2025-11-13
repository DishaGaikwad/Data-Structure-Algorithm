package com.demo;

import java.util.Scanner;


public class CircularLinkedList {
    Node head = null;

    // Insert before head
    public void insertBeforeHead(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            newNode.next = newNode;
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }

        newNode.next = head;
        temp.next = newNode;
        head = newNode;
    }

    // Insert at end
    public void insertAtEnd(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            newNode.next = newNode;
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }

        temp.next = newNode;
        newNode.next = head;
    }

    // Insert at specific position (1-based index)
    public void insertAtPosition(int value, int position) {
        if (position <= 1 || head == null) {
            insertBeforeHead(value);
            return;
        }

        Node newNode = new Node(value);
        Node temp = head;
        int count = 1;

        while (count < position - 1 && temp.next != head) {
            temp = temp.next;
            count++;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    // Display the circular linked list
    public void display() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        Node temp = head;
        do {
            System.out.print(temp.data + " → ");
            temp = temp.next;
        } while (temp != head);
        System.out.println("(back to head)");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CircularLinkedList list = new CircularLinkedList();

        while (true) {
            System.out.println("\n1. Insert before head");
            System.out.println("2. Insert at end");
            System.out.println("3. Insert at position");
            System.out.println("4. Display list");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter number to insert: ");
                    list.insertBeforeHead(sc.nextInt());
                    break;
                case 2:
                    System.out.print("Enter number to insert: ");
                    list.insertAtEnd(sc.nextInt());
                    break;
                case 3:
                    System.out.print("Enter number to insert: ");
                    int val = sc.nextInt();
                    System.out.print("Enter position (1-based index): ");
                    int pos = sc.nextInt();
                    list.insertAtPosition(val, pos);
                    break;
                case 4:
                    list.display();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid option.");
            }
        }
    }
}
