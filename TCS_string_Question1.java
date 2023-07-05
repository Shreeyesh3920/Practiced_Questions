package com.StringQuestions;

import java.util.Scanner;

/*Problem Statement – Given a string S(input consisting) of ‘*’ and ‘#’. The length of the string is variable. The task is to find the minimum number of ‘*’ or ‘#’ to make it a valid string. The string is considered valid if the number of ‘*’ and ‘#’ are equal. The ‘*’ and ‘#’ can be at any position in the string.

Note : The output will be a positive or negative integer based on number of ‘*’ and ‘#’ in the input string.

(*>#): positive integer
(#>*): negative integer
(#=*): 0
Example 1:

Input 1:

###***   -> Value of S
Output :

0 → number of * and # are equal*/
public class TCS_string_Question1 {

	public static void main(String[] args) {
System.out.println("Enter String:");
Scanner sc=new Scanner(System.in);
String input=sc.nextLine();
int count1=0,count2=0;
		
for(int i=0;i<input.length();i++) 
{
	char ch=input.charAt(i);
	if(ch=='#')
	{
		count1=count1+1;
	}
	else 
	{
		count2=count2+1;
	}
}
if(count1==count2) 
{
System.out.println("0");	
}
else if(count1>count2) 
{
 System.out.println("Positive integer");	
}
else 
{
	System.out.println("negative integer");
}

	}

}
