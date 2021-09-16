package lesson9.prg2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Stack;

import lesson9.prg1.StackException;

public class SymbolBalancer {

	String ODD_DELIMITER = "" + (char) 0;
	String filename;
	String text;
	char[] left;
	char[] right;
	Stack<Character> stack;

	public SymbolBalancer(String filename) {
		stack = new Stack<Character>();
		this.filename = filename;
		readFile();
	}

	public void setText(String text) {
		this.text = text;
	}

	boolean symbolsBalanced(String delimiters) {

		// the open bracket symbol gets set in the variable Left, and closed bracket in
		// variable right
		left = new char[delimiters.length() / 2];
		right = new char[delimiters.length() / 2];

		int leftIndex = 0;
		int rightIndex = 0;

		for (int i = 0; i < delimiters.length(); i++) {

			// open brackets are indicated by 0
			if (i % 2 == 0)
				left[leftIndex++] = delimiters.charAt(i);
			else
				right[rightIndex] = delimiters.charAt(i);
		}
		for (int i = 0; i < text.length(); i++) {

			// check open bracket
			for (char c : left) {
				if (c == text.charAt(i))
					stack.push(text.charAt(i));
			}

			// check closed bracket
			for (char c : right) {
				if (c == text.charAt(i)) {
					if (stack.empty())
						return false;

					// checking pair of the bracket, whether open bracket matches to closed bracket
					for (int j = 0; j < right.length; j++) {

						if (right[j] == text.charAt(i)) {

							if (left[j] == right[j])
								return true;
						}
					}
					return false;
				}
			}
		}

		if (stack.empty())
			return false;

		return true;
	}

	public static void main(String[] args) throws StackException {
		SymbolBalancer sb = new SymbolBalancer("lesson9\\prg2\\Employee.java");
		System.out.println(sb.symbolsBalanced("[]{}<>()"));
	}

	void readFile() {
		String prefix = System.getProperty("user.dir") + "\\src\\";
		try {
			Scanner sc = new Scanner(new File(prefix + filename));
			sc.useDelimiter(ODD_DELIMITER);
			text = sc.next();
			sc.close();
		} catch (FileNotFoundException ex) {
			System.err.println("File Not Found Exception " + ex.getMessage());
		}
	}

}
