package lesson8.prg5;

public class MyTable {
	private Entry[] entries = new Entry[26];

	// returns the String that is matched with char c in the table
	public String get(char c) {
		// implement
		for (Entry entr : entries) {
			if (entr.c == c) {
				return entr.s;
			}
		}
		return "not found";
	}

	// adds to the table a pair (c, s) so that s can be looked up using c
	public void add(char c, String s) {
		// storing the ASCII value of the alphabet character
		int temp = (int) c;

		for (Entry entr : entries) {
			// comparing the newly adding character with the existing character
			if (entr.c == temp) {
				entr.c = c;
				entr.s = s;
				break;
			}
		}

	}

	// returns a String consisting of nicely formatted display
	// of the contents of the table
	public String toString() {
		String output = "";
		// implement
		for (Entry entr : entries) {
			output += entr.toString();
		}
		return output;
	}

	public static void main(String[] args) {
		MyTable t = new MyTable();

		// populate the char of all lower case alphabets starting from ASCII 97 to 122
		for (char i = 97, j = 0; i <= 122; i++, j++) {
			Entry e = t.new Entry(i, "");
			t.entries[j] = e;
		}

		t.add('a', "Andrew");
		t.add('b', "Billy");
		t.add('w', "Wharlie");
		String s = t.get('b');
		System.out.println("Value at position b: " + s);
		System.out.println("\n" + t.toString());
	}

	private class Entry {
		char c;
		String s;

		Entry(char c, String s) {
			// implement
			this.c = c;
			this.s = s;
		}

		// returns a String of the form "ch->str"
		public String toString() {
			String output = new String();

			if (!s.isBlank() || !s.isEmpty())
				output += String.format("%1$s -> %2$s\n", c, s);
			return output;
		}
	}

}
