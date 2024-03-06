package com.Basics;

public class Swap {

	
	public static void main(String[] args) {
		
		int a = 10 , b = 5;
		
		System.out.println("Before a: " + a + " b: " +b);
		
		a = a  + b ;
		
		b = a -  b;
		
		a = a - b ;
		
		
		
		System.out.println("After a: " + a + " b: " +b);
	}
}
