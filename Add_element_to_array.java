package com.ArraysQuestions.arrayQuestionAnswers;

import java.util.ArrayList;
import java.util.List;

public class Add_element_to_array {

	public static void main(String[] args) {
		int arr[]= { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		
		List<Integer> arrlist=new ArrayList<>();

		for(int ele:arr) 
		{
			arrlist.add(ele);
		}
		
		System.out.println(arrlist);
		arrlist.add(11);
		System.out.println(arrlist);
		
		//arrlist ko array mai covert kardiya fir hum ye arrlist ko return kar sakte hai agar return type array he hai
		arrlist.toArray();
		System.out.println(arrlist);
	}

}
