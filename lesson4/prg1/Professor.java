package lesson4.prg1;

import java.time.LocalDate;

/**
 * @author Erika
 *
 */
public class Professor extends DeptEmployee {
	private int numberOfPublication;

	/**
	 * @param numberOfPublication
	 */
	public Professor(String name, double salary, LocalDate hireDate, int numberOfPublication) {
		super(name, salary, hireDate);
		this.numberOfPublication = numberOfPublication;
	}

	/**
	 * @return the numberOfPublication
	 */
	public int getNumberOfPublication() {
		return numberOfPublication;
	}

	/**
	 * @param numberOfPublication the numberOfPublication to set
	 */
	public void setNumberOfPublication(int numberOfPublication) {
		this.numberOfPublication = numberOfPublication;
	}

}
