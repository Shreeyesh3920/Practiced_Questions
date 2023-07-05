package com.ArraysQuestions.arrayQuestionAnswers;

import java.util.Arrays;

public class Smallest_and_second_smallest_elements_in_an_array {

	public static void main(String[] args) {
		//int arr[]= {2,1,4,3,5,6}; // 2 3
		int arr[]= {5 ,11 ,1 ,6 ,6 ,8 ,11 ,5 ,12 ,11 ,6 ,1 ,7};  // it gives 1 1 but expected is 1 5 for this below is the solution
		//1
		Arrays.sort(arr);
		System.out.println(arr[0]+" "+arr[1]);
		///////////////////////////////////////////////////////////////////////////////////////////////////////

		//2
		int smallest=Integer.MAX_VALUE;
		int Secondsmallest=Integer.MAX_VALUE;
		
		for(int i=0;i<arr.length;i++) 
		{
			if(arr[i]<smallest) //If the current element a[i] is smaller than smallest, it means we have found a new smallest value. In this case, we update the secondSmallest value to the current smallest value (since it's now the second smallest) and update the smallest value to the current element a[i].
			{	Secondsmallest=smallest;
				smallest=arr[i];
			}
			else if (arr[i] < Secondsmallest && arr[i] != smallest)//If the current element a[i] is not smaller than smallest but is smaller than secondSmallest and different from smallest, it means we have found a new second smallest value. In this case, we update the secondSmallest value to the current element a[i].
			{
                Secondsmallest = arr[i];
			}
		
	}
		System.out.println(smallest+" "+Secondsmallest);
}
}
