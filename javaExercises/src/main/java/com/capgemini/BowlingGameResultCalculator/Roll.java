/**
 * 
 */
package com.capgemini.BowlingGameResultCalculator;

/**
 * @author HSIENKIE
 *
 */
public class Roll {

	/**
	 * 
	 */
	private int knockedPins; // wyjatek dla >10 i mniejszego od 0

	public Roll(int numberOfPins) {
		setKnockedPins(numberOfPins);
	}

/*	public void setWhichRoll(int whichRoll) {
		this.whichRoll = whichRoll;
	}*/

	public Integer getKnockedPins() {
		return knockedPins;
	}

	public void setKnockedPins(Integer knockedPins) {
		this.knockedPins = knockedPins;
	}


}
