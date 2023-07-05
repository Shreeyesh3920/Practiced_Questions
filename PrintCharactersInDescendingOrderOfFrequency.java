package com.StringQuestions;
//input "banana";
//output b=1 a=3 n=2;
import java.util.HashMap;

public class PrintCharactersInDescendingOrderOfFrequency {

	public static void main(String[] args) {
  
		String input="banana";
		HashMap<Character,Integer> hash=new HashMap<Character,Integer>();
	
		char ch;
		for(int i=0;i<input.length();i++) 
		{
			ch=input.charAt(i);
			if(hash.get(ch)!=null) 
			{
				hash.put(ch, hash.get(ch)+1);
			}
			else 
			{
				hash.put(ch,1);
			}
		}
		System.out.println(hash);
	}

}
