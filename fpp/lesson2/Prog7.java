package lesson2;

/**
 * @author erika
 *
 */
public class Prog7 {

	/**
	 * @param args This class gets random number between 1-..99 from
	 *             RandomNumbers.java class and formats the digits and strings into this format
	 *        23           54           19           42
 
            + 42         +  7         + 16         + 55 
           _____        _____        _____        _____ 


              57           94           63           96
 
            + 59         + 81         + 76         + 49 
           _____        _____        _____        _____

	 */
	public static void main(String[] args) {
		String randomize = "";

		// %16d gives 16 character space to the digit; %13s gives 13 character space to String and %n adds new line
		randomize = String.format("%16d %12d %12d %12d%n %n", RandomNumbers.getRandomInt(1, 99),
				RandomNumbers.getRandomInt(1, 99), RandomNumbers.getRandomInt(1, 99),
				RandomNumbers.getRandomInt(1, 99));
		randomize += String.format("%13s %2d %9s %2d %9s %2d %9s %2d %n", "+", RandomNumbers.getRandomInt(1, 99), "+",
				RandomNumbers.getRandomInt(1, 99), "+", RandomNumbers.getRandomInt(1, 99), "+",
				RandomNumbers.getRandomInt(1, 99));
		randomize += String.format("%16s %12s %12s %12s %n%n%n", "_____", "_____", "_____", "_____");

		randomize += String.format("%16d %12d %12d %12d%n %n", RandomNumbers.getRandomInt(1, 99),
				RandomNumbers.getRandomInt(1, 99), RandomNumbers.getRandomInt(1, 99),
				RandomNumbers.getRandomInt(1, 99));
		randomize += String.format("%13s %2d %9s %2d %9s %2d %9s %2d %n", "+", RandomNumbers.getRandomInt(1, 99), "+",
				RandomNumbers.getRandomInt(1, 99), "+", RandomNumbers.getRandomInt(1, 99), "+",
				RandomNumbers.getRandomInt(1, 99));
		randomize += String.format("%16s %12s %12s %12s", "_____", "_____", "_____", "_____");

		System.out.println(randomize);
	}

}
