package com.mayQuestion;

import java.util.HashSet;
import java.util.Set;

/*Given a string S of length N, Return the count of all the possible Unique Sub-Sequences of Length N-2, which can be derive from given string (each Sub-Sequences should have length = N-2).
String contains only number from 0 to 9.
As the result can be large return ans module (10^9) + 7.

sample test 1 -
input string : "15025"
output : 10
Explaination : All Unique Sub-Sequencesof length (5-2) 3 are - "025","525","505","502","125","105","155","125","150","102"*/
public class tcs4 {

	public static void main(String[] args) {
		String s="15025";
		int n = s.length();
		Set<String> set = new HashSet<>();

		// Generate all sub-sequences of length n-2
		for (int i = 0; i < n; i++) {
		  for (int j = i+1; j < n; j++) {
		    StringBuilder sb = new StringBuilder();
		    for (int k = 0; k < n; k++) {
		      if (k != i && k != j) {
		        sb.append(s.charAt(k));
		      }
		    }
		    set.add(sb.toString());
		  }
		}
		System.out.println(set.size());
	}

}
