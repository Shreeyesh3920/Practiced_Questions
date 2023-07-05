package com.ArraysQuestions.searchingAndSorting;
//https://www.youtube.com/watch?v=TKIAVBsCLqk&list=PL6Zs6LgrJj3u57thS7K7yLPQb5nA23iVu&index=5
public class InsertionSort {

	public static void main(String[] args) {
		int input[]= {50,20,10,40,30};
		
		for(int i=1;i<input.length;i++) 
		{
			int temp=input[i];
			int j=i-1;
			
			while(j>=0&&temp<input[j]) 
			{
				input[j+1]=input[j];
				j=j-1;
			}
			input[j+1]=temp;
		}
		for(int i=0;i<input.length;i++)
			System.out.print(input[i]+" ");
	}
	

}
