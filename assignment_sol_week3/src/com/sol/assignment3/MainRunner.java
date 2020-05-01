package com.sol.assignment3;

import java.util.Scanner;

public class MainRunner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//calling PrimeCalculation class method for finding first N(here, 26) prime numbers
		int mapping[] = PrimeCalculation.firstNPrime(26);
		System.out.println("Enter a name:");
		StringBuffer sb = new StringBuffer();
		sb.append(sc.nextLine());
		for (int i=0; i<sb.length(); i++) {
			int index = (int)sb.charAt(i) - 'A';
			System.out.println(Integer.toHexString(mapping[index]).toUpperCase());
		}
	}
}
