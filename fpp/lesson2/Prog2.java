package lesson2;

/**
 * @author Erika
 * 
 *         This class gets Random numbers between two integers and prints
 *         PI^x;y^PI
 */
public class Prog2 {

	public static void main(String[] args) {
		int x = RandomNumbers.getRandomInt(1, 9); // generate random number between 1-9
		System.out.println(Math.pow((Math.PI), x)); // Pi to the power x

		int y = RandomNumbers.getRandomInt(3, 14); // generate random number between 3-14
		System.out.println(Math.pow((y), Math.PI)); // y to the power Pi
	}

}
