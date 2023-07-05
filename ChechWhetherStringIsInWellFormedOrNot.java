package com.StringQuestions;

import java.util.ArrayDeque;
import java.util.Deque;

//well formatted String====== {[()]}
public class ChechWhetherStringIsInWellFormedOrNot {

	public static void main(String[] args) {
		
		String input="((";
		boolean result=true;
		
		Deque<Character> stack= new ArrayDeque<Character>();
		for(int i=0;i<input.length();i++) 
		{
			char ch=input.charAt(i);
			if(ch=='{'||ch=='['||ch=='(') 
			{
				stack.push(ch);
			}
			
			if(stack.isEmpty()) 
			{
				result=false;
			}
			
			char check; // check will basically checks that we are popping right ending brackets
			
			//switch case for checking closing brackets
			switch(ch) 
			{
			case ')': check=stack.pop();
					  if(check=='{'||check=='[') 
					  {
						  result=false;
					  }
					  break;
			
			case '}': check=stack.pop();
					  if(check=='('||check=='[') 
					  {
						  result=false;
					  }
					  break;
			  
			case ']': check=stack.pop();
			  		  if(check=='{'||check=='(') 
			  		  {
			  			  result=false;
			  		  }
			  		  break;
						
			}
			
		}
		if(result) 
		{
			System.out.println("Balanced");
		}
		else 
		{
			System.out.println("Not Balanced");
		}

	}

}
