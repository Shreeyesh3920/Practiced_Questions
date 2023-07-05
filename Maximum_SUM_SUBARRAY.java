package com.ArraysQuestions.arrayQuestionAnswers;

public class Maximum_SUM_SUBARRAY {

	public static void main(String[] args) {
		 int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
	        int maxSum = findMaxSubarraySum(nums);
	        System.out.println("Maximum Subarray Sum: " + maxSum);
	    }

	   
	
public static int findMaxSubarraySum(int[] nums) {
    int maxSum = nums[0];
    int currentSum = nums[0];

    for (int i = 1; i < nums.length; i++) {
        currentSum = Math.max(nums[i], currentSum + nums[i]);
        maxSum = Math.max(maxSum, currentSum);
    }

    return maxSum;
}
}
