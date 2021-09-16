package lesson4.prg3.employeeinfo;

/**
 * @author Erika
 *
 */

public class Account {

	private final static double DEFAULT_BALANCE = 0.0;
	protected double balance;
	private Employee employee;
	private AccountType acctType;

	// First constructor
	Account(Employee emp, double balance) {
		this.employee = emp;
		this.balance = balance;

	}

	public AccountType getAcctType() {
		return this.acctType;
	}

	// Second constructor
	Account(Employee emp) {
		this(emp, DEFAULT_BALANCE);
	}

	// Making deposit
	public void makeDeposit(double val) {
		this.balance += val;
	}

	// withdrawal
	public boolean makeWithdrawal(double amount) {

		// check if there is enough balance to withdraw
		if (amount > this.balance)
			return false;

		// Update balance
		this.balance -= amount;
		return true;
	}

	// getter method for balance
	public double getBalance() {
		return this.balance;
	}

}
