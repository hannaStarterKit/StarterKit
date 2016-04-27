/**
 * 
 */
package javaExercises;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.capgemini.BowlingGameResultCalculator.BowlingGameResultCalculatorImpl;
import com.capgemini.gameOfLife.GameOfLife;

/**
 * @author HSIENKIE
 *
 */
public class TestBowlingGame {

	@BeforeClass
	public static void doBeforeClass() {

	}

	@Before
	public void doBefore() {

	}

	@Test
	public void shouldReturnScore10WhenFirstRollKnockedDownAllPins() {

		// given
		BowlingGameResultCalculatorImpl bowlingGame = new BowlingGameResultCalculatorImpl();
		bowlingGame.roll(10);
		// when
		int expectedScore = 10;

		// then
		assertEquals(expectedScore, bowlingGame.score());
	}

	@Test
	public void shouldReturnSumScoreOfFirstRoundWhenFirstTwoRollsKnockedDownNotAllPins() {

		// given
		BowlingGameResultCalculatorImpl bowlingGame = new BowlingGameResultCalculatorImpl();
		int firstRollOfFirstFrame = 1;
		int secondRollOfFirstFrame = 2;
		int expectedScore = firstRollOfFirstFrame + secondRollOfFirstFrame;
		bowlingGame.roll(firstRollOfFirstFrame);
		bowlingGame.roll(secondRollOfFirstFrame);

		// when
		int achieveScore = bowlingGame.score();
		// then
		assertEquals(expectedScore, achieveScore);
	}
	
	@Test
	public void shouldReturnSumScoreOfFirstRoundAndNumberOffirstRollOfSecondRound() {
		
		// given
		BowlingGameResultCalculatorImpl bowlingGame = new BowlingGameResultCalculatorImpl();
		int firstRollOfFirstFrame = 1;
		int secondRollOfFirstFrame = 2;
		int firstRollOfSecondFrame = 2;
		int expectedScore = firstRollOfFirstFrame + secondRollOfFirstFrame + firstRollOfSecondFrame;
		bowlingGame.roll(firstRollOfFirstFrame);
		bowlingGame.roll(secondRollOfFirstFrame);
		bowlingGame.roll(firstRollOfSecondFrame);
		
		// when
		int achieveScore = bowlingGame.score();
		// then
		assertEquals(expectedScore, achieveScore);
	}
	@Test
	public void shouldReturnSumOfFirstFullRollsOfTwoRounds() {
		
		// given
		BowlingGameResultCalculatorImpl bowlingGame = new BowlingGameResultCalculatorImpl();
		int firstRollOfFirstFrame = 10;
		int firstRollOfSecondFrame = 10;
		int expectedScore = firstRollOfFirstFrame + firstRollOfSecondFrame;
		bowlingGame.roll(firstRollOfFirstFrame);
		bowlingGame.roll(firstRollOfSecondFrame);
		
		// when
		int achieveScore = bowlingGame.score();
		// then
		assertEquals(expectedScore, achieveScore);
	}
	@Test
	public void shouldReturnSumOfFirstFullRollOfFirstRollAndDoubleSumOfSecondRound() {
		
		// given
		BowlingGameResultCalculatorImpl bowlingGame = new BowlingGameResultCalculatorImpl();
		int firstRollOfFirstFrame = 10;
		int firstRollOfSecondFrame = 2;
		int secondRollOfSecondFrame = 7;
		int expectedScore = firstRollOfFirstFrame + 2*firstRollOfSecondFrame + 2*secondRollOfSecondFrame;
		bowlingGame.roll(firstRollOfFirstFrame);
		bowlingGame.roll(firstRollOfSecondFrame);
		bowlingGame.roll(secondRollOfSecondFrame);
		
		// when
		int achieveScore = bowlingGame.score();
		// then
		assertEquals(expectedScore, achieveScore);
	}
	@Test
	public void shouldReturnSum() {
		
		// given
		BowlingGameResultCalculatorImpl bowlingGame = new BowlingGameResultCalculatorImpl();
		int expectedScore = 130;
		bowlingGame.roll(10);
		bowlingGame.roll(9);
		bowlingGame.roll(1);
		bowlingGame.roll(5);
		bowlingGame.roll(5);
		bowlingGame.roll(7);
		bowlingGame.roll(2);
		bowlingGame.roll(10);
		bowlingGame.roll(10);
		bowlingGame.roll(10);
	/*	bowlingGame.roll(9);
		bowlingGame.roll(0);
		bowlingGame.roll(8);
		bowlingGame.roll(2);
		bowlingGame.roll(9);
		bowlingGame.roll(1);*/

		
		// when
		int achieveScore = bowlingGame.score();
		// then
		assertEquals(expectedScore, achieveScore);
	}

}
