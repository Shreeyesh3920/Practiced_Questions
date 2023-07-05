package com.questions;
import java.util.HashSet;

//find intersection of elements in two arrays in java
//Input: A[] = {1,4,3,2,5, 8,9} , B[] = {6,3,2,7,5}
//
//Output: {3,2,5}
public class IntersectionOfArrays {

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
			if(set.contains(n2))
			{
				System.out.println(n2);
			}
		}
	}

}
/* array1 and array2
   add array1 in set
   then add array2 in set and print those elements which will be repeat in set
 */