package com.ArraysQuestions.arrayQuestionAnswers;

public class Second_largest_element_in_an_array {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7,8,1};
		int largest,seclargest=0;
		largest=arr[0];
		for(int i=1;i<arr.length;i++) 
		{
			if(largest<arr[i]) 
			{
				seclargest=largest;
				largest=arr[i];
			}
			else if(arr[i]<largest&&arr[i]>seclargest)
			{
				seclargest=arr[i];
			}
			
		}

		System.out.println(seclargest);
	}

}
