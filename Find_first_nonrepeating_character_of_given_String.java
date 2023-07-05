package com.ArraysQuestions.stringQuestions;

import java.util.HashMap;

public class Find_first_nonrepeating_character_of_given_String {

	public static void main(String[] args) {
		String str="geeksforgeeks";
		//Output: f
		
		HashMap<Character,Integer>map=new HashMap<>();
		
		for(int i=0;i<str.length();i++) 
		{
			char ch=str.charAt(i);
			if(!map.containsKey(ch)) 
			{
				map.put(ch, 1);
			}
			else 
			{
				map.put(ch, map.get(ch)+1);
			}
		}
		
		for(int j=0;j<str.length();j++) 
		{
			char cht=str.charAt(j);
			if(map.get(cht)==1) 
			{
				System.out.println(cht);
				break;
			}
		}

	}

}
