package lesson4.prg3.employeeinfo;

/**
 * @author Erika
 *
 */
public class SavingsAccount extends Account {

	private final static double INTEREST = 0.0025;

	public SavingsAccount(Employee e, double balance) {
		super(e, balance);
	}

	public AccountType getAcctType() {
		return AccountType.SAVINGS;
	}

	@Override
	public double getBalance() {
		return super.getBalance() + super.getBalance() * INTEREST;
	}

	public String toString() {
		return "Account type:  " + getAcctType().toString().toLowerCase() + "\nCurrent balance: " + this.getBalance();
	}

}
