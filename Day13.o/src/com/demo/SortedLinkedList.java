package com.demo;

import java.util.Scanner;

class Node {
    int data;
    Node next;
	public Node prev;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class SortedLinkedList {
    Node head;

    // Insert in sorted order
    public void insertSorted(int value) {
        Node newNode = new Node(value);

        // If list is empty or new node should be first
        if (head == null || value < head.data) {
            newNode.next = head;
            head = newNode;
            return;
        }

        // Traverse to find correct position
        Node current = head;
        while (current.next != null && current.next.data < value) {
            current = current.next;
        }

        // Insert node
        newNode.next = current.next;
        current.next = newNode;
    }

    // Display the list
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data);
            if (current.next != null) System.out.print(" → ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SortedLinkedList list = new SortedLinkedList();

        System.out.println("Enter numbers (-1 to stop):");
        while (true) {
            int num = sc.nextInt();
            if (num == -1) break;
            list.insertSorted(num);
            System.out.print("Current List: ");
            list.display();
        }
    }
}

