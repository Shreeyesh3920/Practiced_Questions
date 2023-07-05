package com.StringQuestions;


/*
  Capgemini in its online written test have a coding question, wherein the students are given
  a string with multiple characters that are repeated consecutively. You’re supposed to reduce 
  the size of this string using mathematical logic given as in the example below :
Input :aabbbbeeeeffggg
Output:a2b4e4f2g3

 */
public class Capgemini_String_question2 {

	public static void main(String[] args) {
		String str1="";
		String str2="";
		
		String input="aabbbbeeeeffggg";
		//removed duplicates
		for(int i=0;i<input.length();i++) 
		{
			if(str1.indexOf(input.charAt(i))<0) //whether index of character a in input...is less than 0 in str1 ?
			{
				str1=str1+input.charAt(i);
			}
		}    //-----> output=abefg
		//main
		for(int i=0;i<str1.length();i++)  // abefg i.e for loop for 5
		{
			int count=0;
			for(int j=0;j<input.length();j++)  //aabbbbeeeeffggg  for comparing 
			{
				if(str1.charAt(i)==input.charAt(j)) 
				{
					count=count+1;
				}
			}
			
			str2=str2+str1.charAt(i)+count;
			
		}
		System.out.println(str2);
	}

}
