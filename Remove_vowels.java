package com.ArraysQuestions.stringQuestions;

import java.util.Scanner;

public class Remove_vowels {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder output=new StringBuilder();
		
        String s = sc.nextLine();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e'
                || s.charAt(i) == 'i' || s.charAt(i) == 'o'
                || s.charAt(i) == 'u' || s.charAt(i) == 'A'
                || s.charAt(i) == 'E' || s.charAt(i) == 'I'
                || s.charAt(i) == 'O'
                || s.charAt(i) == 'U') {
                continue;
            }
            else {
                output.append(s.charAt(i));
            }
        }
	    System.out.println(String.valueOf(output));

	}

}
