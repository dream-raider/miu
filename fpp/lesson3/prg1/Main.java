package lesson3.prg1;

/**
 * @author Erika
 *
 *         This class creates Employee and employee's account and deposits
 *         amount to three different types of account
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Employee emp = new Employee("Erika", "Eri", 800000, 2012, 11, 27); // new Employee instance object
		// 3 instances of account with 3 different enum AccountType
		Account check = new Account(emp, AccountType.CHECKING);
		Account save = new Account(emp, AccountType.SAVINGS);
		Account retire = new Account(emp, AccountType.RETIREMENT);

		// making deposit of $300 on each account
		check.makeDeposit(300);
		save.makeDeposit(300);
		retire.makeDeposit(300);

		// print account info
		System.out.println(check.toString());
		System.out.println(save.toString());
		System.out.println(retire.toString());
	}

}
