package com.mayQuestion;
//input= 1 2 3    we have to find absoulte difference between diagonals
//4 5 6
//9 8 9
//left to right diagonal= 1+5+9=15
//right to left diagonal= 3+5+9=17
//output= |17-15|=2  
public class tcs1 {

	public static void main(String[] args) {
		int input[][]= {{1,2,3},
				{4,5,6},
				{9,8,9}};
		
		int sum_diag1=0,sum_diag2=0;
		
		for(int i=0;i<input.length;i++) 
		{
			for(int j=0;j<input.length;j++) 
			{
				if(i==j) 
				{
					sum_diag1=sum_diag1+input[i][j];
				}
				if((i+j)==(input.length-1))
				{
					sum_diag2=sum_diag2+input[i][j];
				}
			}
			
		}
			System.out.println(sum_diag2-sum_diag1);
	}

}
