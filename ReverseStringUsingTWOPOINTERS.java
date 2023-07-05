package com.StringQuestions;

public class ReverseStringUsingTWOPOINTERS {

	public static void main(String[] args) {
		
		//two pointers technique
		 char s[] = {'h','e','l','l','o'};

		int left=0;
		int right=s.length-1;

		while(left<=right)
		{   
			//swapping
		    char temp=s[left];
		    s[left]=s[right];
		    s[right]=temp;
		    
		    //incrementing left
		    left++;
		    //decrementing right
		    right--;
		}
		
		System.out.print(s);

	}

}
