package com.ArraysQuestions.arrayQuestionAnswers;
import java.util.*;
import java.util.Arrays;

/*Input: arr[] = [100, 5, 70, 2] 
Output: [4, 2, 3, 1] 
Explanation: 
Rank of 2 is 1, 5 is 2, 70 is 3 and 100 is 4.
Input: arr[] = [100, 2, 70, 2] 
Output: [3, 1, 2, 1] 
Explanation: 
Rank of 2 is 1, 70 is 2 and 100 is 3.*/
public class Replace_each_element_of_Array_with_its_corresponding_rank {

	public static void main(String[] args) {
		
		int arr[]= {100, 2, 70, 2};
		int n=arr.length;
		int rankedEle[]=new int[n];
		//1 sort the array [2,2,70,100]
		Arrays.sort(arr);
		//2 create HashMap
		HashMap<Integer,Integer> map=new HashMap<>();
		//3 declare rank variable
		int rank=1;
		//4 if element is not contains in hash map then put the element and increase the rank
		for(int i=0;i<arr.length;i++) 
		{
			if(!map.containsKey(arr[i])) 
			{
				map.put(arr[i], rank);
				rank++;
			}
		}
		//adding ranks to the corresponding element of arr
		for(int j=0;j<arr.length;j++) 
		{
			rankedEle[j]=map.get(arr[j]); // it will give the value for key (whether the key is repeated or not)
		}
		//printing rankedARRAY
		for(int ele:rankedEle)
		System.out.print(ele+" ");
	}

}
