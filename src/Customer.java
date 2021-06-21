import java.util.*;

public class Customer {

	String nameSurname;
	int customerId;
	String phoneNumber;
	String emailAddress;
	int age;
	boolean isStudent;



	public Customer(String nameSurname, String phoneNumber, String emailAddress, int age, boolean isStudent) {
		this.nameSurname = nameSurname;
		this.phoneNumber = phoneNumber;
		this.emailAddress = emailAddress;
		this.age = age;
		this.isStudent = isStudent;
	}
	public Customer() {

	}

}