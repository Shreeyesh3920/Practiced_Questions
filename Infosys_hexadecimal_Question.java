package com.questions;

import java.util.Scanner;

/*https://scriptlearners.com/infosys-power-programmer-interview-question-2023-java-coding-problems-ctc-9-5-lpa/
 * N-base notation is a system for writing numbers that uses only 
 * n different symbols, These symbols are the first n symbols from
 *  the given notation list Decimal to n base notation are 
 *  (0:0, 1:1, 2:2, 3:3, 4:4, 5:5, 6:6, 7:7, 8:8, 9:9, 10:A,11:B and so on upto 35:Z)
Testcase – 1 :
Input : 
n: 12
num: 718
Output : 4BA
Explaination :
Num	Divisor	Quotient	Remainder
718	12		59				10(A)
59	12		4	 			11(B)
4	12		0				4
*/
public class Infosys_hexadecimal_Question {

	public static void main(String[] args) {

		int n;
		int num;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter n:");
		n=scan.nextInt();
		System.out.println("Enter num:");
		num=scan.nextInt();
		int quotient=num;
		int rem;
		int reminder[]=new int[10];
		
		while(true) 
		{
			rem=quotient%n;
			quotient=(quotient/n);
			if(rem>9) 
			{
				
			}
			
			
		}
		
	}

}
