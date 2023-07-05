package com.questions;

import java.util.Scanner;

/*The happy number can be defined as a number which will yield 1 when it is replaced
 *  by the sum of the square of its digits repeatedly. If this process results in an 
 *  endless cycle of numbers containing 4, then the number is called an unhappy number.
 *  32 + 22 = 13
	12 + 32 = 10
	12 + 02 = 1   happy number
 *  */
public class HappyNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter a non-zero Positive Number:");
		int number = sc.nextInt( );
		int result = number;
		////////////////////////////////////////////////////////
		while (result != 1 && result != 4)
		{
		result = checkHappyNumber(result);
		}
		////////////////////////////////////////////////////////
		if (result ==1)
		{
		System.out.println ("It is a Happy Number");
		}
		else
		{
		System.out.println (" It is not a Happy Number");
		}
		/////////////////////////////////////////////////////////
	}
	public static int checkHappyNumber (int number)
	{
	int rem = 0, sum = 0;
	while(number > 0)
	{
	rem = number %10;
	sum = sum+(rem*rem);
	number = number/10;
	}
	return sum;
}
	}
