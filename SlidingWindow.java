package com.ArraysQuestions.searchingAndSorting;

public class SlidingWindow {

	public static void main(String[] args) {
		//calculate max sum of sub-array given max length k from given array

		
		  int nums[] = {2, 9, 31, -4, 21, 7};
	        int k = 3;
	        int sum = 0;
	        int max = 0;
	        
	        
	        // Calculate the sum of the first k elements
	        for (int i = 0; i < k; i++) {
	            sum += nums[i];
	        }
	        max = sum;
	        
	        // Slide the window and update the maximum sum
	        for (int i = k; i < nums.length; i++) {
	            sum = sum - nums[i - k] + nums[i];
	            max = Math.max(max, sum);
	        }
	        
	        System.out.println("Result: " + max);
	}

}
