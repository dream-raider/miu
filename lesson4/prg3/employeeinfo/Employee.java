package lesson4.prg3.employeeinfo;

import java.time.LocalDate;

import lesson4.prg3.AccountList;
import lesson4.prg3.MyStringList;

public class Employee {

	private AccountList accounts;
	private String name;
	private LocalDate hireDate;

	public Employee(String name, int yearOfHire, int monthOfHire, int dayOfHire) {
		this.name = name;
		this.hireDate = LocalDate.of(yearOfHire, monthOfHire, dayOfHire);
		accounts = new AccountList();

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getHireDate() {
		return hireDate;
	}

	public void setHireDate(LocalDate hireDate) {
		this.hireDate = hireDate;
	}

	public void createNewChecking(double startBalance) {
		Account acct = new CheckingsAccount(this, startBalance);
		accounts.add(acct);

	}

	public void createNewSavings(double startBalance) {
		Account acct = new SavingsAccount(this, startBalance);
		accounts.add(acct);

	}

	public void createNewRetirement(double startBalance) {
		Account acct = new RetirementAccount(this, startBalance);
		accounts.add(acct);
	}

	public void deposit(int accountIndex, double amt) {

		// select the account type for the person
		Account selected = accounts.get(accountIndex);

		// Then apply the deposit
		selected.makeDeposit(amt);

	}

	public boolean withdraw(int accountIndex, double amt) {

		boolean status = false;

		// select account based the object
		Account selected = accounts.get(accountIndex);

		return selected.makeWithdrawal(amt);

	}

	public String getFormattedAcctInfo() {

		String formatedAccountInfo = "";
		for (Account acct : accounts.getaccountList()) {
			if (acct != null) {
				formatedAccountInfo += acct.toString() + "\n";
			}
		}

		return formatedAccountInfo;
	}

	public String[] getNamesOfAccounts() {

		MyStringList accountTypeList = new MyStringList();

		for (int i = 0; i < accounts.getaccountList().length; i++) {

			if (accounts.getaccountList()[i] != null)
				accountTypeList.add(accounts.getaccountList()[i].getAcctType().toString());
		}

		return accountTypeList.getStrArray();

	}

}
