package com.lams1989.appleorange;

public class App {

	public static void main(String[] args) {
		int[] apples = { -2, 2, 1 };
		int[] oranges = { 5, -6 };

		int[] result = CountApplesAndOranges.count(7, 11, 5, 15, apples, oranges);

		System.out.println("" + result[0]);
		System.out.println("" + result[1]);
		
	}
}
