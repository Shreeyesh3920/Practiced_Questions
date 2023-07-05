package com.LinkedList;
//https://www.youtube.com/watch?v=DyP73kuqeTQ
public class RevLL {
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
	int count=0;
	
	public void addNode(int data) 
	{
		count++;
		Node newnode=new Node(data);
		if(head==null) 
		{
			head=newnode;
			tail=newnode;
		}
		else 
		{
			tail.next=newnode;
			tail=tail.next;
		}
	}
	
	public void printLL()
	{
		Node temp=head;
		while(temp!=null) 
		{
			System.out.print(temp.data+"->");
			temp=temp.next;
		}
	System.out.println("null");
	}
	
	public void Reverse() 
	{
		if(head==null) 
		{
			System.out.println("List is empty");
		}
		Node current;
		Node previous;
		Node temp;
		current=head;
		previous=null;
		
		while(current!=null) 
		{
			
			temp=current.next;
			
			current.next=previous;
			previous=current;
			current=temp;
			
		}
		
		
	}
	public static void main(String[] args) {
		RevLL ll=new RevLL();
		ll.addNode(0);
		ll.addNode(1);
		ll.addNode(2);
		ll.addNode(3);
		
		ll.printLL();
		
		ll.Reverse();
		ll.printLL();
		
	}

}
