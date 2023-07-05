package com.StringQuestions;

import java.util.Scanner;

public class ReverseStringStringBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("ENter String");
		String s=scan.nextLine();
		
		StringBuilder reverse=new StringBuilder();
		
		char ch;
		for(int i=s.length()-1; i>=0;i--)
		{
			ch=s.charAt(i);
			reverse.append(ch); 
		}
	System.out.println("Reversed String:" +reverse);
	}

}
