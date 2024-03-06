package com.Basics;

public class A {
	
	public static void main(String[] args) {
		
		for(int i = 1 , k=0; i <= 5; i++) {
			
			if(i<=3)
				k++;
			
			else
				
				k--;
			
			for (int j =1 ; j <= k ; j++) {
				
				System.out.print("* ");
				
			}
			System.out.println();
		}
	}

}
