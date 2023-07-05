package com.ArraysQuestions.arrayQuestionAnswers;

public class Program_to_check_if_an_array_is_sorted_or_not {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
        //int[] arr = {7, 3, 5, 2, 1};
		int n=arr.length;
		boolean sorted=true;
		
		
			for(int i=0;i<arr.length-1;i++) 
			{
				if(arr[i]>arr[i+1]) 
				{
					sorted=false;
				}
				
			}
	
		System.out.print(sorted);

	}

}
