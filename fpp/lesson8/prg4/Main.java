package lesson8.prg4;

import java.util.ArrayList;
import java.util.List;

// This class converts the list elements of Address type into upper class and formats the string
public class Main {
	private List<Address> listOfAddresses;

	public static void main(String[] args) {
		Main m = new Main();
		m.loadData();
		m.printAsUpperCase();
	}

	private void loadData() {
		listOfAddresses = new ArrayList<>();
		listOfAddresses.add(new Address("Jim", "101 Adams", "Fairfield", "IA", "52556"));
		listOfAddresses.add(new Address("Tom", "30 W. Burlington", "Fairfield", "IA", "52556"));
		listOfAddresses.add(new Address("Hal", "14 E. Court", "Fairfield", "IA", "52556"));
		listOfAddresses.add(new Address("Sally", "410 W. Jefferson", "Fairfield", "IA", "52556"));
		listOfAddresses.add(new Address("MUM", "1000 N. 4th St", "Fairfield", "IA", "52556"));

	}

	public void printAsUpperCase() {
		for (Address l : listOfAddresses) {
			Address a = new Address(l.getName(), l.getStreet(), l.getCity(), l.getState(), l.getZip());
			formatFields(a.toUpper());
		}
	}

	private void formatFields(List<String> list) {

		System.out.println(String.format("%5$s\n%1$s\n%2$s, %3$s, %4$s\n", list.get(1), list.get(2), list.get(3),
				list.get(4), list.get(0)));
	}

}
