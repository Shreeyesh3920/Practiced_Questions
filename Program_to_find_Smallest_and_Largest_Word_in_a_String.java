package com.ArraysQuestions.stringQuestions;

public class Program_to_find_Smallest_and_Largest_Word_in_a_String {

	public static void main(String[] args) {
		
		String str="This is a test string"; //output min= a and max=string
		
		String words[]=str.split(" ");
		String max = words[0];
        String min = words[0];
		
		for(int i=0;i<words.length;i++)
		{
			
			if(words[i].length()>max.length())
			{
				max=words[i];
			}
			if(words[i].length()<min.length()) 
			{
				min=words[i];
			}
		} 
		System.out.println("Min: "+min+" Max: "+max);
	}

}
