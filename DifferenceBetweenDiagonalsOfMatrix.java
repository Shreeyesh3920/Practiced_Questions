package com.matrixQuestion;
//input= 1 2 3    we have to find absoulte difference between diagonals
//		 4 5 6
//		 9 8 9
//left to right diagonal= 1+5+9=15
//right to left diagonal= 3+5+9=17
//output= |17-15|=2  
public class DifferenceBetweenDiagonalsOfMatrix {

	public static void main(String[] args) {
	
		int input[][]= {{1,2,3},
						{4,5,6},
						{9,8,9}}; 
		
		int result=findDifference(input);
		System.out.println("Difference="+result);
	}

	private static int findDifference(int[][] input) {
		
		int diagonal1=0,diagonal2=0;
		
		for(int i=0;i<input.length;i++) 
		{
			for(int j=0;j<input.length;j++) 
			{
				if(i==j)									//for primary diagonal 
				{
					diagonal1=diagonal1+input[i][j];//15
				}
				if((i+j) == (input.length - 1))            //for secondary diagonal
				{
					diagonal2=diagonal2+input[i][j];//17
				}
			}
		}
		
		return Math.abs(diagonal2-diagonal1);
	}

}
