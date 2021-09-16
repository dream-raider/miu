package lesson6.prg3;

import java.time.LocalDate;

/**
 * @author Erika
 *
 * 
 */
public class Employee {
	private Account savingsAcct;
	private Account checkingAcct;
	private Account retirementAcct;
	private String name;
	private LocalDate hireDate;

	public Employee(String name, int yearOfHire, int monthOfHire, int dayOfHire) {
		this.name = name;
		hireDate = LocalDate.of(yearOfHire, monthOfHire, dayOfHire);

	}

	public String getName() {
		return name;
	}

	public LocalDate getHireDate() {
		return hireDate;
	}

	public void createNewChecking(double startAmount) {
		checkingAcct = new Account(this, AccountType.CHECKING, startAmount);
	}

	public void createNewSavings(double startAmount) {
		savingsAcct = new Account(this, AccountType.SAVINGS, startAmount);

	}

	public void createNewRetirement(double startAmount) {
		retirementAcct = new Account(this, AccountType.RETIREMENT, startAmount);

	}

	public void deposit(AccountType acctType, double amt) {
		switch (acctType) {
		case CHECKING:
			checkingAcct.makeDeposit(amt);
			break;
		case SAVINGS:
			savingsAcct.makeDeposit(amt);
			break;
		case RETIREMENT:
			retirementAcct.makeDeposit(amt);
			break;
		default:

		}
	}

	public boolean withdraw(AccountType acctType, double amt) {
		switch (acctType) {
		case CHECKING:
			return checkingAcct.makeWithdrawal(amt);
		case SAVINGS:
			return savingsAcct.makeWithdrawal(amt);
		case RETIREMENT:
			return retirementAcct.makeWithdrawal(amt);
		default:
			return false;
		}

	}

	public String getFormattedAcctInfo() {
		String formattedAccInfo = "";
		if (savingsAcct != null || checkingAcct != null || retirementAcct != null) {
			formattedAccInfo += "\n\nACCOUNT INFO FOR " + this.getName() + ": \n";
		}
		if (savingsAcct != null)
			formattedAccInfo += savingsAcct.toString() + "\n";
		if (checkingAcct != null)
			formattedAccInfo += checkingAcct.toString() + "\n";
		if (retirementAcct != null)
			formattedAccInfo += retirementAcct.toString();

		return formattedAccInfo;
	}
}