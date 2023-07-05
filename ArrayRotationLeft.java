package com.ArraysQuestions;

public class ArrayRotationLeft {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input[]= {10,20,30,40,50};
		int n=4;
		
		int i=0,first,len=input.length;
		
		//displaying original array
		for(i=0;i<len;i++) 
		{
			System.out.print(input[i]+" ");
		}
		System.out.printf("\n");
		
						
						for(i=0;i<n;i++)//-----------> this is for how many times that we have to rotate
						{
						first=input[0];
						for(int j=0;j<len-1;j++)//------------> this loop is for shifting elements to left side 
						{	
							input[j]=input[j+1];
						}
						input[len-1]=first;//---------------------> inserting first element to last 
						}
		
		//displaying array
		for(i=0;i<len;i++) 
		{
			System.out.print(input[i]+" ");
		}
	}

}
