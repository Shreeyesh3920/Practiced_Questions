package com.ArraysQuestions.arrayQuestionAnswers;


import java.util.*;
import java.util.Map.Entry;

public class Counting_frequencies_of_array_elements {

	public static void main(String[] args) {
	
		//int arr[]= {10,20,20,30,20,40,20};
		int arr[]= {3,3,3,3};
		
		HashMap<Integer,Integer> map=new HashMap<>();
		
		for(int i=0;i<arr.length;i++) 
		{
			if(!map.containsKey(arr[i])) 
			{
				map.put(arr[i],1);
			}
			else 
			{
				map.put(arr[i],map.get(arr[i])+1);
			}
		}
		System.out.println(map);
		///for practice purpose printing the elements
		for(Entry<Integer,Integer>entry:map.entrySet()) 
		{
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		
	}

}
