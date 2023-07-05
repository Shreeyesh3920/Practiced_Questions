package com.LinkedList;
public class pracSLL {
	class Node
	{
		int data;
		Node next=null;
		Node(int data)
		{
			this.data=data;
		}
	}
	
	Node head=null;
	Node tail=null;
	
	public void addNode(int data) 
	{
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
	
	public void print() 
	{
		Node temp=head;
		while(temp!=null) 
		{
			System.out.print(temp.data+"->");
			temp=temp.next;
		}
		
	}
	public static void main(String[] args)
	{
		
		pracSLL l=new pracSLL();
		l.addNode(0);
		l.addNode(1);
		l.addNode(2);
		l.addNode(3);
		l.print();
		

	}

}
