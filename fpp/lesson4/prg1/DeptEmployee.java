package lesson4.prg1;

import java.time.LocalDate;

/**
 * @author Erika
 *
 */
public class DeptEmployee {
	public String name;
	public double salary;
	public LocalDate hireDate;

	/**
	 * @param name
	 * @param salary
	 * @param hireDate
	 */
	public DeptEmployee(String name, double salary, LocalDate hireDate) {
		this.name = name;
		this.salary = salary;
		this.hireDate = hireDate;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the hireDate
	 */
	public LocalDate getHireDate() {
		return hireDate;
	}

	/**
	 * @param hireDate the hireDate to set
	 */
	public void setHireDate(LocalDate hireDate) {
		this.hireDate = hireDate;
	}

	/**
	 * @return the salary
	 */
	public double getSalary() {
		return salary;
	}

	public double computeSalary() {
		return getSalary();

	}

}
