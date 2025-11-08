package com.demo.test;

import com.demo.stacks.MyQueueList;

public class TestQueueList {
	public static void main(String[] args) {
	
	MyQueueList qlist=new MyQueueList();
	qlist.enQueue(12);
	qlist.enQueue(10);
	qlist.enQueue(15);
	qlist.enQueue(50);
	qlist.enQueue(1000);
	qlist.enQueue(2000);
	qlist.enQueue(20);
	System.out.println(qlist.deQueue());
	System.out.println(qlist.deQueue()); 
	System.out.println(qlist.deQueue());
	System.out.println(qlist.deQueue());
	System.out.println(qlist.deQueue());
	System.out.println(qlist.deQueue());
	}

}
