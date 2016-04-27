/**
 * 
 */
package com.capgemini.BowlingGameResultCalculator;


/**
 * @author HSIENKIE
 *
 */
public class BowlingGameResultCalculatorImpl implements BolwingGameResultCalculator {

	/**
	 * 
	 */
	//BowlingGameResultCalculatorImpprivate GameStrategy gameStrategy;
	private GameConfiguration gameConfiguration;
	private GameHistory gameHistory;

	public BowlingGameResultCalculatorImpl() {
		gameConfiguration = new GameConfiguration();
		//gameStrategy = new GameStrategy(gameConfiguration);
		gameHistory = new GameHistory(gameConfiguration);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.capgemini.BowlingGameResultCalculator.BolwingGameResultCalculator#
	 * roll(int)
	 */
	public void roll(int numberOfPins) {
		gameHistory.saveRoll(numberOfPins);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.capgemini.BowlingGameResultCalculator.BolwingGameResultCalculator#
	 * score()
	 */
	public int score() {
		return gameHistory.getResult2();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.capgemini.BowlingGameResultCalculator.BolwingGameResultCalculator#
	 * isFinshed()
	 */
	public boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}

}
