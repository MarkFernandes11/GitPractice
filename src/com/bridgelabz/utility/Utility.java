package com.bridgelabz.utility;

public class Utility {

	public static int add(int... numbers) {
		int sum = 0;

		for (int i = 0; i < numbers.length; i++) {
			sum = sum + numbers[i];
		}
		System.out.println("Received sum is "+sum);
		return sum;
	}
	
	public static long multiply(int... numbers) {
		long product = 1;

		for (int i = 0; i < numbers.length; i++) {
			product = product * numbers[i];
		}
		System.out.println("Received product is "+product);
		return product;
	}
}
