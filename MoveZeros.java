package com.ArraysQuestions;

public class MoveZeros {

	public static void main(String[] args) {
		int nums[]= {0,1,0,3,12};
		 int n=nums.length;
	        int count=0;
	        int mov=0;
	        ////////////////////////////////////////////////////
	        for(int i=0;i<n;i++)
	        {
	            if(nums[i]!=0)
	            {
	                nums[mov]=nums[i];
	                mov++;        
	            }
	            else
	            {
	                count=count+1;
	            }
	        }
	        ////////////////////////////////////////////////////
	        for(int j=mov;j<nums.length;j++)
	        {
	        	nums[j]=0;
	        }
	       ///////////////////////////////////////////////////// 
	        System.out.println(count);
	        
	        for(int o:nums) {
	        System.out.print(o+" ");
	        }
	}

}
