package com.Stack;

public class CustomStack {
	int n=8;
	int stackarr[]=new int[n];
	int top=-1;
	
	public void push(int data) 
	{
		if(top==n-1) 
		{
			System.out.println("overflow");
		}
		else 
		{
			
			top++;
			stackarr[top]=data;
		}
	}
	
	public void pop() 
	{
		if(top==-1) 
		{
			System.out.println("underflow");
		}
		else 
		{
			top--;
		}
	}
	public void displayStack() 
	{
		for(int i=top;i>=0;i--) 
		{
			System.out.print(stackarr[i]+" ");
		}
		System.out.println("\n");
	}
	public static void main(String[] args) {
		
		CustomStack stack=new CustomStack();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.displayStack();
		
		stack.pop();
		stack.displayStack();
		
		stack.push(100);
		stack.displayStack();
	}
	
	

}
