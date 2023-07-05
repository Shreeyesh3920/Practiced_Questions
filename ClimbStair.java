package com.DynamicP;

public class ClimbStair {
	//5   steps can be used 1 or 2     
	public static void main(String[] args) {
		int input=5;
		
		int countSteps=climbStair(input);
		System.out.println(countSteps);
	}

	private static int climbStair(int n) {
		if(n<=1) 
		{
			return 1;
		}
		int op1=climbStair(n-1);
		int op2=climbStair(n-2);
		return op1+op2;
	}

}
