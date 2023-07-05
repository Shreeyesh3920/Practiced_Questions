package com.ArraysQuestions.stringQuestions;

public class Remove_Common_Characters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*string1=aacdb
		  string2=gafd
		  Output: cbgf*/
		String s1="aacdb";
		String s2="gafd";
		StringBuilder output=new StringBuilder();
	     for(int i=0;i<s1.length();i++)
	     {
	         char ch=s1.charAt(i);
	         if(s2.indexOf(ch)==-1)
	         {
	             output.append(ch);
	         }
	     }
	     for(int j=0;j<s2.length();j++)
	     {
	         char ch=s2.charAt(j);
	         if(s1.indexOf(ch)==-1)
	         {
	             output.append(ch);
	         }
	     }
	     
	     System.out.println(output);
	}

}
