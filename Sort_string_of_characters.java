package com.ArraysQuestions.stringQuestions;

import java.util.Arrays;

public class Sort_string_of_characters {

	public static void main(String[] args) {
		String s1="bbccdefbbaa";
		// output "aabbbbccdef";
		
		
		//1 character array mai convert kiya
		char st[]=s1.toCharArray();
		
		//2 fir Arrays ka sort function use kiya
		Arrays.sort(st);
		
		//3 vo array ko string mai print kiya
		System.out.println(String.valueOf(st));
		
	}

}
