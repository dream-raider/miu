package lesson2;

/**
 * @author Erika
 * 
 *         This class has 4 private properties named street,city,state,zip
 *         Constructor has been used to initialize the value of all the
 *         properties Access and mutator has been used to get and set value. It
 *         has one getter "city" to get the value of city
 */
class Address {

	private String street;
	private String city;
	private String state;
	private String zip;

	public Address(String str, String cit, String st, String z) {
		street = str;
		city = cit;
		state = st;
		zip = z;
	}

	/**
	 * Provides a string representation of an address.
	 */
	public String toString() {
		return street + ", " + city + ", " + state + " " + zip;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setState(String state) {
		this.state = state;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getCity() {
		return city;
	}

}

class Customer {
	/**
	 * @author Erika
	 * 
	 *         This class is for customer details. It has 5 properties
	 *         firstName,lastName, socSecurityNum,billingAddress,shippingAddress It
	 *         has constructor to initialize the values It has accessors and
	 *         mutators to set and get the values. It has toString function which
	 *         overrides the toString method of String class
	 *
	 */
	private String firstName;
	private String lastName;
	private String socSecurityNum;
	private Address billingAddress;
	private Address shippingAddress;

	public Customer(String firstName, String lastName, String socSecurityNum, Address billingAddress,
			Address shippingAddress) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.socSecurityNum = socSecurityNum;
		this.billingAddress = billingAddress;
		this.shippingAddress = shippingAddress;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getSocSecurityNum() {
		return socSecurityNum;
	}

	public void setSocSecurityNum(String socSecurityNum) {
		this.socSecurityNum = socSecurityNum;
	}

	public Address getBillingAddress() {
		return billingAddress;
	}

	public void setBillingAddress(Address billingAddress) {
		this.billingAddress = billingAddress;
	}

	public Address getShippingAddress() {
		return shippingAddress;
	}

	public void setShippingAddress(Address shippingAddress) {
		this.shippingAddress = shippingAddress;
	}

//	@return
	public String toString() {
		return "[" + firstName + "," + lastName + "," + socSecurityNum + "," + billingAddress + "," + shippingAddress
				+ "]";

	}

}

public class Prg1 {
	public static void main(String[] args) {

		/*
		 * create test data of Class Customer which has billingAdddress and
		 * ShippingAddress of class Address
		 */
		Customer customer1 = new Customer("Joe", "Smith", "332-221-4444",
				new Address("HeavenlyLane", "Fairfield", "Iowa", "52557"),
				new Address("ChicagoSt", "Chicago", "A state", "52557"));
		Customer customer2 = new Customer("Eoj", "Smith", "332-221-5555",
				new Address("ChicagoSt", "Chicago", "Somewhere In USA", "52557"),
				new Address("HeavenlyLane", "Fairfield", "Iowa", "52557"));

		// add test data to customers array statically
		Customer[] customers = new Customer[2];
		customers[0] = customer1;
		customers[1] = customer2;

		// search for customer whose billing address is "Chicago"
		for (int i = 0; i < customers.length; i++) {
			if (customers[i].getBillingAddress().getCity().equals("Chicago")) {
				System.out.println(customers[i].toString());
			}
		}

	}

}
