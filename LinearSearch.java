package com.ArraysQuestions.searchingAndSorting;
import java.util.Scanner;
public class LinearSearch {

	public static void main(String[] args) {
		
		int arr[]= {9,1,8,2,7,3,6,4,5};
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter no to be searched");
		int search=scan.nextInt();
		
		
		int res=linearSearch(search,arr);
		
		if(res!=-1)
		System.out.println("Found element "+search+" at index "+res);
		else
		System.out.println("Element Not Found");	
	}

	private static int linearSearch(int search, int[] arr) {
		for(int i=0;i<arr.length;i++) 
		{
			if(arr[i]==search) 
			{
				return i;
			}
		}
		return -1;
		
	}

}
