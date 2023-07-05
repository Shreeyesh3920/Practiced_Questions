package com.questions;

import java.util.HashSet;

public class MissingNumbers {

public static void main(String[] args) {
Integer[] array= {2,4,5,6,1,7,9};
int len=array.length;



HashSet<Integer> hash=new HashSet<Integer>();

//adding array elements in hashset

for(int n:array)
{
hash.add(n);
}
//System.out.println(hash.contains(3));
//System.out.println(hash.contains(8));

int max=maxinArray(len,array);
System.out.println("maximum no. in array="+max);
System.out.println("missing no. in array:");
missingNumbers(hash,len,max);


	}



private static int maxinArray(int len, Integer[] array) {
	int max=array[0];
	for(int i=0;i<len;i++)
	{
		if(max<array[i])
		{
			max=array[i];
		}
	}
	return max;
	}



private static void missingNumbers(HashSet<Integer> hash, int len ,int max) {
		
	for(int i=1;i<max;i++)
	{
		if(!hash.contains(i))
		{
			System.out.println(i);
		}
	}
		
	}

}
