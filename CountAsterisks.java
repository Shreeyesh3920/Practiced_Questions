package com.StringQuestions;
/*Input: s = "l|*e*et|c**o|*de|"
Output: 2
Explanation: The considered characters are underlined: "l|*e*et|c**o|*de|".
The characters between the first and second '|' are excluded from the answer.
Also, the characters between the third and fourth '|' are excluded from the answer.
There are 2 asterisks considered. Therefore, we return 2.*/
public class CountAsterisks {

	public static void main(String[] args) {
		
		String s="l|*e*et|c**o|*de|";
		int count=0;
		int barcount=0;
    
         for(int i=0;i<s.length();i++)
         {
             char ch=s.charAt(i);
             if(ch=='|')
             {
                 barcount=barcount+1;
             }
             if(barcount==2 && ch=='*')
             {
                 count=count+1;
                 barcount=0;
             }
         }
         System.out.println(count);
	}

}


/*class Solution {
    public int countAsterisks(String s) {

         boolean insidePipe = false;
        int count = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '|'){
                insidePipe = !insidePipe;
            }
            if(!insidePipe && s.charAt(i) == '*'){
                count++;
            }
        }
        return count;
    }
}*/
