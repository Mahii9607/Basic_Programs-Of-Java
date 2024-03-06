package com.Basics;

public class StarPattern {

	public static void main(String[] args) {
		
		for(int i = 1 ; i < 10; i++) {
			
			for(int j = 0 ; j < i ; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		for(int k = 0 ; k<10 ; k++) {
			
			for(int l = 0 ; l<k ; l++) {
			System.out.print("*");
			}
			System.out.println();
			
		}
		
		
	}
}
