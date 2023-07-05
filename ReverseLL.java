package com.LinkedList;
import java.util.*;
public class ReverseLL {

	public static void main(String[] args) {
	
		LinkedList<Integer> list=new LinkedList<Integer>();
		list.add(0);
		list.add(1);
		list.add(2);
		list.add(3);
		
		for(Integer i:list) 
		{
			System.out.print(i+" ");
		}
		System.out.println("\n");
		Collections.reverse(list);
		for(Integer i:list) 
		{
			System.out.print(i+" ");
		}
	}

}
