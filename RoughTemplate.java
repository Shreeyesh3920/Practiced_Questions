package com.ArraysQuestions;

import java.util.ArrayList;

public class RoughTemplate {

	public static void main(String[] args) {
		
		int input[]= {-6,1,2,4,5,7};
		
		//Displaying array in [, , ,] format **********************************************
		ArrayList<Integer> array=new ArrayList<>();
		for(int n=0;n<input.length;n++) 
		{
			array.add(input[n]);
		}
		 System.out.println(array);
	}

}
