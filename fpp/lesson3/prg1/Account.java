package lesson3.prg1;

/**
 * @author Erika
 *
 */
class Account {
	private final static double DEFAULT_BALANCE = 0.0;
	private double balance;
	private Employee employee;
	private AccountType acctType;

	Account(Employee employee, AccountType acctType, double balance) {
		this.employee = employee;
		this.acctType = acctType;
		this.balance = balance;
	}

	Account(Employee emp, AccountType acctType) {
		this(emp, acctType, DEFAULT_BALANCE);
	}

	public String toString() {
		return "type = " + acctType + ", balance = " + balance;
	}

	/**
	 * @return the balance
	 */
	public double getBalance() {
		return balance;
	}

	/**
	 * @return the acctType
	 */
	public AccountType getAcctType() {
		return acctType;
	}

	/**
	 * @param deposit
	 */
	public void makeDeposit(double deposit) {
		balance += deposit;
	}

	/**
	 * @param amount
	 * @return boolean
	 */
	public boolean makeWithdrawal(double amount) {
		if (amount > balance)
			return false; // withdraw amount is larger than current balance
		balance -= amount;

		return true;
//implement
	}
}
