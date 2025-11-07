package com.test;

import com.linkedlistdemo.DoublyCircularLinkedList;

public class TestDoublyCircularLinkedList {
    public static void main(String[] args) {
    	DoublyCircularLinkedList list = new DoublyCircularLinkedList();

        System.out.println("Adding nodes:");
        list.addNode(11);
        list.addNode(10);
        list.addNode(20);
        list.addNode(30);
        list.displayData(); // Expected: 10 <-> 20 <-> 30 <-> head

        System.out.println("\nAdding 5 at position 1:");
        list.addByPosition(1, 5);
        list.displayData(); // Expected: 5 <-> 10 <-> 20 <-> 30 <-> head

        System.out.println("\nAdding 15 at position 3:");
        list.addByPosition(3, 15);
        list.displayData(); // Expected: 5 <-> 10 <-> 15 <-> 20 <-> 30 <-> head

        System.out.println("\nDeleting node at position 1:");
        list.deleteByPosition(1);
        list.displayData(); // Expected: 10 <-> 15 <-> 20 <-> 30 <-> head

        System.out.println("\nDeleting node with value 20:");
        list.deleteByValue(20);
        list.displayData(); // Expected: 10 <-> 15 <-> 30 <-> head

        System.out.println("\nTrying to delete value 100 (not in list):");
        list.deleteByValue(100); // Expected: 100 not found
    }
}
