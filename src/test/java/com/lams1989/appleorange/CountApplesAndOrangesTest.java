package com.lams1989.appleorange;

import junit.framework.TestCase;

public class CountApplesAndOrangesTest extends TestCase{

	public void testCount() {
		int[] apples = { -2, 4 };
		int[] oranges = { -2, -1, -3 };

		int[] result = CountApplesAndOranges.count(7, 10, 4, 12, apples, oranges);
		
		assertEquals(1, result[0]);
		assertEquals(2, result[1]);
	}
	
	public void testCount1() {
		int[] apples = { 4, 5 };
		int[] oranges = { -2, -1, -3 };

		int[] result = CountApplesAndOranges.count(7, 10, 4, 12, apples, oranges);
		
		assertEquals(1, result[0]);
		assertEquals(2, result[1]);
	}
}

