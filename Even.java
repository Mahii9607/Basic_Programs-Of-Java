package com.Basics;

public class Even {

	
	public static void main(String[] args) {
		
		for (int k =1 ; k<=100;k++) {
			//Even logic 
			
			int n = k ;
			
			if ( n % 2 == 0)
				System.out.println(n + " is Even ");
			
			else
				System.out.println(n + " is Odd ");
			
		}
	}
}
