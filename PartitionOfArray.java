package com.ArraysQuestions;
/*For example, let's take this array [37,36,27,11,15,12,34,29,4,10]
 and partition value is 17.

So the array after partition should be [10,4,12,11,15,27,34,29,36,37]
Comparing these two data sets we can see that elements from left side 
greater than 17 must be moved to right side and at the right side elements less than 17 to left side.*/
public class PartitionOfArray {

	public static void main(String[] args) {
		
		int input[]= {37,36,27,11,15,12,34,29,4,10};
		int pivot=17;
		partition(input,pivot);
		
		//output
		System.out.print("[");
		for(int i=0;i<input.length;i++) {
		System.out.print(input[i]+" ");
		}
		System.out.print("]");
	}

	
	public static void partition(int input[],int pivot) 
	{
		for(int i=0;i<input.length;i++) 
		{
			
		}
	}
}
