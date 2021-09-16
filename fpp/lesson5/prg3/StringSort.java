package lesson5.prg3;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author Erika
 *
 */
public class StringSort {
	Comparator<String> myComparator;

	/**
	 * @param myComparator
	 */
	StringSort(Comparator<String> myComparator) {
		this.myComparator = myComparator;

	}

	/**
	 * @param arr
	 * @return sorted arr
	 */
	public String[] stringSort(String[] arr) {
		Arrays.sort(arr, myComparator);
		return arr;

	}
}
