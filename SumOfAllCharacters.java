package com.StringQuestions;

import java.util.ArrayList;

/*Write a program to find the sum of all characters and all possible contiguous character
combinations from the given string.
Consider the string Sl="321" .
All characters and combinations Of contiguous characters from the above string are:
3,2,1,32,21,321 . Adding all the numbers (3+2+1+32+21+321), we get 380 as the result.*/
public class SumOfAllCharacters {

	public static void main(String[] args) {
		String input="321";
		ArrayList<String> subString=new ArrayList<String>();
		String sub;
		for(int i=0;i<=input.length();i++) 
		{
			for(int j=i+1;j<=input.length();j++) 
			{
				sub=input.substring(i,j);
				subString.add(sub);
			}
		}
		for(String s:subString) 
		{
			System.out.print(s+" ");
		}
		//converting String of array in to intergers
		ArrayList<Integer> array=new ArrayList<>();
		for(String s:subString) 
		{
			array.add(Integer.parseInt(s));
		}
		
		//counting
		int count=0;
		for(int s:array) 
		{
			count+=s;
		}
		System.out.println("\n");
		System.out.println("Total="+count);
	}

}
