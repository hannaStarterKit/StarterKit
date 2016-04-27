/**
 * 
 */
package com.capgemini.pokerHands;

/**
 * @author HSIENKIE
 *
 */
public class Player {

	/**
	 * 
	 */
	int victory;
	public Player() {
		victory = 0;
	}
	void win(){
		victory++;
	}
	public int getVictory() {
		return victory;
	}


}
