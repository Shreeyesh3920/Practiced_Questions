package com.questions;
/*A stair case is there which contains N steps. A man is standing in
front of stare case and he wants to reach at top of stair case of N
steps.
The man can only climb stairs in power of 2.
For ex. At once he can either take 1, 2, 4, 8 , 16 .
Steps.
Find the minimum number of steps man require to reach at top.

*
*
Input 1 :
3
Output 1:
2 (1+2)*/
public class StairProblem {

	public static void main(String[] args) {
		int n=1;
		int steps=0;
		if(n==1) 
		{
			steps=1;
			System.out.println(steps);
		}
		else if(n==0) 
		{
			steps=0;
			System.out.println(steps);
		}

	}

}
