package com.StringQuestions;
import java.util.ArrayDeque;
import java.util.Deque;
public class ValidParenthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String input="{[()]}";
boolean result=true;

Deque<Character> stack=new ArrayDeque<Character>();
			for(int i=0;i<input.length();i++) 
			{
			 char ch=input.charAt(i);
			 if(ch=='(') 
			 {
				 stack.push(')');
			 }
			 else if(ch=='[') 
			 {
				 stack.push(']');
			 }
			 else if(ch=='{') 
			 {
				 stack.push('}');
			 }
			 
			 else if(stack.isEmpty()|| stack.pop()!=ch) 
			 {
				 result=false;
			 }
			 
			}
		System.out.println(result);
	}

}
