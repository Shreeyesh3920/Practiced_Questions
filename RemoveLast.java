package com.LinkedList;

import com.LinkedList.RemoveFirst.Node;

public class RemoveLast {

	class Node
	{
		int data;
		Node next=null;
		
		Node(int data)
		{
			this.data=data;
			this.next=null;
		}
	}
	
	Node head=null;
	Node tail=null;
	int count=0;
	
	public void addLast(int data) 
	{
		Node newnode=new Node(data);
		count++;
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
	
	//RemoveLast
	public void removeLast() 
	{
		Node temp=head;
		for(int i=1;i<count-1;i++) 
		{
			temp=temp.next;//temp will have 2nd last element
		}
		tail=temp;
		temp.next=null;
		count--;
	}
	public void print() 
	{
		Node temp=head;
		while(temp!=null) 
		{
			System.out.print(temp.data+"->");
			temp=temp.next;
		}
		System.out.println("null");
	}
	public static void main(String[] args) {
		
		RemoveLast  ll=new RemoveLast();
		ll.addLast(100);
		ll.addLast(200);
		ll.addLast(300);
		ll.addLast(400);

		ll.print();
		System.out.println(ll.count);
		
		ll.removeLast();
		ll.print();
		System.out.println(ll.count);
		
		System.out.println("New Tail="+ll.tail.data);
		
		
	}

}
