package com.Exps;
import java.util.Scanner;
public class BDA {
	public static void main(String[] args) {
		System.out.println("Enter Number of element: ");
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		String arr[]=new String[n];
		int temp;
		System.out.println("Enter elements:");
		for(int i=0;i<arr.length;i++) 
		{
			temp=scan.nextInt();
			temp=(((6*(temp))+1)%5);
			
			arr[i]=Integer.toBinaryString(temp);	
		}
		System.out.println("Binary:");
		for(String s:arr) 
		{
			System.out.println(s);
		}
		calculate(arr);
	}

	private static void calculate(String[] arr) {
		int count[]=new int[arr.length];
		for(int i=0;i<arr.length;i++) 
		{
			int zeros=0;
			for(int j=arr[i].length()-1;j>0;j--)
			{
		     char ch=arr[i].charAt(j);
		     if(ch=='1') 
		     {
		    	 break;
		     }
		     else 
		     {
		    	 zeros=zeros+1;
		     }
			}
			count[i]=zeros;
		}
		System.out.println("r(a):");
		for(int c:count) 
		{
			System.out.println(c);
		}
		int max = count[0];
        for (int i = 1; i < count.length; i++)
            if (count[i]>max)
                max = count[i];
        System.out.println("R=max(r(a))= "+max);
        int result=(int) Math.pow(2,max);
        System.out.println("So no. of distinct elements = N=2^R= "+result);
	}

}
