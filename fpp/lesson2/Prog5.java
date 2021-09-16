package lesson2;

import java.util.Scanner;

/**
 * @author Erika
 * 
 *         This class takes input from the user and reverses the entered value
 */
public class Prog5 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in); // get input from the user
		System.out.println("Enter a string:"); // prompts user to input a value
		String inputData = scan.nextLine(); // store the inserted value into a variable
		scan.close(); // close the scanner
		String reverse = ""; // a variable to store the reversed data

		/*
		 * starting the loop from last index data and get the character in that position
		 * and store in the variable reverse
		 */
		for (int i = inputData.length() - 1; i >= 0; i--) {
			reverse += inputData.charAt(i);
		}
		System.out.println("Reverse of " + inputData + " is: " + reverse); // print the reversed value

	}

}
