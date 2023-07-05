package com.mayQuestion;
import java.util.*;
//String input="(()())(())";
//output=()()();
public class RemoveOuterMostParenthesis {

	public static void main(String[] args) {
		
		String input="(()())(())";
		StringBuilder output=new StringBuilder();
		int count=0;
		Stack<Character> stack=new Stack<>();
		for(int i=0;i<input.length();i++) 
		{
			char ch=input.charAt(i);
			if (ch == '(' && (stack.isEmpty() || stack.peek() != '(')) {
                stack.push(ch);
            }
			else if(ch=='(' && stack.peek()==')') 
			{
				stack.push(ch);
				//count++;
			}
			else if(ch==')' && stack.peek()=='(') 
			{
				stack.push(ch);
				count++;
			}
			else 
			{
				stack.pop();
				stack.push(ch);
			}
			
		}
		
		
		for(int i=0;i<count;i++) 
		{
			output.append("()");
			
		}
		System.out.println(output);
		System.out.println(stack);
	}

}
