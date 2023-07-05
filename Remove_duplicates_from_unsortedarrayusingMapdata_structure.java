package com.ArraysQuestions.arrayQuestionAnswers;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Remove_duplicates_from_unsortedarrayusingMapdata_structure {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 5, 1, 7, 2, 4, 2};
		Map<Integer,Integer> map=new HashMap<>();
		
		for(int i=0;i<arr.length;i++) 
		{
			if(!map.containsKey(arr[i])) 
			{
				map.put(arr[i], 1);
			}
		}
	
		for(Entry<Integer,Integer>entry:map.entrySet()) 
		{
			System.out.print(entry.getKey()+" ");
		}
	}

}
