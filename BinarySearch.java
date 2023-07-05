package com.ArraysQuestions.searchingAndSorting;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7,8,9};
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter no to be searched");
		int search=scan.nextInt();
		
		int res=binarySearch(search,arr);
		
		if(res!=-1)
		System.out.println("Found element "+search);
		else
		System.out.println("Element Not Found");	
		
		
		
	}

	private static int binarySearch(int search, int[] arr) {
		int n=arr.length;
		
		int high=n-1;
		int low=0;
		int mid=(high+low)/2;
		while(low<=high) 
		{
			if(search==arr[mid]) 
			{
				return 1;
			}
			else if(search<arr[mid])
			{
				high=mid--;
			}
			else  
			{
				low=mid++;
			}
		}
		
		
		return -1;
	}

}
