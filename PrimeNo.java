package com.Basics;

public class PrimeNo {


	public static void main(String[] args) {

		for (int  k = 1 ; k <= 100; k++) {

			//1-100 No..

			//prime code

			int n = k ; //k-1,2,3,4....99.100

			boolean check = true;

			for (int i=2 ; i <= n/2; i++) {

				if(n % i == 0) {
					check = false;
					break;

				}
			}

			if(check)
				System.out.println(n + " is Prime");

			else
				System.out.println(n + " is Non Prime");

		}

	}
}
