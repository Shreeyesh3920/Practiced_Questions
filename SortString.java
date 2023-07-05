// java program to sort names in an array
package com.questions;
import java.util.Scanner;
public class SortString {

	public static void main(String[] args) {
		Scanner scan1=new Scanner(System.in);
		Scanner scan2=new Scanner(System.in);
		int n,i,j;
		String temp;
		
		System.out.println("Enter the no. of array:");
		n=scan1.nextInt();
		String string[]=new String[n];
		System.out.println("Enter the Names in array:");
		
		for(i=0;i<n;i++)
		{
			string[i]=scan2.nextLine();
		}
		
		for(i=0;i<n;i++)
		{
			for(j=i+1;j<n;j++)
			{
			 if(string[i].compareTo(string[j])>0)
			 {
				 
				 //swapping
				 temp=string[i];
				 string[i]=string[j];
				 string[j]=temp;
			 }
			}
		}
		
		
		System.out.println("Sorted array:");
		for(String strings:string) 
		{
			System.out.println(strings);
		}
		
	}

	
}
