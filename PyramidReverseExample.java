package com.assignment;

public class PyramidReverseExample {
	public static void main(String[] args) {
		int term=6;
		for(int i=1;i<=term;i++)
		{
			for(int j=term;j>=1;j--)
			{
				System.out.println("* ");
			}
			System.out.println();
		}
	}

}
