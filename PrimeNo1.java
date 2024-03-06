package com.Basics;

public class PrimeNo1 {

	public static void main(String[] args) {
		
		int  n = 0;
		int cnt = 0;
		
		 
		for (int i = 2; i < n ; i++) {
			 
			 if (n % i == 0) {
				 cnt++; // 0 --> 1
				 break;
			 }
		 }
		 
		 if (cnt == 0)
			 System.out.println(n + " is prime");
		 
		 else
			 
			 System.out.println(n + " is NOT Prime");
			 
	}
	
}
