package com.ArraysQuestions;
import java.util.Scanner;

public class ArrayRotation {
	public static void main(String[] args) {

		int input[]= {10,20,30,40,50};
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter any option: 1.CLOCKWISE 2. ANTI-CLOCKWISE ");
		int ch=scan.nextInt();
		
		System.out.println("Enter (n) for that time of rotation");
		int n=scan.nextInt();
		
		switch(ch) 
		{
		case 1: clockWise(input,n);
				break;
		case 2:	anticlockwise(input,n);
				break;
		}
	}

	private static void anticlockwise(int[] input, int n) {
		
		int i=0,first,len=input.length;
		
		//displaying original array
		for(i=0;i<len;i++) 
		{
			System.out.print(input[i]+" ");
		}
		System.out.printf("\n");
						for(i=0;i<n;i++)
						{
						first=input[0];
						for(int j=0;j<len-1;j++) 
						{	
							input[j]=input[j+1];
						}
						input[len-1]=first;
		
						}
		
		//displaying array
		for(i=0;i<len;i++) 
		{
			System.out.print(input[i]+" ");
		}
	}

	private static void clockWise(int[] input, int n) {
	}

}
