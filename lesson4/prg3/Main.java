package lesson4.prg3;

import java.util.Scanner;

import lesson4.prg3.employeeinfo.Employee;

/**
 * @author Erika
 *
 */
public class Main {
	Employee[] emps = null;

	public static void main(String[] args) {
		new Main();
	}

	Main() {

		emps = new Employee[3];
		emps[0] = new Employee("Jim Daley", 2000, 9, 4);
		emps[1] = new Employee("Bob Reuben", 1998, 1, 5);
		emps[2] = new Employee("Susan Randolph", 1997, 2, 13);

		emps[0].createNewChecking(10500);
		emps[0].createNewSavings(1000);
		emps[0].createNewRetirement(9300);

		emps[1].createNewChecking(34000);
		emps[1].createNewSavings(27000);

		emps[2].createNewChecking(10038);
		emps[2].createNewSavings(12600);
		emps[2].createNewRetirement(9000);

		Scanner sc = new Scanner(System.in);
		String answer = "";

		displayOptions();
		answer = sc.nextLine();

		if (answer.equalsIgnoreCase("a")) {
			getFormattedAccountInfo();

		} else if (answer.equalsIgnoreCase("b") || answer.equalsIgnoreCase("c")) {
			makeTransaction(sc, answer);
		}

		sc.close();
	}

	private void makeTransaction(Scanner sc, String type) {

		// Show employees list
		displayEmployees();

		// Select employee
		int empIndex = selectEmployee(sc);

		// choose account to withdraw from
		int accountIndex = selectAccount(sc, empIndex);

		// Enter amount
		double amount = enterAmount(sc);

		if (type.equalsIgnoreCase("B")) {

			// Now make a deposit
			emps[empIndex].deposit(accountIndex, amount);

			// Display message
			System.out.println("$" + amount + " has been deposited in the \n "
					+ emps[empIndex].getNamesOfAccounts()[accountIndex].toLowerCase() + " account of "
					+ emps[empIndex].getName() + "\n");
		} else {

			// Now make a deposit
			emps[empIndex].withdraw(accountIndex, amount);

			// Display message
			System.out.println("$" + amount + " has been withdrawn in the "
					+ emps[empIndex].getNamesOfAccounts()[accountIndex].toLowerCase() + " account of "
					+ emps[empIndex].getName() + "\n");
		}

	}

	private int selectEmployee(Scanner sc) {

		System.out.println("Select an employee: (type a number)");
		String empNum = sc.nextLine();
		int empIndex = Integer.parseInt(empNum);

		while (empIndex < 0 || empIndex >= emps.length) {
			System.out.println("Illegal Index , Please select in the range [0," + (emps.length - 1) + "] inclusive");
			empNum = sc.nextLine();
			empIndex = Integer.parseInt(empNum);
		}

		return empIndex;
	}

	private int selectAccount(Scanner sc, int empId) {

		displayAccountTypes(empId);
		System.out.println("Select an account");
		String acctType = sc.nextLine();
		int accountIndex = Integer.parseInt(acctType);

		while (accountIndex < 0 || accountIndex >= emps[empId].getNamesOfAccounts().length) {
			System.out.println("Illegal Index , Please select in the range [0,"
					+ (emps[empId].getNamesOfAccounts().length - 1) + "] inclusive");
			acctType = sc.nextLine();
			accountIndex = Integer.parseInt(acctType);
		}

		return accountIndex;
	}

	private double enterAmount(Scanner sc) {

		System.out.println("Select an amount");
		String amount = sc.nextLine();
		double amt = Double.parseDouble(amount);

		// if negative number is entered , enter again
		while (amt < 0) {
			System.out.println("You can't enter negative number, please enter positive number");
			amount = sc.nextLine();
			amt = Double.parseDouble(amount);
		}

		return amt;

	}

	private void getFormattedAccountInfo() {

		String info = "";
		for (Employee emp : emps) {

			info += "ACCOUNT INFO FOR " + emp.getName() + ":\n\n" + emp.getFormattedAcctInfo() + "\n\n";
		}
		System.out.println(info);
	}

	private void displayEmployees() {

		String formatedEmployees = "";
		for (int i = 0; i < emps.length; i++) {

			formatedEmployees += i + "." + emps[i].getName() + "\n";
		}

		System.out.println(formatedEmployees);

	}

	private void displayAccountTypes(int empIndex) {

		String[] accountTypes = emps[empIndex].getNamesOfAccounts();
		for (int i = 0; i < accountTypes.length; i++) {

			if (accountTypes[i] != null)
				System.out.println(i + "." + accountTypes[i].toLowerCase());
		}
	}

	private void displayOptions() {
		String n = System.getProperty("line.separator");
		String display = "A. See a report of all accounts." + n + "B. Make a deposit." + n + "C. Make a withdrawal." + n
				+ "N. To exit " + n + "Make a selection(A/B/C)";
		System.out.println(display);
	}
}
