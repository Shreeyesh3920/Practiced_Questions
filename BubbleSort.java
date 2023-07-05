package com.ArraysQuestions.searchingAndSorting;

public class BubbleSort {

	public static void main(String[] args) {
		
		int input[]= {50,20,10,40,30};
		int temp;
		for(int i=0;i<input.length;i++) 
		{
			for(int j=i+1;j<input.length;j++) 
			{
				if(input[i]>input[j])
				{
				temp=input[i];
				input[i]=input[j];
				input[j]=temp;
				}
			}
		}
		
		for(int i=0;i<input.length;i++)
		System.out.print(input[i]+" ");
	}

}
