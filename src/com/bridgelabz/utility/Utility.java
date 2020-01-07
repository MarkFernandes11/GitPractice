package com.bridgelabz.utility;

public class Utility {

	public static int add(int... numbers) {
		int sum = 0;

		for (int i = 0; i < numbers.length; i++) {
			sum = sum + numbers[i];
		}
		return sum;
	}
}
