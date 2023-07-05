package com.Exps;

import java.util.HashMap;

public class Wordcount {

	public static void main(String[] args) {
		String input="History is present in many History Books and Books are relevant source of information";
		String inputarr[]=input.split(" ");
		HashMap<String,Integer> map=new HashMap<>();
		map(inputarr,map);
		reduce(map);
	}

	
		//map
	private static void map(String[] inputarr, HashMap<String, Integer> map) {
		
		for(int i=0;i<inputarr.length;i++) 
		{
			String ch=inputarr[i];
			if(!map.containsValue(ch))
			{
				map.put(ch, 1);
			}
			else 
			{
				map.put(ch, map.get(ch)+1);
			}
		}
		
		
	}
	//reduce
	private static void reduce(HashMap<String, Integer> map) {
		System.out.println(map);
		
	}

}
