package com.ArraysQuestions.stringQuestions;

public class Check_if_a_string_is_substring_of_another {

	public static void main(String[] args) {
		String s1="for";
		String s2="geeksforgeeks"; //output 5 explanation: String “for” is present as a substring of s2.
		int result=0;
		boolean isSubstring=false;
		
		for(int i=0;i<s1.length();i++) 
		{
			char ch=s1.charAt(i);
			if(s2.indexOf(ch)!= -1) 
			{
				isSubstring=true;
			}
		}
		System.out.println(isSubstring);
	}

}
