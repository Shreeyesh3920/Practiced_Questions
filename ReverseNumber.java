package com.questions;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number"); //123
		Scanner scan=new Scanner(System.in);
		int input= scan.nextInt();
		int remainder,sum=0;
		while(input>0) 
		{
			remainder=input%10;   // 123%10 = 3
			//System.out.println(remainder); //3
			
			sum=(sum*10)+remainder;
			
			input=input/10;     // 123/10= 12.3   then in next loop 12 will be 12%10 then it print 2. 
		}
		
System.out.println(sum);
	}

}
