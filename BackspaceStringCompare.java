package com.StringQuestions;

import java.util.Stack;

/*Input: s = "ab#c", t = "ad#c"
Output: true
Explanation: Both s and t become "ac".*/
public class BackspaceStringCompare {

	public static void main(String[] args) {
String s="ab#cd",t="a#c#d";
		
Stack<Character> stack=new Stack<>();
        
		for(int i=0;i<s.length();i++)
        {
           char ch=s.charAt(i);
           if(ch!='#')
           {
        	   stack.push(ch);
           }
           else
           {
        	   do 
        	   {
        		   stack.pop();
        	   }while(!stack.isEmpty());
           }
           
        }
        System.out.println(stack);
        
Stack<Character> stack2=new Stack<>();
        
		for(int j=0;j<t.length();j++)
        {
           char ch=t.charAt(j);
           if(ch!='#')
           {
        	   stack2.push(ch);
           }
           else
           {
        	   do 
        	   {
        		   stack2.pop();
        	   }while(!stack2.isEmpty());
           }
           
        }
        System.out.println(stack2);
        
        if(stack.equals(stack2)) 
        {
        	System.out.println(true);
        }
        else 
        {
        	System.out.println(false);
        }
	}

}
