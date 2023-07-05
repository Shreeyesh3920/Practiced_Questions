package com.ArraysQuestions.stringQuestions;

public class capitalize_the_first_and_last_character_inAString {

	public static void main(String[] args) {
		String str="hello w example"; //output HellO WorlD ExamplE
		StringBuilder result=new StringBuilder();
		String words[]=str.split(" ");
		for(String word:words) 
		{
			if(word.length()>1) 
			{
				char firstchar=Character.toUpperCase(word.charAt(0));
				char lastchar=Character.toUpperCase(word.charAt(word.length()-1));
				String middle=word.substring(1,word.length()-1);
				result.append(firstchar).append(middle).append(lastchar);
			}
			else 
			{
				char ch=Character.toUpperCase(word.charAt(0));
				result.append(ch);
			}
			result.append(" ");
		}
		
		System.out.println(result.toString().trim());
	}

}
