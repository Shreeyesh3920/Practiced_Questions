package com.ArraysQuestions.arrayQuestionAnswers;

public class Remove_duplicate_elements_from_sorted_Array {

	public static void main(String[] args) {
		int arr[]= {1,2,2,3,3,4}; //1,2,3,4
		int n=arr.length;
		// Check if the array is empty or contains only one element
        if (n == 0 || n == 1) {
            System.out.println("No duplicates found.");
            return;
        }
        int[] temp = new int[n];
        int j = 0;
        
        for (int i = 0; i < n - 1; i++) {
            // If the current element is not equal to the next element, add it to the temp array
            if (arr[i] != arr[i + 1]) {
                temp[j++] = arr[i];
            }
        }
        
        // Add the last element of the original array to the temp array
        temp[j++] = arr[n - 1];
        
        // Modify the original array with the elements from the temp array
        for (int i = 0; i < j; i++) {
            arr[i] = temp[i];
        }
        
        // Print the array without duplicates
        for (int i = 0; i < j; i++)
        {
            System.out.print(arr[i] + " ");
        }
	}

}
/*int arr[]= {1,2,2,3,3,4}; //1,2,3,4
		int n=arr.length;
		int temp[]=new int[n];
		int j=0;
		for(int i=0;i<n-1;i++)
		{
		    if(arr[i]!=arr[i+1])
		    {
		        temp[j]=arr[i];
		        j++;
		    }
		
		}
		temp[j]=arr[n-1];
		j++;
		*/