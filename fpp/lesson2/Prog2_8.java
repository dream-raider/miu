package lesson2;

/**
 * @author Erika
 * 
 *         This class checks the minimum value in an int array
 *
 */
public class Prog2_8 {

	/**
	 * @param arrayOfInts
	 * @return smallest - int value in the int array arrayOfInt
	 */
	static int min(int[] arrayOfInts) {

		int smallest = arrayOfInts[0]; // assign first value to compare

		for (int i = 0; i < arrayOfInts.length; i++) {
			if (arrayOfInts[i] < smallest) { // check if looped value is smaller than the first index value
				smallest = arrayOfInts[i]; // if value smaller than first index value then assign the new value
			}
		}
		return smallest;
	}

}
