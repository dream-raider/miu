package lesson4.prg1;

import java.time.LocalDate;

/**
 * @author Erika
 *
 */
public class Secretary extends DeptEmployee {
	private double overtimeHours;

	Secretary(String name, double salary, LocalDate hireDate, double overtimeHours) {
		super(name, salary, hireDate);
		this.overtimeHours = overtimeHours;
	}

	@Override
	public double computeSalary() {
		salary = super.getSalary();
		return salary + 12 * overtimeHours;

	}

}
