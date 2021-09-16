package lesson8.prg3.employeesort;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class EmployeeSort {

	public static void main(String[] args) {
		new EmployeeSort();

	}

	public EmployeeSort() {
		Employee[] empArray = { new Employee("George", 40000, 1996, 11, 5), new Employee("Dave", 50000, 2000, 1, 3),
				new Employee("Richard", 45000, 2001, 2, 7) };
		List<Employee> empList = Arrays.asList(empArray);
		NameComparator nameComp = new NameComparator();
		SalaryComparator salaryComp = new SalaryComparator();
		HireDateComparator hireComp = new HireDateComparator();

		System.out.println("=============Sort By Name ============");
		Collections.sort(empList, nameComp);
		System.out.println(empList);
		System.out.println("");

		System.out.println("=============Sort By Salary ============");
		Collections.sort(empList, salaryComp);
		System.out.println(empList);
		System.out.println("");

		System.out.println("=============Sort By Hire Date ============");
		Collections.sort(empList, hireComp);
		System.out.println(empList);
		System.out.println("");

	}

}
