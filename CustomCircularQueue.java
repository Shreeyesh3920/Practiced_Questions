package com.Queue;

public class CustomCircularQueue {
	int n=8;
	int arr[]=new int[n];
	
	int front =-1;
	int rear =-1;
	
	public void enqueue(int data) 
	{
		if( front== rear + 1 % n) 
		{
			System.out.println("overflow");
		}
		else if(front==-1&& rear==-1) 
		{
			front=0;
			rear=0;
			arr[rear]=data;
		}
		else 
		{
			rear=(rear+1)%n;
			arr[rear]=data;
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
			front=(front+1)%n;
		}
	}
	
	public void displayQueue() 
	{
		for(int i=front;i<=n-1;i++) 
		{
			System.out.print(arr[i]+" ");
		}
		for(int j=0;j<=rear;j++) 
		{
			System.out.print(arr[j]+" ");
		}
		System.out.println("\n");
	}
	public static void main(String[] args)
	{
		CustomCircularQueue queue=new CustomCircularQueue();
		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);
		queue.enqueue(40);
		queue.enqueue(50);
		queue.enqueue(60);
		queue.enqueue(70);
		queue.enqueue(80);
		queue.displayQueue();
		
		queue.dequeue();
		queue.dequeue();
		queue.displayQueue();
		
		queue.enqueue(1000);
		queue.displayQueue();
		
		queue.enqueue(2000);
		queue.displayQueue();
	}

}
