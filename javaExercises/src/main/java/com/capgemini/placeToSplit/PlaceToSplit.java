package com.capgemini.placeToSplit;

/**
 * Given a non-empty array, return true if there is a place to split the array
 * so that the sum of the numbers on one side is equal to the sum of the numbers
 * on the other side. Example: {{{ canBalance({1, 1, 1, 2, 1}) â†’ true
 * canBalance({2, 1, 1, 2, 1}) â†’ false canBalance({10, 10}) â†’ true }}}
 */
public final class PlaceToSplit { //final == podklasy nie mogą umożliwić jej zmienności.
	private PlaceToSplit() {
	}

	public static boolean canBalance(int[] nums) {
		int sumBack = 0, sumFront = 0;

		for(int j = 1 ; j< nums.length; j++) {
			sumBack += nums[j];
		}
		for(int i = 0; i < nums.length - 1; i++) {
			sumFront += nums[i];
			if(sumFront == sumBack) {
				return true;
			}
			sumBack -= nums[i+1];
		}
		
		return false;
	}
}
