package com.ArraysQuestions.stringQuestions;
/*Given a string, count the number of words in it. The words are 
 * separated by the following characters: space (‘ ‘) or new line (‘\n’) or tab (‘\t’) or a combination of these.*/
public class Count_words {

	public static void main(String[] args) {
		String input = "Hello,\tworld!\nHow are you?";
		 input = input.trim();

	        // If the input is empty, return 0
	        if (input.isEmpty()) {
	        	System.out.println("0"); 
	        }

	        // Split the input string into words using regex
	        String[] words = input.split("[\\s]+");

	        // Return the number of words
	       System.out.println(words.length); 
	}

}
