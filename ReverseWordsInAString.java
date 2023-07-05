package com.StringQuestions;
//Input: s = "the sky is blue"
//Output: "blue is sky the"
public class ReverseWordsInAString {

	public static void main(String[] args) {

			String input="  hello world  ";
			String output="";
			
			
			//This array stores the words 
			String split[]=input.split("\\s+");
			
			for(int i=split.length-1;i>=0;i--) 
			{
				if(i!=0)
				output=output+split[i]+" ";
			}
			
			System.out.println(output);
	}

}
