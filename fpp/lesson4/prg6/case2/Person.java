package lesson4.prg6.case2;

import java.util.GregorianCalendar;

public class Person {

	private String name;
	private GregorianCalendar dateOfBirth;

	Person(String name, GregorianCalendar dob) {
		this.name = name;
		dateOfBirth = dob;
	}

	public String getName() {
		return name;
	}

	public GregorianCalendar getDateOfBirth() {
		return (GregorianCalendar) dateOfBirth.clone();
	}

	public boolean equals(Object ob) {
		if (ob == null)
			return false;
		if (!(ob instanceof Person))
			return false;
		Person p = (Person) ob;
		return p.name.equals(name) && p.dateOfBirth.equals(dateOfBirth);
	}

	public int hashCode() {
		int seed = 17;
		int result = 31 * seed + name.hashCode();
		result = 31 * result + dateOfBirth.hashCode();
		return result;
	}

	public static void main(String[] args) {
		Person person1 = new Person("Erika", new GregorianCalendar(1993, 8, 15));
		Person person2 = new Person("Erika", new GregorianCalendar(1993, 8, 15));
		Person person3 = new PersonWithJob("erika", new GregorianCalendar(1993, 8, 15), 200000);
		Person person4 = new PersonWithJob("Erika", new GregorianCalendar(1993, 8, 15), 200000);

		System.out.print("Is Person1 equal to Person2? ");
		System.out.println("\n" + (person1.equals(person2) ? "Yes" : "No"));
		System.out.print("Is Person3 equal to Person4? ");
		System.out.println("\n" + (person3.equals(person4) ? "Yes" : "No"));

		System.out.print("Is Person1 equal to Person4? ");
		System.out.println("\n" + (person1.equals(person3) ? "Yes" : "No"));
		System.out.print("Is Person1 equal to Person4? ");
		System.out.println("\n" + (person1.equals(person4) ? "Yes" : "No"));

		System.out.print("Is Person2 equal to Person3? ");
		System.out.println("\n" + (person2.equals(person3) ? "Yes" : "No"));
		System.out.print("Is Person2 equal to Person4? ");
		System.out.println("\n" + (person2.equals(person4) ? "Yes" : "No"));

		System.out.print("Is Person3 equal to Person1? ");
		System.out.println("\n" + (person3.equals(person1) ? "Yes" : "No"));
		System.out.print("Is Person3 equal to Person2? ");
		System.out.println("\n" + (person3.equals(person2) ? "Yes" : "No"));

		System.out.print("Is Person4 equal to Person1? ");
		System.out.println("\n" + (person4.equals(person1) ? "Yes" : "No"));

		System.out.print("Is Person4 equal to Person2? ");
		System.out.println("\n" + (person4.equals(person2) ? "Yes" : "No"));
	}

}
