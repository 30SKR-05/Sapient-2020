package com.sol.assignment3;

public class PrimeCalculation {

	public static int[] firstNPrime(int size) {
		// calculate the first 26 prime numbers including 1
		int mapping[] = new int[size];
		int cnt = 2;
		mapping[0] = 1;
		mapping[1] = 2;
		int number = 3;
		while (cnt != size) {
			if (checkPrime(number)) {
				mapping[cnt] = number;
				cnt++;
			}
			number++;
		}
		
		return mapping;
	}

	private static boolean checkPrime(int number) {
		// TODO Auto-generated method stub
		if (number % 2 == 0)
			return false;
		for (int i=3; i<number; i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}
	
}
