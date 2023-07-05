package com.ArraysQuestions.stringQuestions;

public class Remove_Character {

	public static void main(String[] args) {
		/*Remove characters from the first string which are present in the second string*/
		//string1 = “computer”
		//string2 = “cat”
		//Output: “ompuer”
		
		//String str1 ="computer";
		//String str2="cat";
		String str1 = "occurrence";
		String str2 = "car";
		StringBuilder output=new StringBuilder();
		
		for(int i=0;i<str1.length();i++) 
		{
			char ch=str1.charAt(i);
			if(str2.indexOf(ch) == -1) 
			{
				output.append(ch);
			}
		}
		
		System.out.println(String.valueOf(output));
	}

}
