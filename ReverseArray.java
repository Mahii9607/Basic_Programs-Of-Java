package com.Basics;

public class ReverseArray {
	
	public static void main(String[] args) {
		
		// Create an array with values
		int arr[] = {11,22,33,44,55}; //size = 5
		
		// Calculate the length of the array
		int len = arr.length - 1;
		
		// Loop through the first half of the array
		for(int i = 0; i < arr.length/2; i++) {
			// Swap elements at index i with their corresponding elements from the end of the array
			int t = arr[i];
			arr[i] = arr[len];
			arr[len] = t;
			// Move towards the center of the array from both ends
			len--;
		}
		
		// Print the reversed array
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + " ");
		}
	}
}
