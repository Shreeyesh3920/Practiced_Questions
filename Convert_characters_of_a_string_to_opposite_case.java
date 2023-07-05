package com.ArraysQuestions.stringQuestions;

public class Convert_characters_of_a_string_to_opposite_case {

	public static void main(String[] args) {
		
		//String str="Hello Every One"; //output hELLO eVERY oNE
		String str="geeksForgEeks";
		StringBuilder output=new StringBuilder();
		
		for(int i=0;i<str.length();i++) 
		{
			Character ch=str.charAt(i);
			if(Character.isLowerCase(ch)) 
			{
				output.append(Character.toUpperCase(ch));
			}
			else 
			{
				output.append(Character.toLowerCase(ch));
				
			}
		}
		
		System.out.println(output.toString().trim());
	}

}
