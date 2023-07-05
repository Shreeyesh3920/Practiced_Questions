package com.ArraysQuestions.stringQuestions;

public class BreakAPalindrome {

	public static void main(String[] args) {
		//String palindrome="abccba"; //aaccba
		String palindrome="aaaaa";
		char[] words=palindrome.toCharArray();
		
		if(palindrome.length()==1) 
		{
			System.out.println("");
		}
		else 
		{
			for(int i=0;i<palindrome.length()/2;i++) 
			{
				if(words[i]!='a') 
				{
					words[i]='a';
					break;
				}
			}
			words[palindrome.length()-1]='b';
		}
		
		
		System.out.println(String.valueOf(words));
	}

}
