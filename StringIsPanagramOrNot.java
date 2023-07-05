package com.questions;
//Panagram means string contains all the alphabetical characters;
public class StringIsPanagramOrNot {

	public static void main(String[] args) {

		String s="the quick brown fox jumps over jumps over the lazy dog";
		isPanagram(s.toLowerCase());
	}

	private static boolean isPanagram(String s) {

		if(s.length()<26)
		{
			return false;
		}
		for(char ch='a';ch<='z';ch++) 
		{
			if(s.indexOf(ch)<0) 
			{
				return false;
			}
		}
			
		return true;
		
		
	}

}
