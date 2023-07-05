package com.ArraysQuestions.arrayQuestionAnswers;
import java.util.*;
import java.util.Map.Entry;
public class Non_Repeating_Element {

	public static void main(String[] args) {
		int arr[] = {-1, 2, 3, 2};
		
		HashMap<Integer,Integer> map=new HashMap<>();
		
		for(int ele:arr) 
		{
			if(!map.containsKey(ele))
			{
				map.put(ele,1);
			}
			else 
			{
				map.put(ele,map.get(ele)+1);
			}
			
		}
		// iterating hashmap and getting key by using codition on value
		for(Entry<Integer, Integer> ele:map.entrySet()) 
		{
			if(ele.getValue()==1) 
			{
				System.out.print(ele.getKey()+" ");
			}
			
		}
		
		
	}

}

/*
 
for(Entry<Integer,Integer> entry:map.entrySet())
{
//here now i can use these methods like entry.getKey() and entry.getValue()
}
 * 
 */
