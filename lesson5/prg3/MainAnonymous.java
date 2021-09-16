package lesson5.prg3;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author Erika
 *
 */
public class MainAnonymous {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] testStrings = { "andy", "mike", "joe", "allen", "stephan" };

		// anonymous class

		StringSort ss = new StringSort(new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				if (o1.length() < o2.length())
					return -1;
				else if (o1.length() > o2.length())
					return 1;
				else
					return 0;
			}

		});

		System.out.println(Arrays.toString(ss.stringSort(testStrings)));

	}

}
