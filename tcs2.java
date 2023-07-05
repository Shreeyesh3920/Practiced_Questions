package com.mayQuestion;
public class tcs2 {

	public static void main(String args[]) 
	{
		int T=5;// organized time i.e no. of array
		int E[]= {7,0,5,1,3}; //no. of people entering in party at every hour as we have 5 hours so at 1st hour 7 people entered
		int L[]= {1,2,1,3,4}; // no. of people leave the party at every hour
		// and we have to find maximum no. of people at party at given instance . So in this there are 8
		
		//7-1=6 then 6-2=4, 4+5=9 and 9-1=8 and so on
		
		int S[]=new int[T];
		int max_people=0;
		
		for(int i=0;i<E.length-1;i++) 
		{
			
				S[i]=E[i]-L[i];
				if(S[i]>max_people) 
				{
					max_people=S[i];
				}
				E[i+1]+=S[i];
				
		}
			System.out.println("Max people= "+max_people);
			
	}
	
}
//OR
/*	int T = 5; // organized time i.e number of hours
		int E[] = { 7, 0, 5, 1, 3 }; // number of people entering the party at every hour
		int L[] = { 1, 2, 1, 3, 4 }; // number of people leaving the party at every hour

		int S[] = new int[T];
		int maxPeople = 0;

		for (int i = 0; i < T - 1; i++) {
			S[i] = E[i] - L[i];
			if (i > 0) {
				S[i] += S[i - 1];
			}
			if (S[i] > maxPeople) {
				maxPeople = S[i];
			}
		}

		System.out.println("Maximum number of people at the party: " + maxPeople);*/
