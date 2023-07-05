package com.Queue;

public class CustomQueue {
	int n=8;
	int queueArr[]=new int[n];
	
	int front=-1;
	int rear=-1;
	
	public void enqueue(int data) 
	{
		if(rear==n-1) 
		{
			System.out.println("overflow");
		}
		else 
		{
			if(front==-1&&rear==-1) 
			{
				front++;
				rear++;
				queueArr[rear]=data;
			}
			else 
			{
				rear++;
				queueArr[rear]=data;
			}
		}
	}
	public void dequeue() 
	{
		if(front==-1&&rear==-1) 
		{
			System.out.println("underflow");
		}
		else 
		{
			front++;
		}
	}
	public void displayQueue() 
	{
		for(int i=front;i<=rear;i++) 
		{
			System.out.print(queueArr[i]+" ");
		}
		System.out.println("\n");
	}
	
	public static void main(String[] args) {
		
		CustomQueue queue=new CustomQueue();
		
		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);
		queue.enqueue(40);
		queue.enqueue(50);
		queue.displayQueue();
		System.out.println(queue.front);
		queue.dequeue();
		queue.displayQueue();
		
		System.out.println(queue.front);

	}

}
