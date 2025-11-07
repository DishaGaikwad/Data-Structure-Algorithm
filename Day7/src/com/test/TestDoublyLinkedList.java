package com.test;

import com.linkedlist.DoublyLinkedList;

public class TestDoublyLinkedList {
	public static void main(String[] args) {
		DoublyLinkedList dlist=new DoublyLinkedList();
		dlist.addNode(12);
		dlist.displayData();
		dlist.addNode(15);
		dlist.displayData();
		dlist.addNode(13);
		dlist.addNode(10000);
		dlist.displayData();
	}
	
}
