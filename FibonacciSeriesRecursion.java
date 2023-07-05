package com.DynamicP;

public class FibonacciSeriesRecursion {

	public static void main(String[] args)throws Exception {
		int n=10;
		
		int fib= Fib(n);
		System.out.println(fib);
	}

	public static int Fib(int n) 
	{
		if(n==0||n==1) 
		{
			return n;
		}
		
		System.out.println(n);
		int fibn=Fib(n-1)+Fib(n-2);
		return fibn;
		
	}
}
