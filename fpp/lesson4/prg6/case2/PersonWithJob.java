package lesson4.prg6.case2;

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
	public boolean equals(Object ob) {

		if (ob == null)
			return false;
		if (!(ob instanceof PersonWithJob)) {
			System.out.print("Not same");
			return false;
		}
		PersonWithJob p = (PersonWithJob) ob;
		return super.equals(ob) && p.getSalary() == salary;

	}
}
