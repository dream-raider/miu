package lesson4.prg3.employeeinfo;

/**
 * @author Erika
 *
 */
public class RetirementAccount extends Account {

	private final static double PENALITY = 0.02;

	public RetirementAccount(Employee e, double balance) {

		super(e, balance);
	}

	public AccountType getAcctType() {

		return AccountType.RETIREMENT;
	}

	@Override
	public boolean makeWithdrawal(double amount) {

		// check if there is enough balance to withdraw
		if (amount > this.getBalance())
			return false;

		double baseBalance = this.getBalance();

		double penlity = PENALITY * baseBalance;
		double totalDeduction = penlity + amount;

		// Update balance
		this.balance -= totalDeduction;

		return true;
	}

	public String toString() {
		return "Account type:  " + getAcctType().toString().toLowerCase() + "\nCurrent bal: " + this.getBalance();
	}

}
