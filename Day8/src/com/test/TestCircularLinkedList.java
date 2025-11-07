package com.test;

import com.linkedlistdemo.CircularLinkedList;

public class TestCircularLinkedList {
	
	public static void main(String[] args) {
		CircularLinkedList clist=new CircularLinkedList();
		clist.addNode(12);
		clist.addNode(13);
		clist.addNode(14);
		clist.addNode(15);
		clist.addNode(16);
		clist.displayData();
		clist.deleteByValue(12);
		clist.deleteByValue(13);
		clist.displayData();
	}

}
