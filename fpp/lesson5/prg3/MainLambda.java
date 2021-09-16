package lesson5.prg3;

import java.util.Arrays;

/**
 * @author Erika
 *
 */
public class MainLambda {

	public static boolean ascending;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] testStrings = { "andy", "mike", "joe", "allen", "stephan" };

		// lambda expression
		StringSort ss = new StringSort(
				(o1, o2) -> ascending ? (o2.length() - o1.length()) : (o1.length() - o2.length()));
		System.out.println(Arrays.toString(ss.stringSort(testStrings)));

	}

}
