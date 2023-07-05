package com.ArraysQuestions.stringQuestions;

public class Remove_all_characters_other_than_alphabets_from_string {

	public static void main(String[] args) {
		String str="P&ra+$BHa;;t*ku, ma$r@@s#in}gh"; //output PraBHatkumarsingh
		
		StringBuilder output=new StringBuilder();
		for(int i=0;i<str.length();i++) 
		{
			char ch=str.charAt(i);
			if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) 
			{
				output.append(ch);
			}
		}
		System.out.println(output.toString());
	}

}
