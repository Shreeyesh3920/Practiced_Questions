package com.mayQuestion;

import java.util.Stack;

public class RemoveOuterParanthesisWithoutStack {

	public static void main(String[] args) {
		
		 String input = "(()())(())";
	        StringBuilder output = new StringBuilder();
	        int count = 0;
	        int openCount = 0;

	        for (int i = 0; i < input.length(); i++) {
	            char ch = input.charAt(i);

	            if (ch == '(') {
	                if (openCount > 0) {
	                    output.append(ch);
	                }
	                openCount++;
	            } else if (ch == ')') {
	                openCount--;
	                if (openCount > 0) {
	                    output.append(ch);
	                } else {
	                    count++;
	                }
	            }
	        }

	        for (int i = 0; i < count; i++) {
	            output.append("()");
	        }

	        System.out.println(output);
	    

	}

}
