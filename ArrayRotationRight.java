package com.ArraysQuestions;

public class ArrayRotationRight {

	public static void main(String[] args) {
		int input[]= {10,20,30,40,50};
		int n=1;
		
		int i=0,last,len=input.length;
		
		//displaying original array
		for(i=0;i<len;i++) 
		{
			System.out.print(input[i]+" ");
		}
		System.out.printf("\n");
		
		
		for(i=0;i<n;i++) 
		{
			last=input[len-1];   
			for(int j=len-1;j>0;j--) 
			{
				input[j]=input[j-1];
			}
			input[0]=last;
		}
		
		
		
		
		

		//displaying array
		for(i=0;i<len;i++) 
		{
			System.out.print(input[i]+" ");
		}
	}

}
