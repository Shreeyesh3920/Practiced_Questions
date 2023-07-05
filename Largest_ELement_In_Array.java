package com.ArraysQuestions.arrayQuestionAnswers;

public class Largest_ELement_In_Array {

	public static void main(String[] args) {
	
		
		int arr[]= {10,80,100,500,56,1000,2,8900};
		int largest;
		largest=arr[0];
		for(int i=1;i<arr.length;i++) 
		{
			if(largest<arr[i]) 
			{
				largest=arr[i];
			}
		}
		System.out.println(largest);
	}

}
