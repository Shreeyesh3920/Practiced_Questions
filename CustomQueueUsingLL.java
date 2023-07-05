package com.Queue;

public class CustomQueueUsingLL {

	class Node
	{
		int data;
		Node next=null;
		Node(int data)
		{
			this.data=data;
		}
	}
	Node front=null;
	Node rear=null;
	public void enqueue(int data) 
	{
		Node newnode=new Node(data);
		if(front==null&rear==null) 
		{
			front=newnode;
			rear=newnode;
		}
		else 
		{
			rear.next=newnode;
			rear=rear.next;
		}
	}
	public void dequeue() 
	{
		if(front==null&&rear==null) 
		{
			System.out.println("underflow");
		}
		else 
		{
			front=front.next;
		}
	}
	public void displayQueue() 
	{
		Node temp=front;
		while(temp!=null) 
		{
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		System.out.println();
		
	}
	public static void main(String[] args) {
		CustomQueueUsingLL queue=new CustomQueueUsingLL();
		queue.enqueue(100);
		queue.enqueue(200);
		queue.enqueue(300);
		queue.displayQueue();
		
		queue.dequeue();
		queue.displayQueue();
	}

}
