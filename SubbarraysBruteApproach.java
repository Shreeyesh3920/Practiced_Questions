package com.ArraysQuestions;
public class SubbarraysBruteApproach {

	public static void main(String[] args) {
		
	int input[]= {1,2,3,4,5};
	
	for(int i=0;i<input.length;i++) 
	{
		//System.out.println(input[i]);
		for(int j=0;j<input.length;j++) 
		{
			for(int k=i;k<j;k++) 
			{
				System.out.print(input[k]);
				System.out.println("");
				
			}
		}
	}
	
	}
}
