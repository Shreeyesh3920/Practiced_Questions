package com.mayQuestion;

import java.util.HashMap;
import java.util.Iterator;

public class tcs3 {
  public static void main(String args[]) 
  {
	  
	  char color[]= {'r','g','b','b','g','y','y'};
	  HashMap<Character,Integer> map=new HashMap<>();
	  for(int i=0;i<color.length;i++) 
	  {
		  char ch=color[i];
		  map.put(ch, map.getOrDefault(ch, 0)+1); // here we directly used gerOrDefault method instead of if and else shit
	  }
	  
	  for(Character c:color) 
	  {
		  if(map.get(c)%2!=0) 
		  {
			  System.out.println(c);
		  }
	  }
	 
	
  }
}

/*public class BalloonColor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine();
        String[] balloons = new String[N];

        for (int i = 0; i < N; i++) {
            balloons[i] = scanner.nextLine();
        }

        String oddColor = findOddColor(balloons);
        System.out.println(oddColor != null ? oddColor : "All are even");
    }

    private static String findOddColor(String[] balloons) {
        Map<String, Integer> colorCounts = new HashMap<>();

        for (String balloon : balloons) {
            colorCounts.put(balloon, colorCounts.getOrDefault(balloon, 0) + 1);
        }

        for (String color : balloons) {
            if (colorCounts.get(color) % 2 != 0) {
                return color;
            }
        }

        return null;
    }
}*/
