package edu.wit.cs.comp1000;

import java.util.Scanner;

// TODO: document this class
public class PA1a {

	// TODO: document this function
	public static void main(String[] args) {
		// TODO: write your code here
		Scanner input = new Scanner(System.in); 
		
		int yards;
		System.out.printf("Enter number of yards: ");
		yards = input.nextInt();
		
		int feet;
		System.out.printf("Enter number of feet:");
		feet = input.nextInt();
		
		int inches;
		System.out.printf("Enter number of inches:");
		inches = input.nextInt();
		
		System.out.printf("Total number of inches: ");
		int ans;
		ans = feet*12+yards*36+inches;
		System.out.print(ans);
	}

}
