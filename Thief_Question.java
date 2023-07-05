package com.ArraysQuestions.arrayQuestionAnswers;
/*There are N houses built in a line, each of which contains some value in it. 
 * A thief is going to steal the maximum value of these houses, but he can’t steal 
 * in two adjacent houses because the owner of the stolen houses will tell his two 
 * neighbors left and right sides. The task is to find what is the maximum stolen value.

Examples: 
Input: hval[] = {6, 7, 1, 3, 8, 2, 4}
Output: 19
Explanation: The thief will steal 6, 1, 8 and 4 from the house.

Input: hval[] = {5, 3, 4, 11, 2}
Output: 16
Explanation: Thief will steal 5 and 11*/
public class Thief_Question {

	public static void main(String[] args) {
		//int arr[]={6, 7, 1, 3, 8, 2, 4};
		int arr[]= {5, 3, 4, 11, 2};
		int n=arr.length;
		
		if(n==0) 
		{
			System.out.println("0");
		}
		if(n==1) 
		{
			System.out.println(arr[0]);
			
		}
		if(n==2) 
		{
			System.out.println(Math.max(arr[0],arr[1]));
		}
		
		int evensum=0;
		int oddsum=0;
		
		for(int i=0;i<arr.length;i++)
		{
			if(i%2==0) 
			{
				evensum=evensum+arr[i];
				evensum=Math.max(oddsum,evensum);
			}
			else 
			{
				oddsum=oddsum+arr[i];
				oddsum=Math.max(oddsum,evensum);
			}
		}
		System.out.println(evensum+" "+oddsum);
		int result=Math.max(evensum, oddsum);
		
		System.out.println(result);
	}

}
