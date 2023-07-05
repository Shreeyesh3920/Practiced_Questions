package com.ArraysQuestions;

//array={10,20,30,40,50} and given sum is 50
// which two numbers from array will give the sum 50;
//20+30; 40+10;
//solution: A+B=C     
//          C-B=A      
public class TwoSumProblem {

	public static void main(String[] args) {
		
		int array[]= {10,20,30,40,50};
		int n=array.length;
		int sum=50;
		
		for(int i=0;i<n;i++)							//i=0 10
		{
			int res=sum-array[i];						// 50-10=40  i.e givenSum-10 
			for(int j=i+1;j<n;j++) 						// in this loop we are just finding 40 is present or not
			{
				if(array[j]==res)
				{
					System.out.println(array[i]+","+array[j]); // if present then we are just printing 10 and 40;
				}
			}
			
		}

	}

}
