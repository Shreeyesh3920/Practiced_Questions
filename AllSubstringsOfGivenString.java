package com.StringQuestions;

public class AllSubstringsOfGivenString {
/*
 *  String s="SachinTendulkar";    
 System.out.println("Original String: " + s);  
 System.out.println("Substring starting from index 6: " +s.substring(6));//Tendulkar    
 System.out.println("Substring starting from index 0 to 6: "+s.substring(0,6)); //Sachin  */
	public static void main(String[] args) {

		//String input="abc";
		String input="shree";
		
		for(int i=0;i<input.length();i++) 
		{
			for(int j=i+1;j<=input.length();j++) 
			{
				System.out.println(input.substring(i,j));
				//String words=input.substring(i,j);
			}
		}
		
		//System.out.println(input.substring(2,3));
	}

}
//i=0
//j=1 ->a,
//j=2 ->ab
//j=3 ->abc

//i=1
//j=2 ->b
//j=3 ->bc


//i=2
//j=3 ->c