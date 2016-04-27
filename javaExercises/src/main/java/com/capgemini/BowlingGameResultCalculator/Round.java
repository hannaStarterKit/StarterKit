/**
 * 
 */
package com.capgemini.BowlingGameResultCalculator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author HSIENKIE
 *
 */
public class Round {

	/**
	 * 
	 */
	private boolean status;
	private boolean usedMaxRolls;
	private List<Roll> listOfRolls;

	private GameConfiguration gameConfiguration;

	public Round(GameConfiguration gameConfiguration, int numberOfPins) {
		status = false;
		usedMaxRolls = false;
		this.gameConfiguration = gameConfiguration;
		listOfRolls = new ArrayList<Roll>(gameConfiguration.MAX_NUMBER_OF_ROLLS_IN_ROUND);
		this.setKnockedPins(numberOfPins);
	}
	
	public int getNumberOfKnockedPins(int index){
		return listOfRolls.get(index).getKnockedPins();
	}

	public boolean amIFinished() {
		return status;
	}

	public int sumOfKnockedPins() {
		int sum = 0;
		for (Roll roll : listOfRolls) {
			sum += roll.getKnockedPins();
		}
		return sum;
	}

	public boolean getUsedMaxRolls() {
		return usedMaxRolls;
	}

	public void setKnockedPins(int numberOfPins) {
		listOfRolls.add(new Roll(numberOfPins));
		setStatusOfRound();
		setUsedMaxRolls();
	}

	public void setUsedMaxRolls() {
		usedMaxRolls = (listOfRolls.size() == gameConfiguration.MAX_NUMBER_OF_ROLLS_IN_ROUND);
	}

	private void setStatusOfRound() {
		status = (listOfRolls.size() == gameConfiguration.MAX_NUMBER_OF_ROLLS_IN_ROUND
				|| sumOfKnockedPins() == gameConfiguration.MAX_KNOCKED_PINS_IN_SINGLE_ROLL);
	}

}
