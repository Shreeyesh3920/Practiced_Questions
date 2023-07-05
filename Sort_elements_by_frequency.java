package com.ArraysQuestions.arrayQuestionAnswers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Comparator;
public class Sort_elements_by_frequency {

	public static void main(String[] args) {
		int arr[] = {2, 5, 2, 8, 5, 6, 8, 8};
		
		
		//1 hash map banaya fir ussmai counted values daale
		HashMap <Integer,Integer> map=new HashMap<>();
		for(int i=0;i<arr.length;i++) 
		{
			if(!map.containsKey(arr[i])) 
			{
				map.put(arr[i],1);
			}
			else 
			{
				map.put(arr[i], map.get(arr[i])+1);
			}
		}
		System.out.println(map);
		
		//2 list banaya ussmai hashmap mai vo values the vo daale list mai
		List<Integer> arrlist=new ArrayList<>();
		for(Entry<Integer, Integer> entry:map.entrySet()) 
		{
			arrlist.add(entry.getValue());
		}
		for(int ele:arrlist) 
		{
			System.out.print(ele+" ");
		}
		
		 LinkedHashMap<String, String> sortedMap = new LinkedHashMap<>();
//		 Collections.sort(arrlist, new Comparator<String>() {
//	            public int compare(String str, String str1) {
//	                return (str).compareTo(str1);
//	            }
//	        });
//	        for (Integer str : arrlist) {
//	            for (Entry<Integer, Integer> entry : map.entrySet()) {
//	                if (entry.getValue().equals(str)) {
//	                    sortedMap.put(entry.getKey(), str);
//	                }
//	            }
//	        }
//	        System.out.println(sortedMap);
	
	}

}
