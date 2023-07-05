package com.questions;
import java.util.*;

public class FindLongestSubstringWithoutRepetition {

	public static void main(String[] args) 
	{
		    
		    	  Scanner scan=new Scanner(System.in);
		          System.out.println("Enter Input");
		          String input=scan.nextLine();
		          HashSet<Character> hash=new HashSet<>();

		          for(int i=0;i<input.length();i++)
		          {
		              char ch=input.charAt(i);
		              if(hash.contains(ch))
		              {
		                  
		                  break;
		              }
		              else 
		              {
		            	  hash.add(ch);
		              }
		          }
		          
		          System.out.println(hash);
	}

}