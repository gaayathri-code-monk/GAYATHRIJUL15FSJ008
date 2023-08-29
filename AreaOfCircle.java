package com.assignment;

import java.util.Scanner;

public class AreaOfCircle {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the radius:");
		double radius=scanner.nextDouble();
		double area=Math.PI*(radius*radius);
		double circumference=Math.PI*2*radius;
		System.out.println("the circumference  of circle is:"+circumference);
		scanner.close();
	}

}
