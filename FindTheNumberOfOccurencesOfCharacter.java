package com.StringQuestions;

import java.util.HashMap;
import java.util.Scanner;


public class FindTheNumberOfOccurencesOfCharacter {

	public static void main(String[] args) {
		String input="hello world";
		int inputcount=input.length();
		char in;
		

		 HashMap<Character,Integer> map=new HashMap<>();
		
		 for(int i=0;i<inputcount;i++)
		 {
			 char ch=input.charAt(i);
			 if(!map.containsKey(ch)) 
			 {
				 map.put(ch,1);
			 }
			 else 
			 {
				 map.put(ch,map.get(ch)+1);
			 }
		 }
			System.out.println("enter the character:");
			Scanner sc=new Scanner(System.in);
			in=sc.next().charAt(0);
			System.out.println("NumberOfOccurences="+map.get(in));
			System.out.println(map);
	}

}
