package com.ArraysQuestions;
/*A parking lot in a mall has RxC number of parking spaces. Each parking space will either be  empty(0) or full(1). The status (0/1) of a parking space is represented as the element of the matrix. The task is to find index of the prpeinzta row(R) in the parking lot that has the most of the parking spaces full(1).

Note :
RxC- Size of the matrix
Elements of the matrix M should be only 0 or 1.

Example 1:
Input :
3   -> Value of R(row)
3    -> value of C(column)
[0 1 0 1 1 0 1 1 1] -> Elements of the array M[R][C] where each element is separated by new line.
Output :
3  -> Row 3 has maximum number of 1’s*/

import java.util.Scanner;

public class TCS_Array_Question2 {

	public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	int r,c;
	System.out.println("enter no. of rows");
	r=sc.nextInt();
	System.out.println("enter no. of columns");
	c=sc.nextInt();
	int	input[][]=new int[r][c];
	System.out.println("enter array elements");
	for(int i=0;i<r;i++) 
	{
		for(int j=0;j<c;j++) 
		{
			input[i][j]=sc.nextInt();
		}
	}
	
		int res=findRow(input,r,c);
		System.out.println(res);
		
	}

	private static int findRow(int[][] input, int r, int c) {

		int count,max=0,index=0;
		
		for(int i=0;i<r;i++)    									// r1 0 1 0 =1
		{															// r2 1 1 0 =2
			count=0;												// r3 1 1 1 =3
			for(int j=0;j<c;j++) 
			{
				if(input[i][j]==1)
				{
					count=count+1;
				}
			}
			if(count>max) 
			{
				max=count;
				index=i+1;
			}
			
		}
			return index;
	}

}
