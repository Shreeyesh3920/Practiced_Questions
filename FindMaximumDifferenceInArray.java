package com.ArraysQuestions;
// array[]={2,4,6,8,10}
// max difference= 8
// 1. find minimum number here it is 2
// 2. then find maximum number here it is 10
// 3. then maximum-minimum= 10-2=8;
public class FindMaximumDifferenceInArray {

	public static void main(String[] args) {
	int array[]= {2,4,6,8,10};
int max, min;
max=array[0];
min=array[0];
for(int i=1;i<array.length;i++)
		{
			if(array[i]>max) 
			{
				max=array[i];
			}
		}

for(int i=1;i<array.length;i++)
{
	
	if(array[i]<min) 
	{
		min=array[i];
	}
}
	
	System.out.println(max-min);
	
	}

}
