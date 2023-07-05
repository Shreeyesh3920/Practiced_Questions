package com.ArraysQuestions;
// [10,11,5,4,7]
// next greater element for 10 is 11 , 11=-1 , 5=7 , 4=7 , 7=-1;
//no greater element then -1;
public class FindNextGreaterElement {

	public static void main(String[] args) {
 
		int input[]= {10,11,5,4,7};
		int i,j;
		int max;
		
		for(i=0;i<input.length;i++) 
		{
			max=input[i];                                 
			for(j=i+1;j<input.length;j++) 
			{
				if(input[i]<input[j]) 						
				{	
					max=input[j];		
					
				}
			}
			//11==11 or 7==7 then -1
			if(input[i]==max) 
			{
				System.out.println(input[i]+"=-1");
			}
			//else print max
			else 
			{
			System.out.println(input[i]+"="+max);
			}
			
		}
	   
		
}

	
	
}
