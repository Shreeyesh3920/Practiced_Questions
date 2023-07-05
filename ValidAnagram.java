package com.StringQuestions;

import java.util.HashMap;

public class ValidAnagram {

	public static void main(String[] args) {
		String s="aacc";
		String t="cacc";
		
		
		HashMap<Character,Integer> map1=new HashMap<>();
		
		 for(int i=0;i<s.length();i++)
		 {
			 char ch=s.charAt(i);
			 if(!map1.containsKey(ch)) 
			 {
				 map1.put(ch,1);
			 }
			 else 
			 {
				 map1.put(ch,map1.get(ch)+1);
			 }
		 }
        
        
        
        HashMap<Character,Integer> map2=new HashMap<>();
		
		 for(int j=0;j<t.length();j++)
		 {
			 char c=t.charAt(j);
			 if(!map2.containsKey(c)) 
			 {
				 map2.put(c,1);
			 }
			 else 
			 {
				 map2.put(c,map2.get(c)+1);
			 }
		 }
     
        
	        System.out.println(map1);
	        System.out.println(map2);
		 
		 	if(s.length()!=t.length())
		 	{
        	System.out.println("false");        
        	}
		 	else if(map1.equals(map2))
            {
            System.out.println("true");            
            }
            else
            {
            System.out.println("false");
            }

	}

}
