package lesson2;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * @author Erika
 * 
 *         Test the minimum value in a list by passing an int array to
 *         Prog2_8.in()
 *
 */
public class Prog2_8Test {

	@Test
	public void testArraysOfInts() {
		int[] list = { 2, -21, 3, 45, 0, 12, 18, 6, 3, 1, 0, -22 };
		int result = Prog2_8.min(list);
		int expected = -22;
		System.out.println("Actual Result: " + result);
		System.out.println("Expected Result: " + expected);
		assertTrue(expected == result);
	}

}
