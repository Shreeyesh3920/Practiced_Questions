package com.StringQuestions;

import java.util.HashSet;

/*You have write a function that accepts, a string which length is “len”, the string has some “#”,
 *  in it you have to move all the hashes to the front of the string and return the whole string back and print it.
 *  Input: Move#Hash#to#Front
	Output:###MoveHashtoFront
 */
public class Capgemini_String_Question1 {

	public static void main(String[] args) {
 
		//String input="Move#Hash#to#Front";
		String input="####Shreeyesh####Mhatre####Rajendra####";
		int count=0;
		String output="";
		
		StringBuilder result=new StringBuilder();
		
		for(int i=0;i<input.length();i++) 
		{
		char ch=input.charAt(i);
		if(ch=='#')
		{
		count=count+1;
		}
		else 
		{
			output=output+ch;
		}
		
		}
			for(int i=0;i<count;i++) 
			{
				result.append('#');
			}
      
			result.append(output);
			System.out.println(result);
	}

}
/*
  OR instead of counting #
  for(int i=0;i<input.length();i++) 
		{
		char ch=input.charAt(i);
		if(ch=='#')
		{
		str1=str1+ch;
		}
		else 
		{
			str2=str2+ch;
		}
		
		}
	String Result=str1.concat(str2);
 
 */