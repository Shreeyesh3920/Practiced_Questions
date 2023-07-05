package com.StringQuestions;
// hello
//vowels= 2; consonant= 3;
public class NumberOfVowelsAndConsonantsInString {

	public static void main(String[] args) {
 
		String input="hElLo";
		int vowelCount=0,consonantCount=0;
		char ch;
		for(int i=0;i<input.length();i++) 
		{
			ch=input.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
			{
				vowelCount=vowelCount+1;
			}
			else 
			{
				consonantCount=consonantCount+1;
			}
		}
		System.out.println("vowelCount= "+vowelCount+" consonantCount= "+consonantCount);
	}

}
