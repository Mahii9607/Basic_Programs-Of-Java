package com.Basics;

public class Prime {

	public static void main(String[] args) {
		
		int num = 10;
		int a = 0 , b = 1 , c;
		
		System.out.print(a + " " +b + " ");
		
		//2 printed
		
		for(int i = 2; i< num; i++) {
			//10 times
			
			c = a + b;
			
			System.out.print(c + " ");
			
			a= b;
			b = c;
			
		}
	}
}
