package com.ArraysQuestions;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

// array=[-6,1,2,4,5,7]
//square=[36,1,4,16,25,49]
//square sorted=[1,4,16,25,36,49]
//output=[1,2,4,5,-6,7]

public class JavaProgramToSquareSortedArrayOfPositiveAndNegativeNumbers {
//Map<key,Value>  sort karaycha aasal jar keys varti tar Map<Integer,Integer> map=new TreeMap<>();
//Map<key,Value>  sort karaycha aasal jar values varti tar Map<Integer,Integer> map=new HashMap<>();
	public static void main(String[] args) {
		int i;
		int input[]= {-6,1,2,4,5,7};
		
		//Displaying array in [, , ,] format **********************************************
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		for ( i = 0; i < input.length; i++) {
		    sb.append(input[i]);
		    if (i < input.length - 1) {
		      sb.append(", ");
		    }
		}
		sb.append("]");
		 System.out.println("Before="+sb);
		//**********************************************************************************
		
		
		// Creating a new array squareInput and adding the squares of the input array ******
		Integer[] squareInput=new Integer[input.length];
		for(i=0;i<input.length;i++) 
		{
			squareInput[i]=input[i]*input[i];
		}
		//***********************************************************************************
		
		
		//creating a hashmap and storing the key = squares and values = given numbers *******
		HashMap<Integer,Integer > map=new HashMap<>();
		for(i=0;i<input.length;i++) 
		{
		map.put(squareInput[i],input[i]);
		}
		//************************************************************************************
		
		
		//as we want to sort the hashmap based on key so we used TreeMap  ********************
		Map<Integer,Integer> map1=new TreeMap<Integer,Integer>(map);
		//System.out.println(map1);
		//System.out.println(map1.keySet());
		//************************************************************************************
		
		System.out.println("After="+map1.values());
		
	
//		making a list and adding the all elements of array into the list by using collections
//		List<Integer> list=new ArrayList<>();
//		Collections.addAll(list, squareInput);
//		Collections.sort(list);
//		System.out.println(list);
		
	}

}
