package com.assignment;

import java.util.Scanner;

public class Gayathri {
	public static void main(String[] args) {
		//input - process - output
		//byte -128 to 127 
		//fields - variable
		//methods - functions
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first Number:");
		int firstNumber = sc.nextInt();
		System.out.println("Enter Second Number:");
		int secondNumber = sc.nextInt();
		int output = firstNumber + secondNumber;
		System.out.println("Addition of two values..: "+ output);
		sc.close();		
	}
}
