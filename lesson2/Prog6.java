package lesson2;

import java.util.Arrays;

/**
 * @author Erika
 * 
 *         The method of this class removes the duplicate data in an String
 *         array
 */
public class Prog6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String[] myString = new String[] { "a", "b", "a", "c", "b" };
		String[] unique = removeDups(myString);
		System.out.println("after removing duplicates : " + Arrays.toString(unique));

	}

	public static String[] removeDups(String[] list) {
		if (list.length == 0 || list.length == 1)
			return list;

		int countDup = 0; // counter variable to check the duplicate values

		// calculate numbers of duplicate elem present
		for (int i = 0; i < list.length - 1; i++) {
			for (int j = i + 1; j < list.length; j++) {
				if (list[i].equals(list[j])) {
					countDup++;
				}
			}
		}
		// create new array and assign array size by reducing the number of duplicate
		// items
		String[] tempUnique = new String[list.length - countDup];
		int counter = 0; // new index for tempUnique array
		for (String elem : list) {
			if (!containElem(tempUnique, elem)) { // check if an element is already exist or not
				tempUnique[counter++] = elem; // if not present, add the element to array
			}
		}
		return tempUnique; // return new array list
	}

	// method to check if an element pre-exist in an array
	public static boolean containElem(String[] arr, String elem) {
		for (String e : arr) {
			if (elem.equals(e))
				return true;

		}
		return false;
	}
}
