/**
 * 
 */
package com.capgemini.BowlingGameResultCalculator;

import java.util.ArrayList;
import java.util.List;

import javax.swing.plaf.basic.DefaultMenuLayout;

/**
 * @author HSIENKIE
 *
 */
public class GameHistory {

	private List<Round> listOfRounds;
	private GameConfiguration gameConfiguration;

	/**
	 * 
	 */
	public GameHistory(GameConfiguration gameConfiguration) {

		this.gameConfiguration = gameConfiguration;
		// tutaj obojetnie czy bedzie this czy nie
		listOfRounds = new ArrayList<Round>(gameConfiguration.NUMBER_OF_ROUNDS);
	}

	public void saveRoll(int numberOfPins) {
		if (IsLastRoundFinished()) {
			listOfRounds.add(new Round(gameConfiguration, numberOfPins));
		} else {
			getLastRaund().setKnockedPins(numberOfPins);
		}

	}

	public int getResult() {
		int sum = 0;
		int index = 0;
		for (Round round : listOfRounds) {
			sum += round.sumOfKnockedPins() + getBonus(round, index);
			index += 1;
		}
		return sum;
	}

	private int getBonus(Round round, int index) {
		int bonus = 0;
		int ind = index + 1;
		int whichRollinRound = 0;
		int sumOfKnockedPins = round.sumOfKnockedPins();
		if (sumOfKnockedPins == gameConfiguration.MAX_KNOCKED_PINS_IN_SINGLE_ROLL) {
			bonus += listOfRounds.get(ind).getNumberOfKnockedPins(whichRollinRound);
			whichRollinRound += 1;
			if (!listOfRounds.get(ind).getUsedMaxRolls() && listOfRounds.get(ind).amIFinished()) {
				ind += 1; // dla 9 rundy i 10 przeskocza indeksy
				whichRollinRound -= 1;
			}
			if (!round.getUsedMaxRolls() && round.amIFinished()) {
				bonus += listOfRounds.get(ind).getNumberOfKnockedPins(whichRollinRound);
			}
		}
		return bonus;
	}

	public int getResult2() {
		int totalSum = 0;
		int bonus1 = 0, bonus2 = 0;
		int sumOfSingleRound = 0;
		for (int i = listOfRounds.size()-1; i >= 0; i--) {
			sumOfSingleRound = listOfRounds.get(i).sumOfKnockedPins();
			totalSum += sumOfSingleRound;
			if (sumOfSingleRound >= gameConfiguration.MAX_KNOCKED_PINS_IN_SINGLE_ROLL) {
				totalSum += bonus1;
			}
			bonus1 = listOfRounds.get(i).getNumberOfKnockedPins(0);
			if (!listOfRounds.get(i).getUsedMaxRolls() && listOfRounds.get(i).amIFinished()) {
				totalSum += bonus2;
				bonus2 = listOfRounds.get(i).getNumberOfKnockedPins(0);
			}
			if (listOfRounds.get(i).getUsedMaxRolls()){
				bonus2 = listOfRounds.get(i).getNumberOfKnockedPins(1);
			}
		}
		return totalSum;
	}

	private boolean IsLastRoundFinished() {
		int numberOfLastRound = listOfRounds.size();
		return (numberOfLastRound == 0 || listOfRounds.get(numberOfLastRound - 1).amIFinished());
	}

	private Round getLastRaund() {
		return listOfRounds.get(listOfRounds.size() - 1);
	}
}
