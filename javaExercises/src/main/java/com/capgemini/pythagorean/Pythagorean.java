package com.capgemini.pythagorean;

import com.capgemini.placeToSplit.PlaceToSplit;

/**
 * A Pythagorean triplet is a set of three natural numbers, a < b < c, for
 * which, a2 + b2 = c2 For example, 32 + 42 = 9 + 16 = 25 = 52. There exists
 * exactly one Pythagorean triplet for which a + b + c = 1000. Find the product
 * abc.
 */
public class Pythagorean {
	public static int solution() {
		int a = 0;
		int b = 0;
		int c = 0;

		do {
			a++;
			b = a;
			do {
				b++;
				c = 1000 - (a + b);
				if (c * c == (a * a + b * b)) {
					System.out.println(a);
					System.out.println(b);
					System.out.println(c);
					return a * b * c;
				}
			} while (c > b);
		} while (c > a);
		return -1;
	}
}
