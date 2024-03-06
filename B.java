package com.Basics;

public class B {

	public static void main(String[] args) {
		
		int n = 12;
		 int sum = 0;
		  
		 while (   n>0   ) {
			 
			 int r = n % 10;
			 
			  n = n/10;
			  
			  sum = sum + r;
		 }
		 
		 System.out.println(sum);
	}
	
}
