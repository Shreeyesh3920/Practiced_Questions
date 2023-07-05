package com.mayQuestion;
// range from 1 to 20
// and given digit is 1
// so how may times does 1 occurs like 1,11,12,13...19 
public class OccurenceOfDigitsInRange {

	public static void main(String[] args) {
		
		int digit=1;
		//range from 1 to 20
		int range=20;
		int count=0;
		for(int i=1;i<=range;i++) 
		{
			int temp=i;
			while(temp>0) 					//1121				112				11				1
			{
				int remain=temp%10;			//1					2				1				1
				if(remain==digit) 
				{				
					count++;				//count=1			count=1			count=2			count=3
				}	
				temp=temp/10;				//1121/10=112		112/10=11		11/10=1			1/10=0  Stops!
			}
		}
		System.out.println(count);
	}

}
