package com.day6.test;



import com.day6.linkedlists.SinglyLinkedList;

public class TestSinglyLinkedList {

	public static void main(String[] args) {
		SinglyLinkedList list1=new SinglyLinkedList();
		list1.addNode(12);
		list1.addNode(10);
		list1.addNode(15);
		list1.addNode(7);
		list1.addNode(2);
		list1.displayData();
		list1.addByPosition(1,100);
		list1.addByPosition(3, 200);
		list1.addByPosition(8, 300);
		list1.addByPosition(20, 400);
		list1.displayData();
	}

}
