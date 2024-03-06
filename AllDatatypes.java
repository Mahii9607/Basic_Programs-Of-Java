package com.Basics;

import java.util.Scanner;

public class AllDatatypes {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter int value ");
		int a = sc.nextInt();
		System.out.println(a);
		
		
		System.out.println("Enter float value ");
		float b = sc.nextFloat();
		System.out.println(b);
		
		
		System.out.println("Enter String value ");
		String c = sc.next();
		System.out.println(c);
		
		
		System.out.println("Enter char value ");
		char d = sc.next().charAt(0);
		System.out.println(d);
	}
	
}
