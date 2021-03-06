package com.capgemini.BowlingGameResultCalculator;

/**
 * @author HSIENKIE
 *
 */
public class GameStrategy {

	private CalculatePoints calculatePoints;
	private GameConfiguration gameConfiguration;

	public GameStrategy(GameConfiguration gameConfiguration) {
		calculatePoints = new CalculatePointsNotLastRound();
		this.gameConfiguration = new GameConfiguration();
	}

	public int getCurrentResult(GameHistory gameHistory) {
		if(gameHistory.getNumberOfCurrentRound() == gameConfiguration.NUMBER_OF_ROUNDS){
			calculatePoints = new CalculatePointsLastRound();
		}
		return calculatePoints.calculate(gameHistory);
	}

}
