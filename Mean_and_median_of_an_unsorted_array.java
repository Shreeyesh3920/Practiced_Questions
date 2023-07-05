package com.ArraysQuestions.arrayQuestionAnswers;

import java.util.Arrays;

public class Mean_and_median_of_an_unsorted_array {

	
	
	public static void main(String[] args) {
		
		int arr[]= {1,2,3,4,5,6,7,8,9,10,11};
		double mean=0,sum=0;
		int n=arr.length;
		
		for(int i=0;i<n;i++) 
		{
			sum=sum+arr[i];
		}
		mean=sum/n;
		System.out.println(mean);
	
		
		//median
		Arrays.sort(arr);
		if(n%2!=0)
		{
			System.out.println((double)arr[n/2]);
		}
		else
		{
			System.out.println((double)(arr[(n - 1) / 2] + arr[n / 2]) / 2);
		}
		
		
		
	}

}
