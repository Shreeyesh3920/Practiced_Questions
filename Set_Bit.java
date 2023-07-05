package com.questions;
/*You are given an integer, N. You have to turn it into the binary representation
of it and find out how many set bits are there in the binary representation.
Sample Input:
8
Output:
1
Output Description:
8 in binary is 1000.
*/
public class Set_Bit {

	public static void main(String[] args) {

		int input=25;
		System.out.println("Integer: "+input);
		//////////////////////////////////////////////////
		String inputObit=Integer.toBinaryString(input);
		/////////////////////////////////////////////////
		System.out.println("Bits: "+inputObit);
		
		int count=0; //to count set bits
		
		for(int i=0;i<inputObit.length();i++) 
		{
			char ch=inputObit.charAt(i);
			if(ch=='1') 
			{
				count+=1;
			}
		}
		
		System.out.println("SetBits: "+count);
		
	}

}
