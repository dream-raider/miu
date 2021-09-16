package lesson4.prg6.case3;

import java.util.GregorianCalendar;

public class PersonWithJob extends Person {
	private double salary;

	PersonWithJob(String name, GregorianCalendar dob, double salary) {
		super(name, dob);
		this.salary = salary;
	}

	public double getSalary() {
		return salary;
	}

	@Override
	public final boolean equals(Object ob) {
		if (ob == null) {
			return false;
		}
		if (getClass() != ob.getClass())
			return false;
		PersonWithJob p = (PersonWithJob) ob;

		boolean equals = p.getName().equals(getName()) && p.getDateOfBirth().equals(getDateOfBirth())
				&& this.salary == p.getSalary();
		return equals;

	}
}
