package com.LinkedList;

public class practice {

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
	
	public void addNode(int new_data) 
	{
		Node new_node=new Node(new_data);
		if(head==null) 
		{
			head=new_node;
			tail=new_node;
		}
		else 
		{
			tail.next=new_node;
			tail=tail.next;
		}
		
	}
	
	public void print() 
	{
		Node temp=head;
		while(head!=null) 
		{
			System.out.print(temp.data+"->");
			temp=temp.next;
		}
		System.out.println("NULL");
	}
	
	
	public void main(String args[]) 
	{
		practice p=new practice();
		p.addNode(0);
		p.addNode(1);
		p.addNode(2);
		
		p.print();
	}
}
