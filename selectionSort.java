package com.ArraysQuestions.searchingAndSorting;

public class selectionSort {

	public static void main(String[] args) {
		int arr[]= {9,1,8,2,7,3,6,4,5};
		int min,temp;
		for(int i=0;i<arr.length;i++)
		{
			min=i;
			for(int j=i+1;j<arr.length;j++) 
			{
				if(arr[j]<arr[min]) 
				{
					min=j;
				}
				
			}
			temp=arr[i];
			arr[i]=arr[min];
			arr[min]=temp;
		}
		for(int ele:arr)
			System.out.print(ele+" ");
	}

}
