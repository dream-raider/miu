package lesson4.prg3;

import lesson4.prg3.employeeinfo.Account;

public class AccountList {

	// Holds the size
	private int size;
	private static int DEFAULT_ACCOUNTS = 2;

	// This is a string array
	public Account[] accountList;

	// constructor
	public AccountList() {

		this.accountList = new Account[DEFAULT_ACCOUNTS];
		this.size = 0; // controls this
	}

	public Account[] getaccountList() {
		return accountList;
	}

	/*
	 * Method to add account to the accountList
	 * 
	 */
	public void add(Account acct) {

		//
		if (acct != null) {

			// Check if the array is already full
			if (size >= accountList.length)
				this.resize();

			// Add the given string at the end
			accountList[size++] = acct;
		}

	}

	/*
	 * Retrieves the Account at the ith index
	 *
	 */
	public Account get(int i) {

		// Index i is positive and insider array length
		if (i < accountList.length && i >= 0) {

			return accountList[i];
		}

		// Otherwise , return some message
		return null;
	}

	/**
	 * This method looks for a given Account in an array
	 * 
	 * @param s : a string to look in the array
	 * @retrun boolean : true -> if the string is in the array false -> if the
	 *         string is not in the array
	 */
	public boolean find(Account acct) {

		for (Account a : accountList) {
			if (a.equals(acct))
				return true;
		}

		// will not arrive here if the string is found in the array
		return false;
	}

	/**
	 * This removes a given Account from an array of AccountLiar
	 * 
	 * @param: acct : a string to be removed
	 * @return boolean : True -> if found and removed False-> if not found , hence
	 *         not removed
	 */
	public boolean remove(Account acct) {

		boolean removedStatus = false;

		for (int i = 0; i < size; i++) {

			// check if the given string exists in the array
			if (accountList[i].equals(acct)) {

				// Shrinks the array after removing s
				removeElementAndShrinkArray(i);

				// set removed status true;
				removedStatus = true;

			}
		}

		return removedStatus;
	}

	// Helper method to remove a given element and shrink the array
	private void removeElementAndShrinkArray(int start) {

		// shift each element index to left by 1
		for (int j = start; j < size - 1; j++) {
			accountList[j] = accountList[j + 1];
		}

		accountList[size] = null;
		size -= 1;
	}

	/**
	 * returns the underlying array in a given format
	 * 
	 * @return String : combination of the array elements in a given format
	 * 
	 */
	public String toString() {

		StringBuilder sb = new StringBuilder();

		// append the first square bracket
		sb.append("[");
		for (int i = 0; i < size; i++) {

			sb.append(accountList[i]);

			// Don't put comma after the last element
			if (i != size - 1)
				sb.append(", ");
		}

		return sb.append("]").toString();
	}

	/*
	 * Gets the next open position in the array
	 * 
	 */
	public int size() {
		return this.size;
	}

	/*
	 * the following method resizes the array
	 * 
	 * Note : Under the hood , Its creating another array with size equal with
	 * double.
	 * 
	 */
	private void resize() {

		System.out.println("Resizing...");
		Account[] newArray = new Account[size * 2];
		System.arraycopy(accountList, 0, newArray, 0, accountList.length);
		accountList = newArray;

	}

	/**
	 * This method insert an account at position pos Note : not asked in the
	 * assignment but impelemented that for my self
	 * 
	 * @param s
	 * @param pos
	 */
	public void insert(Account acct, int pos) {

		// check if position Inside array and
		// we have space to add more element
		if ((pos >= 0 && pos < accountList.length)) {

			// if size ,resize that
			if (size >= accountList.length)
				this.resize();

			if (size == pos) {
				accountList[size + 1] = acct;
			} else {
				for (int i = size + 1; i > pos; i--) {
					accountList[i] = accountList[i - 1];
				}

				// Insert at pos
				accountList[pos] = acct;
			}

			size += 1;

		} else {
			System.out.println("The inserted index is out of the array indexes");
		}

	}

}
