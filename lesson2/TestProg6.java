package lesson2;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.junit.Test;

/**
 * @author Erika
 * 
 *         this class tests the Prog6 by sending array values to the
 *         Prog6.removeDups function
 *
 */
public class TestProg6 {

	@Test
	public void testRemoveDups() {

		String[] testData = { "horse", "dog", "cat", "horse", "dog" };
		// passing test data to function to be tested
		String[] result = Prog6.removeDups(testData);
		String[] expected = { "horse", "dog", "cat" };

		// visually testing results
		for (String s : result)
			System.out.println("actual Result: " + s);
		for (String s : expected)
			System.out.println("expected Result: " + s);

		// assertTrue(expected == result); //could not get result

		// comparing arrays
		assertTrue(Arrays.equals(expected, result));

	}

}
