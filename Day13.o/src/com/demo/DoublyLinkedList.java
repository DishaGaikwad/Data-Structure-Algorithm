package com.demo;

import java.util.Scanner;



public class DoublyLinkedList {
    Node head, tail;

    // Add node at the end
    public void add(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    // Display the list
    public void display() {
        Node temp = head;
        System.out.print("List: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Display in reverse from a given position
    public void displayReverseFromPosition(int position) {
        Node temp = head;
        int count = 1;

        while (temp != null && count < position) {
            temp = temp.next;
            count++;
        }

        if (temp == null) {
            System.out.println("Wrong position");
            return;
        }

        System.out.print("Reverse from position " + position + ": ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.prev;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DoublyLinkedList list = new DoublyLinkedList();

        System.out.println("Enter numbers to add to the list (-1 to stop):");
        while (true) {
            int num = sc.nextInt();
            if (num == -1) break;
            list.add(num);
        }

        list.display();

        System.out.print("Enter position to reverse from: ");
        int pos = sc.nextInt();
        list.displayReverseFromPosition(pos);
    }
}

