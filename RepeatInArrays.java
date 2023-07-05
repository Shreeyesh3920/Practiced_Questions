package com.ArraysQuestions;

public class RepeatInArrays {

	public static void main(String[] args) {

		int array[]= {1,2,4,7,2,8,1};
		int temp[]=new int[array.length];
		//temp[]={0,0,0,0,0,0,0}
		for(int i=0;i<temp.length;i++)
		{
			if(temp[array[i]]==1)
			{
				System.out.println(array[i]);
			}
			else 
			{
				temp[array[i]]++;
			}
			
		}
	}

}
