package com.ArraysQuestions.arrayQuestionAnswers;

public class HARD_Median_of_Two_Sorted_Arrays {

	public static void main(String[] args) {
		int n1[]={1,2};
		int n2[]={3,4};
		
		int m=n1.length;
		int n=n2.length;
		
		int n3[]=new int[m+n];
		
		int i=0,j=0,k=0;
		
		while(i<m&&j<n)
		{
		    if(n1[i]<n2[j])
		    {
		        n3[k]=n1[i];
		        k++;
		        i++;
		    }
		    else if(n1[i]>n2[j])
		    {
		        n3[k]=n2[j];
		        k++;
		        j++;
		    }
		}
		
		while(i<m)
		{
		    n3[k]=n1[i];
		    k++;
		    i++;
		}
		
		while(j<n)
		{
		    n3[k]=n2[j];
		    k++;
		    j++;
		}
		
		//n3=[1,2,3]
		int z=n3.length;
		float median=0;
		if(z%2!=0)
		{
		    median=(z+1)/2;
		}
		else
		{
		    median=(n3[z/2]+n3[(z/2)-1])/2.0f;
		}
		
		System.out.println("median= "+median);
	}

}
