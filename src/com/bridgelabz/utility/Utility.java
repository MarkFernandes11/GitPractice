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
	
	public static double divide(int number1, int number2) {
		double value = 0;

		try {
			value = number1 / (number2*1.0);
			return value;
		} catch (Exception e) {
			System.out.println("Use a number other than 0 in the denominator");
		}
		throw new ArithmeticException("Use a number other than 0 in the denominator");
	}
	
	public static String greet(String name) {
		return "Welcome back "+name;
	}
}
