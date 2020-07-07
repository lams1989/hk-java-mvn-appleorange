package com.lams1989.appleorange;

public class CountApplesAndOranges {

	public static int[] count(int s, int t, int a, int b, int[] apples, int[] oranges) {
		int[] result = new int[2];
		int count1 = 0;
		int count2 = 0;
		for (int i = 0; i < apples.length; i++) {
			if (apples[i] + a >= s && apples[i] + a <= t) {
				count1++;
			}
		}
		for (int j = 0; j < oranges.length; j++) {
			if (oranges[j] + b >= s && oranges[j] + b <= t) {

				count2++;
			}
		}
		result[0] = count1;
		result[1] = count2;

		return result;
	}
}
