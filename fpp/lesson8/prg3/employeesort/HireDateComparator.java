package lesson8.prg3.employeesort;

import java.util.Comparator;
import java.util.Date;

/**
 * @author Erika
 *
 */
public class HireDateComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		Date hireDate1 = o1.getHireDate();
		Date hireDate2 = o2.getHireDate();

		if (hireDate1.compareTo(hireDate2) != 0) {
			return hireDate1.compareTo(hireDate2);
		}
		return o1.getName().compareTo(o2.getName());
	}

}
