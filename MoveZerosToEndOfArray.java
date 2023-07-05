package com.ArraysQuestions;

public class MoveZerosToEndOfArray {

	public static void main(String[] args) {
		
	int input[]= {10,0,0,20,0,30,40};
	int n=input.length;
	int count=0;
	int output[]=new int[n];
	for(int i=0;i<n;i++) 
	{
	System.out.print(input[i]+" ");
	}
	System.out.printf("\n");
	///////////////////////////////////////////////////////
	int j=0;
	for(int i=0;i<n;i++) 
	{
	 if(input[i]==0)
	 {
	 count++;	 
	 }
	 else 
	 {
		 output[j]=input[i];
		 j++;  // ---------------------------------->imp
	 }

	}
	int n1=output.length;
	for(j=n1-1;j<count;j++)
	{
		output[j]=0;
	}
	///////////////////////////////////////////////////////
	for(int i=0;i<n;i++) 
	{
	System.out.print(output[i]+" ");
	}
	
	}

}
