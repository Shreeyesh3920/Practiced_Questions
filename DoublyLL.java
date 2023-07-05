package com.LinkedList;

public class DoublyLL {

	class Node
	{
		Node next;
		int data;
		Node previous;
		
		Node(int data)
		{
			this.data=data;
		}
	}
	
	Node head=null;
	Node tail=null;
	int count=0;
	
	public void addNode(int data) 
	{
		Node newnode=new Node(data);
		count++;
		if(head==null) 
		{
			head=newnode;
			tail=newnode;
			head.previous=null;
		}
		else 
		{
			tail.next=newnode;
			tail.previous=tail;
			tail=tail.next;
			
		}
	}
	public void printList() 
	{
		Node temp=head;
		while(temp!=null) 
		{
			System.out.print(temp.data+"->");
			temp=temp.next;
		}
	}
	public static void main(String[] args) {
		
		DoublyLL dll=new DoublyLL();
		dll.addNode(0);
		dll.addNode(1);
		dll.addNode(2);
		dll.addNode(3);
		
		dll.printList();
		System.out.println("\n");
		System.out.println(dll.count);
	}

}
