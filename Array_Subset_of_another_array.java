package com.ArraysQuestions.arrayQuestionAnswers;

public class Array_Subset_of_another_array {

	public static void main(String[] args) {
		int a1[] = {11, 7, 1, 13, 21, 3, 7, 3};
		int a2[] = {11, 3, 7, 1, 7};
		//int a1[] = {10, 5, 2, 23, 19};
		//int a2[] = {19, 5, 3};
		boolean res=true;
		
		for(int i=0;i<a2.length;i++) 
		{
			for(int j=0;j<a1.length;j++)
			{
				if(a2[i]==a1[j]) 
					{res=true;
					break;
					}
				
				else if(a1.length==a2.length) 
				{
					res=false;
				}
				
			
				
			}
			
		}
		System.out.println(res);
	}

}
