package com.ArraysQuestions.searchingAndSorting;

public class SlidingWindowii {

	public static void main(String[] args) {

		  int nums[] = {2, 9, 31, -4, 21, 7};
	        int k = 3;
	        int sum = 0;
	        int max = 0;
	        
	        int j=0;
	        // Calculate the sum of the first k elements
	        for (int i = 0; i < k; i++) {
	            sum += nums[i];
	        }
	        max = sum;
	        
	        // Slide the window and update the maximum sum
	        for (int i = k; i < nums.length; i++) {
	            sum = sum - nums[j] + nums[i];
	            max = Math.max(max, sum);
	            j++;
	        }
	        
	        System.out.println("Result: " + max);

	}

}
