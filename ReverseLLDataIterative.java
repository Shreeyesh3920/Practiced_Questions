package com.LinkedList;

import com.LinkedList.RemoveLast.Node;

public class ReverseLLDataIterative {
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
	
	//gives node at specific index
	private Node getAtIndex(int index) 
	{
		Node temp=head;
		for(int i=0;i<index-1;i++) 
		{
			temp=temp.next;
		}
		return temp;
	}
	
	public void reverse() 
	{
		int li=0;
		int ri=count-1;
		while(li<ri) 
		{
			Node left=getAtIndex(li);
			Node right=getAtIndex(ri);
			
			int temp=left.data;
			left.data=right.data;
			right.data=temp;
			
			li++;
			ri--;
		}
	}
	public static void main(String[] args) {
		ReverseLLDataIterative ll=new ReverseLLDataIterative();
		ll.addLast(100);
		ll.addLast(200);
		ll.addLast(300);
		ll.addLast(400);

		ll.print();
		System.out.println(ll.count);
		
		ll.reverse();
		ll.print();
	}

}
