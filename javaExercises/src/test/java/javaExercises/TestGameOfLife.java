/**
 * 
 */
package javaExercises;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.capgemini.gameOfLife.GameOfLife;

/**
 * @author HSIENKIE
 *
 */
public class TestGameOfLife {

	@BeforeClass
	public static void doBeforeClass() {

	}

	@Before
	public void doBefore() {

	}

	@Test
	public void shouldCreateObjectGameOfLife() {

		// given

		// when

		// then
		assertNotNull(new GameOfLife());
	}

/*	@Test
	public void shouldCreate() {

		// given
		int lengthField = 5; // czy tutaj mam miec Integer
		int wightField = 4;
		int areaField = lengthField * wightField;
		
		// when
		GameOfLife newGameOfLife = new GameOfLife(lengthField, wightField);

		// then
		assertEquals(areaField, newGameOfLife.getAreaField());
	}*/
}
