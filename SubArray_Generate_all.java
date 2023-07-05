package com.ArraysQuestions.arrayQuestionAnswers;
import java.util.*;
public class SubArray_Generate_all {

	public static void main(String[] args) {
	int arr[]= {1,2,3,4};// {{1},{1,2},{1,2,3},{1,2,3,4},{2},{2,3},...} i.e List of List
	List<List<Integer>> subArrays=findAllSubArrays(arr);
	System.out.println(subArrays);
	//subarrays.subList() function
	
	}

	
	public static List<List<Integer>> findAllSubArrays(int arr[])
	{
		List<List<Integer>> subarrays=new LinkedList<>();
		for(int i=0;i<arr.length;i++) 
		{
			for(int j=i;j<arr.length;j++) 
			{
				List<Integer> subarray=new LinkedList<>();
				for(int k=i;k<=j;k++) 
				{
					subarray.add(arr[k]);
				}
				subarrays.add(subarray);
			}
		}
		return subarrays;
		
	}
}
