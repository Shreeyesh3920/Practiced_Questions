package com.StringQuestions;
import java.util.*;
/*Ques :
Consider one string as input. You have to check whether the strings obtained
from the input string with single backward and single forward shift are the
same or not. If they are the same, then print l; otherwise, print 0.
Hint :
Backward Shift : A single circular rotation of the string in which the first
character becomes the last character and all the other characters are shifted
one index to the left. For example, "abcde" becomes "bcdea" after one
backward shift.
Forward Shift: A single circular rotation of the string in which the last
character becomes the first character and all the other characters are shifted to
the right. For example, "abcde" becomes "eabcd" after one forward shift.

after shifting if both stringmatches return 1 else 0;
*/
public class BackwardandForwardShifting {
//###################ONE TIME FORWARD AND BACKWARD ROTATION########################
	public static void main(String[] args) {
		//String input="mama";
		String input="abcde";

		String fstring=forwardshifting(input);
		String bstring=backwardshifting(input);
		
		if(fstring.equals(bstring)==true) 
		{
			System.out.println("Success");
		}
		else 
		{
			System.out.println("Failure");
		}
	}

	private static String backwardshifting(String input) {
		String sf;
			sf=input.charAt(input.length()-1)+input.substring(0,input.length()-1); 
			System.out.println(sf);
		
		System.out.println("ForwardShift"+sf);
		
		return sf;
	}

	private static String forwardshifting(String input) {
		String sb;
		
			sb=input.substring(1,input.length())+input.charAt(0);
			System.out.println(sb);
		
		
		System.out.println("ForwardShift"+sb);
		return sb;
	}

}
