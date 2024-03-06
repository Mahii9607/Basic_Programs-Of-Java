package com.Basics;

public class C {

	public static void main(String[] args) {
		
		
		//reverse of number
		
		int n = 1235456257;
		int sum = 0;
		
		
		while (n>0) {
			
			int r = n%10;
			
			n = n/10;
			
			sum = sum + r;
			
			
		}
		
		System.out.println("sum is >>" + sum);
	}
	
}
