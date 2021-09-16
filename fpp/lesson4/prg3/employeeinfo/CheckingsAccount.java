package lesson4.prg3.employeeinfo;

/**
 * @author Erika
 *
 */
public class CheckingsAccount extends Account {

	private final static int SERVICE_CHARGE = 5;

	CheckingsAccount(Employee emp, double startBalance) {
		super(emp, startBalance);
	}

	public AccountType getAcctType() {
		return AccountType.CHECKING;
	}

	@Override
	public double getBalance() {
		return super.getBalance() - SERVICE_CHARGE;
	}

	public String toString() {
		return "Account type:  " + getAcctType().toString().toLowerCase() + "\nCurrent bal: " + this.getBalance();
	}

}
