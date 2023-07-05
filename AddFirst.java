package com.LinkedList;

public class AddFirst {

	
	class Node
	{
		int data;
		Node next;
		
		Node(int data)
		{
			this.data=data;
		}
	}
	Node head=null;
	Node tail=null;
	int count;
	
	public void addLast(int data) 
	{
		Node newNode=new Node(data);
		count++;
		if(head==null) 
		{
			head=newNode;
			tail=newNode;
			
		}
		else 
		{
			tail.next=newNode;
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
		System.out.println("NULL");
	}
	
	//ADD FIRST
	public void addFirst(int data) 
	{
		Node newNode=new Node(data);
		count++;
		if(head==null) 
		{
			head=newNode;
			tail=newNode;
		}
		else 
		{
			Node temp2;
			temp2=head;
			newNode.next=temp2;
			head=newNode;
			
		}
	}
	
	public static void main(String[] args) {
		
		AddFirst ll=new AddFirst();
		ll.addLast(0);
		ll.addLast(1);
		ll.addLast(2);
		ll.addLast(3);
		
		ll.printList();
		System.out.println(ll.count);
		
		ll.addFirst(100);
		ll.printList();
		System.out.println(ll.count);
	}

}
