package com.ArraysQuestions;

public class NegativeValuesToFront {

	public static void main(String[] args) {
		int input[]= {10,-20,50,-30,60,-40};
		int n=input.length;
		
		int output[]=new int[n];
		for(int i=0;i<n;i++) 
		{
		System.out.print(input[i]+" ");
		}
		System.out.printf("\n");

		
		
		int j=0;
		for(int i=0;i<n;i++) 
		{
		 if(input[i]<0)
		 {
			 output[j]=input[i];
			 j++;   
		 }
		
		}
		
		// as j value==3 so as the length of array is also becomes 3;
		
		for(int i=0;i<n;i++) 
		{
		 if(input[i]>0)
		 {
			 output[j]=input[i];
			 j++;   
		 }
		
		}
		
		
		
		for(int i=0;i<n;i++) 
		{
		System.out.print(output[i]+" ");
		}
		
	}

}
