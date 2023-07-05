package com.StringQuestions;
// i was playing in the rain
//output=  i w p i t r
import java.util.Scanner;

public class FirstLetterOfEachWordInString {

	public static void main(String[] args) {
		System.out.println("Enter String");
		Scanner sc=new Scanner(System.in);
		String input=sc.nextLine();
		
		String output=splitString(input);
		System.out.println(output);

	}

	private static String splitString(String input) {
		//splitted the sentences of string in to the words based on spaces
		
		String splittedString[]=input.split(" ");
		//input= the weather was very cool;
		//splittedString[]={"the","weather","was","very","cool"}
		
		String output="",word;
		char firstWord;
		for(int i=0;i<splittedString.length;i++) {
			
			word=splittedString[i]; //splittedString[0]= the
			firstWord = word.charAt(0); // firstWord= t
			
			output=output+firstWord;
			
		}
		return output;
	}

}
