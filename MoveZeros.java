package com.ArraysQuestions.arrayQuestionAnswers;

public class MoveZeros {

	public static void main(String[] args) {
		
		int arr[]= {0,1,2,0,4,0}; //1,2,4,0,0,0;
		int mov=0,count=0;
		
		for(int i=0;i<arr.length;i++) 
		{
			if(arr[i]!=0) 
			{
				arr[mov]=arr[i];
				mov++;
			}
			else 
			{
				count=count+1;
			}
		}
		for(int j=mov;j<arr.length;j++)
        {
        	arr[j]=0;
        }
		
		for(int o:arr) {
	        System.out.print(o+" ");
	        }
	}

}
