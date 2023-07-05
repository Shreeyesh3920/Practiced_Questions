package com.questions;

import java.util.Scanner;

//palindrome number=   123321    786687


public class PalindromeNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		int input=sc.nextInt();
		int temp=input;
		int remainder,sum=0;
		
		while(input>0)
		{
			remainder=input%10;
			sum=(sum*10)+remainder;
			input=input/10;
		}
System.out.println("Reversed number= "+sum);

if(sum==temp) 
{
	System.out.println("Palindrome!");
}
else 
{
System.out.println("Not Palindrome");	
}
	}

	

	
}
