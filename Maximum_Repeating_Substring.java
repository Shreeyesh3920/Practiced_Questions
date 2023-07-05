package com.ArraysQuestions.stringQuestions;

import java.util.ArrayList;

/*Input: sequence = "ababc", word = "ab"
Output: 2
Explanation: "abab" is a substring in "ababc".*/
public class Maximum_Repeating_Substring {

	public static void main(String[] args) {
		
		String s="ababc";
		String w="ab";
		int count=0;
		ArrayList<String> list=new ArrayList<>();
		
		for(int i=0;i<s.length();i++) 
		{
			for(int j=i+1;j<=s.length();j++) 
			{
				list.add(s.substring(i,j));
			}
		}
		System.out.println(list);
		for(int k=0;k<list.size();k++)
		{
			if(list.get(k).equals(w)) 
			{
				count++;
			}
		}
		System.out.println(count);
	}

}
