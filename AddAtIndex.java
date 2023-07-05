package com.LinkedList;

public class AddAtIndex {

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
	
	//AddAtIndex
	public void addAtIndex(int data,int index) 
	{
		Node newnode=new Node(data);
		count++;
		Node temp=head;
		//for loop will get us the node that we want i.e 100->200->300->400  we want to add node with data 500 at 2nd index
		//												 0    1    2    3    like 100->200->500->300->400
		// so we will run a for loop at index-1 so that we will get 1 index i.e 200 
		for(int i=0;i<index-1;i++) 
		{
			temp=temp.next;
		}
		
		Node tempnext;      // here our temp is 200
		tempnext=temp.next; //tempnext will store the next of 200 which is 300 in this case;
		temp.next=newnode;
		newnode.next=tempnext;
	}	
	
	public void addAtLast(int data) 
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
	
	public void print() 
	{
		Node temp=head;
		while(temp!=null) 
		{
			System.out.print(temp.data+"->");
			temp=temp.next;
		}
		System.out.println("NULL");
	}

	public static void main(String[] args) {
		AddAtIndex ll=new AddAtIndex ();
		ll.addAtLast(100);
		ll.addAtLast(200);
		ll.addAtLast(300);
		ll.addAtLast(400);
		
		ll.print();
		System.out.println(ll.count);
		
		ll.addAtIndex(500, 2);
		ll.print();
		System.out.println(ll.count);
		
		

	}

}
