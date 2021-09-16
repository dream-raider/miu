package lesson4.prg1;

import java.time.LocalDate;
import java.util.Scanner;

/**
 * @author Erika
 *
 */
public class Main {
	public static void main(String[] args) {
		DeptEmployee emp1 = new Professor("Boss", 800000.0, LocalDate.of(2021, 11, 27), 10);
		DeptEmployee emp2 = new Professor("Mini Boss", 200000.0, LocalDate.of(2021, 11, 27), 10);
		DeptEmployee emp3 = new Professor("No Boss", 334000.0, LocalDate.of(2021, 11, 27), 10);
		DeptEmployee emp4 = new Secretary("Boss Secretary", 20000.0, LocalDate.of(2021, 11, 27), 200);
		DeptEmployee emp5 = new Secretary("Secretary", 3000.0, LocalDate.of(2021, 11, 27), 200);

		DeptEmployee[] department = new DeptEmployee[5];
		department[0] = emp1;
		department[1] = emp2;
		department[2] = emp3;
		department[3] = emp4;
		department[4] = emp5;

		Scanner scan = new Scanner(System.in);
		System.out.println("Do you wish to see the sum of all salaries in the department? Y/N");
		String input = scan.nextLine();
		double totalSalary = 0;
		if (input.equals("Y") || input.equals("y")) {
			for (DeptEmployee dept : department) {
				totalSalary += dept.computeSalary();
				System.out.println("Name: " + dept.getName() + "     Salary: " + dept.getSalary());
			}
		}
		System.out.println("The total sum of salaries of all the employee is: " + totalSalary);
		scan.close();
	}
}
