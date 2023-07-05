package com.questions;
/*Input Format:
A string consisting of N and S as north and south poles.

Output Format:
An integer denoting the number of poles will be needed.

Sample Input: SNNSN

Output: 3*/

public class Iron_RodQuestion {

	public static void main(String[] args) {
		String input="SNNSN";
		int swaps=0,northpole=0,southpole=0;
		boolean balanced=true;
		
		for(int i=0;i<input.length();i++) 
		{
			char pole=input.charAt(i);
			if(pole=='N')
			{
			   northpole+=1;
			}
			else if(pole=='S') 
			{
				southpole+=1;
			}
			
			if(northpole>0 && southpole>0) 
			{
				if(northpole==southpole) 
				{
				  swaps+=northpole;
				  northpole=0;
				  southpole=0;
				}
				else 
				{
					balanced=false;
				}
			}
		}
	
	if(balanced) 
	{
		System.out.println("Swaps: "+swaps);
	}
	else 
	{
		System.out.println("-1");
	}
		
	}

}
