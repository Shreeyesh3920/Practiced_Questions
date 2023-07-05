package com.LinkedList;
import java.util.LinkedList;

public class CustomLinkedList {
	
	//NODE CLASS
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
	
	//ADDING NODES
	public void addNode(int new_data) 
	{
		Node new_node=new Node(new_data);
		count++;
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
	
//	public void addFirst(int new_data) 
//	{
//		Node new_node=new Node(new_data);
//		if(head==null) 
//		{
//			head=new_node;
//			tail=new_node;
//		}
//		else 
//		{
//			
//		}
//		
//	}
//	
	
	public void removeFirst() 
	{
		if(count==0) 
		{
			System.out.println("List is empty");
		}
		else if(count==1) 
		{
			head=null;
			tail=null;
			count--;
		}
		else 
		{
			head=head.next;
			count--;
		}
	}
	
	
	//printing LINKED LIST
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
	
	
	//MAIN METHOD
	public static void main(String[] args) {
		
		
		CustomLinkedList ll=new CustomLinkedList();
		ll.addNode(1);
		ll.addNode(2);
		ll.addNode(3);
		ll.addNode(4);
		
		ll.print();
		System.out.println(ll.count);
		 
		ll.removeFirst();
		ll.print();
		System.out.println(ll.count);
		
	}

}
