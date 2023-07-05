package com.questions;
import java.util.HashSet;
public class union {

//find Union of elements in two arrays in java
//Input: A[] = {1,4,3,2,5, 8,9} , B[] = {6,3,2,7,5}

//Output: {1,2,3,4,5,6,7,8,9}


	public static void main(String[] args) {

		Integer A[]={1,4,3,2,5, 8,9},B[] = {6,3,2,7,5};
		
		HashSet<Integer> set=new HashSet<Integer>();
		//adding array1 in set
		for(int n1:A)
		{
			set.add(n1);
		}
		
		//adding array2 in set identifying the intersection
		System.out.println("output:");
		for(int n2:B)
		{
			if(!set.contains(n2))
			{
				set.add(n2);
			}
		}
	
	
		for(int s:set) 
		{
			System.out.println(s);
		}
		
	}

}
/* array1 and array2
   add array1 in set
   then add array2 in set and print those elements which will be repeat in set
 */