package com.linkedlistdemo;

public class DoublyCircularLinkedList {
	Node head;
	class Node{
		int data;
		Node next;
		Node prev;
		
		public Node(int data) {
			this.data=data;
			this.next=this.prev=null;
		}
	}
	public DoublyCircularLinkedList() {
		head=null;
	}
	public void addNode(int val) {
		Node newNode = new Node(val);
		if(head ==null) {
			head = newNode;
			head.next=head;
			head.prev=head;
		}else {
			Node tail = head.prev;
			tail.next=newNode;
			newNode.prev=tail;
			head.prev=newNode;
			newNode.next=head;
			
		}
	}
	
	public void addByPosition(int pos,int val) {
		Node newNode=new Node(val);
		if(head==null && pos ==1) {
			addNode(val);
		}else if(pos ==1) {
			 Node tail = head.prev;
	            newNode.next = head;
	            newNode.prev = tail;
	            head.prev = newNode;
	            tail.next = newNode;
	            head = newNode;
		}else {
            Node temp = head;
            int i = 1;
            while (i < pos - 1 && temp.next != head) {
                temp = temp.next;
                i++;
           
				
			}
            if(i ==pos -1) {
            	 newNode.next = temp.next;
                 newNode.prev = temp;
                 temp.next.prev = newNode;
                 temp.next = newNode;
            }else {
            	System.out.println("Position"+ pos+"is beyound the list length.");
            }
		}
	}
	
	public void deleteByPosition(int pos) {
		if (head ==null) {
			System.out.println("list is empty");
		}else if(pos ==1) {
			if(head.next ==head) {
				head=null;
			}else {
				Node tail =head.prev;
				head=head.next;
				head.prev=tail;
			}
		}else {
			Node temp=head;
			int i=1;
			while(i<pos && temp.next!= head) {
				temp=temp.next;
				i++;
			}
			if(i ==pos) {
				temp.prev.next=temp.next;
				temp.next.prev=temp.prev;
			}else {
				System.out.println("pos not found");
			}
		}
	}
	
	public void deleteByValue(int val) {
		if(head ==null) {
			System.out.println("list is empty");
		}else {
			Node temp=head;
			do {
				if(temp.data ==val) {
					if(temp==head) {
						deleteByPosition(1);
					}else {
						temp.prev.next=temp.next;
						temp.next.prev=temp.prev;
					}
					return;
				}
				temp=temp.next;
			
			}while(temp!=head);
			System.out.println(val+"not found");
		}
	}
	
	 public void displayData() {
	        if (head == null) {
	            System.out.println("List is empty");
	        } else {
	            Node temp = head;
	            do {
	                System.out.print(temp.data + " <-> ");
	                temp = temp.next;
	            } while (temp != head);
	            System.out.println("head");
	}
	 }
}




















