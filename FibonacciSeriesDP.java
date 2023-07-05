package com.DynamicP;

public class FibonacciSeriesDP {

	public static void main(String[] args) {
		
		int n=10;
		int qb[]=new int[n+1];
		int fibo= Fib(n,qb);
		System.out.println(fibo+" ");

	}

	public static int Fib(int n,int qb[]) 
	{
		if(n==0||n==1) 
		{
			return n;
		}
		//2.check kar rahe ki question bank mai vo answer hai ki nahi?
		if(qb[n]!=0) //this condition tells that question bank contains answer for n; i.e for n the array is not empty and contains answer.
		{
			return qb[n];
		}
		
		System.out.println(n);
		int fibn=Fib(n-1, qb)+Fib(n-2, qb);
		
		//1.question Bank mai answer daal diya
		qb[n]=fibn;
		return fibn;
	}
}
