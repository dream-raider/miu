package lesson2;

/**
 * @author Erika
 * 
 *         This class sums the 3 float values and cast into int
 */
public class Prog3 {

	public static void main(String[] args) {

		float x = 1.27F;
		float y = 3.881F;
		float z = 9.6F;

		float sum = x + y + z; // getting sum of the float variables

		System.out.println("The sum of floats is:" + (int) sum); // casting float to int
		System.out.println("Sum by using Math.round is:" + (int) Math.round(sum)); // rounding up to get the long value
																					// and cast to int
	}

}
