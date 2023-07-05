package com.ArraysQuestions.arrayQuestionAnswers;

public class Reverse_a_String {

	public static void main(String[] args) {
		String s = "Geeks";
		StringBuilder res=new StringBuilder();
		for(int i=s.length()-1;i>=0;i--) 
		{
			char ch=s.charAt(i);
			res.append(ch);
		}
		System.out.println(res);
	}

}
