/*You have been provided with an array ‘arr’ of length ‘N’,
 *  which contains single digit values at each index. 
 *  Your responsibility is to find the product of all elements in
 *  the array and then return the sum of the digits in the resulting product.

Example :
Testcase – 1 :
Input :
n: 6
Array : 4 5 6 8 9 7
Output : 18
Explaination : The product of all the elements present in the Array is : 60,480 ( 4 * 5 * 6 * 8 * 9 * 7 ) , 
Sum of all the digits in 60,480 is 18 ( 6 + 0 + 4 + 8 + 0 ) .*/
package com.ArraysQuestions;

public class HCL_Array_Question1 {

	public static void main(String[] args) {

		int input[]= {14,5,6,19,23,45,12,7};
		int sum=0,product=1;
		for(int i=0;i<input.length;i++) 
		{
			product=product*input[i];
		}
		int pro;
		while(product>0)
		{
	     pro=product%10;          
	     sum=sum+pro;		
	     product=product/10;  
		}         
	
		System.out.println("Sum: "+sum);
	}

}
