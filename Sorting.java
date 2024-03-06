package com.Basics;

public class Sorting {

	public static void main(String[] args) {
		
		
		// Initializing an array of integers
		int a[] = { 33 , 11, 22 , 9 , 55 , 44};
		
		 // Outer loop to iterate over each element in the array
		for(int i = 0 ; i < a.length ; i++) {
			
			// Inner loop to compare and swap elements
			for(int j = i+1 ; j<a.length ; j++) {
				
				// Compare adjacent elements
				if(a[i] > a[j])
				{
					// Swap the elements if they are in the wrong order
					int t = a[i];
					 a[i] = a[j];
					 a[j] = t;
				}
			}
		}
		
		 // Printing the sorted array
		for(int i = 0 ; i < a.length ; i++)
		{
			System.out.println(a[i]);
		}
		
	}
}
