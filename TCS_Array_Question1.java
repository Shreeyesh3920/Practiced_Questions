package com.ArraysQuestions;
/*Given an integer array Arr of size N the task is to find the count of elements whose value is greater than all of its prior elements.

Note : 1st element of the array should be considered in the count of the result.

For example,
Arr[]={7,4,8,2,9}
As 7 is the first element, it will consider in the result.
8 and 9 are also the elements that are greater than all of its previous elements.
Since total of  3 elements is present in the array that meets the condition.
Hence the output = 3.*/
public class TCS_Array_Question1 {
	public static void main(String[] args) {

		int input[]= {7,4,8,2,9};
		//int input[]= {3,3,3,3,3};
		//int input[]= {7,4,8,2,9,7,7};
     		
		int max,count=1;
		
		for(int i=1;i<input.length;i++)
		{
			max=input[0];
			if(input[i]>max) 
			{
				count+=1;
			}
			max=input[i];
		}
		System.out.println(count);
	}

}
