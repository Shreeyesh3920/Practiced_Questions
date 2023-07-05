package com.ArraysQuestions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Sample {

	public static void main(String[] args) {
		
		
		int nums[]= {2,2,3,2};
		HashMap<Integer,Integer> map=new HashMap<>();
	      for(int i=0;i<nums.length;i++)
	      { 
	    	  int num=nums[i];
	       if(map.containsKey(num))
	       {
	    	   Integer count=map.get(num);
	           map.put(count+1,num);
	    	  
	       } 
	       else
	       {
	    	   
	    	   map.putIfAbsent(1,num);
	       }  

	      }
	     int n=2;
	    ArrayList<String>list=new ArrayList<>();
	    list.add(String.valueOf(n));
	    System.out.println(list);


		
	}

}
