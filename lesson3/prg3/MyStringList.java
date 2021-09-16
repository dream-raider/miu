package lesson3.prg3;

/**
 * @author Erika
 *
 */

public class MyStringList {
	private final int INITIAL_LENGTH = 2;
	private String[] strArray;
	private int size;

	public MyStringList() {
		strArray = new String[INITIAL_LENGTH];
		size = 0;
	}

	public void add(String s) {
		if (size >= strArray.length)
			resize();
		strArray[size] = s;
		size++;

	}

	public String get(int i) {
		// implement

		return strArray[i];
	}

	public boolean find(String s) {
		// implemement
		for (String ss : strArray) {
			if (ss.equals(s))
				return true;

		}
		return false;
	}

	public void insert(String s, int pos) {
		// implement
		strArray[pos] = s;

	}

	public boolean remove(String s) {
		// implement
		String[] temp = new String[size + 1];
		int counter = 0;
		boolean elemFound = false;
		for (int i = 0; i < size; i++) {
			String elem = strArray[i];
			if (!elemFound && elem.equals(s)) {
				elemFound = true;
				size--;
				continue;
			} else {
				temp[counter++] = elem;
			}
		}
		System.arraycopy(temp, 0, strArray, 0, size);

		return elemFound;
	}

	private void resize() {
		System.out.println("Resizing...");
		String[] temp = new String[strArray.length * 2];

		System.arraycopy(strArray, 0, temp, 0, size);
		strArray = temp.clone();

	}

	public String toString() {
		// implement
		return "";
	}

	public int size() {
		return size;
	}

	public static void main(String[] args) {
		MyStringList l = new MyStringList();
		l.add("Bob");
		System.out.println("The list of size " + l.size() + " is " + l);
		l.add("Steve");
		System.out.println("The list of size " + l.size() + " is " + l);
		l.add("Susan");
		System.out.println("The list of size " + l.size() + " is " + l);
		l.add("Mark");
		System.out.println("The list of size " + l.size() + " is " + l);
		l.add("Dave");
		System.out.println("The list of size " + l.size() + " is " + l);
		l.remove("Mark");
		System.out.println("The list of size " + l.size() + " is " + l);
		l.remove("Bob");
		System.out.println("The list of size " + l.size() + " is " + l);
	}

}
