package com.ArraysQuestions.stringQuestions;

import java.util.HashMap;

public class ISOMPORPHIC {

	public static void main(String[] args) {
		String s = "foo";
		String t = "bar";
		
		if(s.length()!=t.length())
	        {
			System.out.println("false");
	        }
	        if(s.equals(null) && t.equals(null))
	        {
	        	System.out.println("false");
	        }
	        
	        HashMap<Character,Character> map=new HashMap<>();

	        for(int i=0;i<s.length();i++)
	        {
	            char ch1=s.charAt(i);
	            char ch2=t.charAt(i);
	            if(!map.containsKey(ch1))
	            {
	                map.put(ch1,ch2);
	            }
	            else if(map.containsKey(ch1) && map.get(ch1) != ch2)
	            {
	                System.out.println("false");
	            }
	        }
	}

}
