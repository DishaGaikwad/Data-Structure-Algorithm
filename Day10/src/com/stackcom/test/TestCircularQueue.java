package com.stackcom.test;

import com.stack.CircularQueue;

public class TestCircularQueue {
	public static void main(String[] args) {
				CircularQueue cqueue=new CircularQueue();
				cqueue.enQueue(4);
				cqueue.enQueue(12);
				cqueue.enQueue(92);
				cqueue.enQueue(34);
				cqueue.enQueue(44);
				cqueue.enQueue(4); //queue is full
				System.out.println(cqueue.deQueue());
				System.out.println(cqueue.deQueue());
				cqueue.enQueue(421);
				cqueue.enQueue(431);
				cqueue.enQueue(422); //queue is full
				System.out.println(cqueue.deQueue());
				System.out.println(cqueue.deQueue());
				System.out.println(cqueue.deQueue());
				System.out.println(cqueue.deQueue());
				System.out.println(cqueue.deQueue());
				System.out.println(cqueue.deQueue());//queue is empty

	}

}
