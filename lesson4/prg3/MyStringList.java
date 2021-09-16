package lesson4.prg3;

public class MyStringList {

	// Holds the size
	private int size;
	private final static int INITIAL_SIZE = 3;

	// This is a string array
	private String[] strArray;

	// constructor
	public MyStringList() {

		this.strArray = new String[INITIAL_SIZE];
		this.size = 0; // controls this
	}

	/*
	 * Method to add strings to the string array
	 * 
	 */
	public void add(String s) {

		// s should not be null
		if (s != null) {

			// Check if the array is already full
			if (size >= strArray.length)
				this.resize();

			// Add the given string at the end
			strArray[size++] = s;
		}

	}

	/*
	 * Retrieves the string at the ith index
	 *
	 */
	public String get(int i) {

		// Index i is positive and insider array length
		if (i < strArray.length && i > 0)
			return strArray[i];

		// Otherwise , return some message
		return "The index is not legal index for the given array";
	}

	/**
	 * This method looks for a given string in an array
	 * 
	 * @param s : a string to look in the array
	 * @retrun boolean : true -> if the string is in the array false -> if the
	 *         string is not in the array
	 */
	public boolean find(String s) {

		for (String str : strArray) {
			if (str == s)
				return true;
		}

		// will not arrive here if the string is found in the array
		return false;
	}

	/**
	 * This removes a given string for an array of strings
	 * 
	 * @param: s : a string to be removed
	 * @return boolean : True -> if found and removed False-> if not found , hence
	 *         not removed
	 */
	public boolean remove(String s) {

		boolean removedStatus = false;

		for (int i = 0; i < size; i++) {

			// check if the given string exists in the array
			if (strArray[i].equals(s)) {

				// Shrinks the array after removing s
				removeElementAndShrinkArray(i, strArray);

				// set removed status true;
				removedStatus = true;

			}
		}

		return removedStatus;
	}

	// Helper method to remove a given element and shrink the array
	private void removeElementAndShrinkArray(int start, String[] str) {

		// shift each element index to left by 1
		for (int j = start; j < size - 1; j++) {
			strArray[j] = strArray[j + 1];
		}

		strArray[size] = null;
		size -= 1;
	}

	/**
	 * returns the underlying array in a given format
	 * 
	 * @return String : combination of the array elements in a given format
	 * 
	 */
	public String toString() {

		StringBuilder sb = new StringBuilder();

		// append the first square bracket
		sb.append("[");
		for (int i = 0; i < size; i++) {

			sb.append(strArray[i]);

			// Don't put comma after the last element
			if (i != size - 1)
				sb.append(", ");
		}

		return sb.append("]").toString();
	}

	/*
	 * Gets the next open position in the array
	 * 
	 */
	public int size() {
		return this.size;
	}

	/*
	 * the following method resizes the array
	 * 
	 * Note : Under the hood , Its creating another array with size equal with
	 * double.
	 * 
	 */
	private void resize() {

		String[] newArray = new String[size * 2];
		System.arraycopy(strArray, 0, newArray, 0, strArray.length);
		strArray = newArray;

	}

	/**
	 * This method insert a string at position pos Note : note asked in the
	 * assignment but impelemented that for my self
	 * 
	 * @param s
	 * @param pos
	 */
	public void insert(String s, int pos) {

		// check if position Inside array and
		// we have space to add more element
		if ((pos >= 0 && pos < strArray.length)) {

			// if size ,resize that
			if (size >= strArray.length)
				this.resize();

			if (size == pos) {
				strArray[size + 1] = s;
			} else {
				for (int i = size + 1; i > pos; i--) {
					strArray[i] = strArray[i - 1];
				}

				// Insert at pos
				strArray[pos] = s;
			}

			size += 1;

		} else {
			System.out.println("The inserted index is out of the array indexes");
		}

	}

	public String[] getStrArray() {
		return strArray;
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

		// This is additional code to test insertion at specific position
		// Its optional but I have done it
		l.insert("Aregawi", 2);
		l.insert("Yonas", 0);
		System.out.println("The list of size " + l.size() + " is " + l);

	}
}
