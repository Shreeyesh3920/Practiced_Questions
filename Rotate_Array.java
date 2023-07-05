package com.ArraysQuestions.arrayQuestionAnswers;

public class Rotate_Array {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
		int d=2;
		int first;
		
		for(int i=0;i<d;i++) 
		{
		 first=arr[0];
		 for(int j=0;j<arr.length-1;j++) 
		 {
			 arr[j]=arr[j+1];
		 }
		 arr[arr.length-1]=first;
		}
		
		for(int g=0;g<arr.length;g++) 
		{
			System.out.print(arr[g]+" ");
		}
	
	}

}
