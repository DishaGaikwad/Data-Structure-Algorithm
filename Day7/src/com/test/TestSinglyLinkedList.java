package com.test;

import com.linkedlist.SinglyLinkedList;

public class TestSinglyLinkedList {
	public static void main(String[] args) {
		SinglyLinkedList list1=new SinglyLinkedList();
		list1.addNode(12);
		list1.addNode(10);
		list1.addNode(15);
		list1.displayData();
		list1.addByPosition(1,100);
		list1.addByPosition(3,200);
		list1.addByPosition(8,300);
		list1.addByPosition(20,400);
		list1.displayData();
		
		/*//delete in between
		list1.deleteByValue(15);
		//delete from head
		list1.deleteByValue(100);
		//delete from the last
		list1.deleteByValue(300);
		//value not found
		list1.deleteByValue(400);
		list1.displayData();*/
		
		//delete by position
		//list1.deleteByPosition(1);
		//list1.deleteByPosition(4);
		//list1.deleteByPosition(8);
		list1.deleteByPosition(20);
		list1.displayData();
	}

}
