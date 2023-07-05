package com.ArraysQuestions;
/*Input: digits = [1,2,3]
Output: [1,2,4]
Explanation: The array represents the integer 123.
Incrementing by one gives 123 + 1 = 124.
Thus, the result should be [1,2,4].

Input: digits = [9]
Output: [1,0]
Explanation: The array represents the integer 9.
Incrementing by one gives 9 + 1 = 10.
Thus, the result should be [1,0].*/
public class PluseOne {

	public static void main(String[] args) {
		int []digits= {1,2,3};
		
	       for(int i=0;i<digits.length;i++)
	       {
	        
	    	   if(i==digits.length-1)
	    	   {
	    		   if(digits[i]==9) 
	    		   {
	    			   
	    		   }
	    		   else 
	    		   {
	    			   digits[i]=digits[i]+1;   
	    		   }
	    		   
	    	   }
	    	   
	       } 
		 for(int k:digits) 
		 {
			 System.out.print(k+" ");
		 }
		
		
		
		
	}

}
