package lesson8.prg3.employeesort;

import java.util.Comparator;

/**
 * @author Erika
 *
 */
public class SalaryComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		int salary1 = o1.getSalary();
		int salary2 = o2.getSalary();

		if (Integer.compare(salary1, salary2) != 0) {
			return Integer.compare(salary1, salary2);
		}
		return o1.getName().compareTo(o2.getName());
	}

}
