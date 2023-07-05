package com.questions;

import java.util.Scanner;
public class StringReverse {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("ENter String");
		String s=scan.nextLine();
		
		String reverse="";
		
		char ch;
		for(int i=s.length()-1; i>=0;i--)
		{
			ch=s.charAt(i);
			reverse=reverse+ch; 
		}
	System.out.println("Reversed String:" +reverse);
	}

}
