package com.Basics;

public class EvenIndexNo {

	public static void main(String[] args) {
		
		//even index even no 
		
		int a[] = {11 , 22 , 32 , 44 , 55};
		
		for(int i = 0 ; i < a.length ; i++) {
			
			if(a[i]%2 ==0 && i%2 ==0 )
				System.out.println(a[i]);	
		}
		
	}
}
