package com.StringQuestions;
//input= hello world
//output= enter the character that you want to find the Occurences
//output= l then it will be 3.
//explaination= "hello world" = total characters== 11
//				heo word= remaining characters== 8    so 11-8=3 times the 'l' is occured
//here using replace we will replace "l" with empty""; 
import java.util.Scanner;

public class CharacterOccurencesUsingReplace {

	public static void main(String[] args) {
		String input="hello world";
		int initialLength=input.length();
//***********************************************************		
		System.out.println("enter the character:");
		Scanner sc=new Scanner(System.in);
		String in=sc.next();
//**********************************************************		
		String finalInput=input.replace(in,"");
		int finalLength=finalInput.length();
//***********************************************************		
		int remain= initialLength-finalLength;
		System.out.println("NumberOfOccurences="+remain);
	}

}
