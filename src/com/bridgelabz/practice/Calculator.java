package com.bridgelabz.practice;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class Calculator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter how many numbers you want to add");
		int count = scanner.nextInt();
		
		while(count < 1) {
			System.out.println("Enter a positive number");
			count = scanner.nextInt();
		}
		System.out.println("Entered count is "+count);

		int[] arr = new int[count];
		
		for(int i=0; i<arr.length ; i++) {
			System.out.println("Enter number "+(i+1));
			arr[i] = scanner.nextInt();
		}
		
		int sum = Utility.add(arr);
		
		System.out.println("Sum of "+count+" entered numbers is = "+sum);
		scanner.close();
	}
}
