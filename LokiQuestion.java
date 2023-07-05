package com.questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/*#Test cases
Sample Input:
6
9 3 1 2 4 2
Sample Output:
2
Output Specifications:
Loki can brainwash the avengers with power 9 and 3, or with 9 and 2, or with 9,4, 
and the rest will be losing cause the cumulative power of the rest avengers is 
less than the brainwashed total power by Loki.*/
public class LokiQuestion {

	public static void main(String[] args) {
		
	    int arr[]= {9,3,1,2,4,2};   //strengths
	    int sum=0;
	    for(int i=0;i< arr.length;i++)
	    {
	        sum=sum+arr[i];      //sum of strengths of Avengers
	    }  
	  Arrays.sort(arr);    // sorted the strength array
	  
	  int sum1=0,count=0;		//count for no. of brainwashed avengers
	  							//sum1 for total brainwashed avengers strength
	  for(int i=arr.length-1;i>= 0;i--)
	{
	    sum1=sum1+arr[i];
	    sum=sum-arr[i];
	    count++;  
	  if(sum1> sum)
	   break;
	} 

	System.out.println(count);
	}

}
