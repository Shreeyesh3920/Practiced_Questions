package com.ArraysQuestions.stringQuestions;

public class Remove_spaces_from_a_given_string {

	public static void main(String[] args) {
		String str="g  eeks   for ge  eeks  ";
		
		str=str.trim();
		StringBuilder result=new StringBuilder();
		char arr[]=str.toCharArray();
		for(int i=0;i<str.length();i++) 
		{
			
			if(arr[i]!=' ') 
			{
				result.append(arr[i]);
			}
		}
		System.out.println(String.valueOf(result));
	}

}
