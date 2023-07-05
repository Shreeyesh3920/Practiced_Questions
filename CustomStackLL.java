package com.Stack;
public class CustomStackLL {

	class Node
	{
		int data;
		Node next=null;
		Node(int data)
		{
			this.data=data;
		}
	}
	Node top=null;
	Node head=null;
	public void push(int data) 
	{
		Node newnode=new Node(data);
		if(top==null) 
		{
			top=newnode;
			head=newnode;
		}
		else 
		{
			top.next=newnode;
			top=top.next;
		}
	}
	public void pop() 
	{
		if(top==null&&head==null) 
		{
			System.out.println("underflow");
		}
		else 
		{
			Node temp=head;
			while(temp.next!=top) 
			{
				temp=temp.next;
			}
			temp.next=null;
			top=temp;
		}
	}
	public void displayStack() 
	{
		Node temp=head;
		while(temp!=null) 
		{
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		System.out.println();
	}
	public static void main(String[] args) {
		
		CustomStackLL stack=new CustomStackLL();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		
		stack.displayStack();
		
		stack.pop();
		stack.displayStack();
	}

}
