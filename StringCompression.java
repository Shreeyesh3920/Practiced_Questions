package com.questions;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

//input aabbbbccc
//output a2b4c3
public class StringCompression {

	public static void main(String[] args) {
System.out.println("Enter String");
		Scanner scan=new Scanner(System.in);
		String input=scan.nextLine();
		
Map<Character,Integer> map=new LinkedHashMap<Character,Integer>();		
		for(int i=0;i<input.length();i++)
		{
			char ch=input.charAt(i);	
			if(map.get(ch)!=null)
			{
				map.put(ch,map.get(ch)+1);
			}
			else 
			{
				map.put(ch,1);
			}
		}
		
		
		System.out.println(map);
		
		
	}

}
