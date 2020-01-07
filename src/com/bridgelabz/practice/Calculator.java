package com.bridgelabz.practice;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class Calculator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
//		System.out.println("Enter how many numbers you want to add");
//		int count = scanner.nextInt();
//		
//		while(count < 1) {
//			System.out.println("Enter a positive whole number");
//			count = scanner.nextInt();
//		}
//		System.out.println("Entered count is "+count);
//
//		int[] arr = new int[count];
//		
//		for(int i=0; i<arr.length ; i++) {
//			System.out.println("Enter number "+(i+1));
//			arr[i] = scanner.nextInt();
//		}
//		
//		int sum = Utility.add(arr);		
//		System.out.println("Sum of "+count+" entered numbers is = "+sum);
		
//		long product = Utility.multiply(arr);		
//		System.out.println("Product of "+count+" entered numbers is = "+product);
		
//		System.out.println("enter 1st number for division");
//		int num1 = scanner.nextInt();
//		
//		System.out.println("enter 2nd number for division");
//		int num2 = scanner.nextInt();
//		
//		System.out.println("Division of entered numbers is "+Utility.divide(num1, num2));
		
		System.out.println("Enter name of user");
		String name = scanner.nextLine();
		System.out.println(Utility.greet(name));
		
		System.out.println("enter 1st number for mod");
		int num1 = scanner.nextInt();
		
		System.out.println("enter 2nd number for mod");
		int num2 = scanner.nextInt();
		
		System.out.println("Modulus of entered numbers is "+Utility.modulus(num1, num2));

		scanner.close();
	}
}
