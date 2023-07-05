package com.questions;
import java.util.*;
/*Write a program to check if, for a given number N, its power of 4 ends with the number
itself or not.
Hint:
Power of 4 for number 5=3125 so end digit of 3125 which is 5.*/
public class TCS_PowerOf4EndWithSameNumber {

	public static void main(String[] args) {
		int input=6;
		int power=(int) Math.pow(input,4);
		System.out.println(power);
		 
		if(power%10==input)
		{
			System.out.println("true");
		}
		else 
		{
			System.out.println("false");
		}
		

	}

}
