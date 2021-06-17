import java.util.*;

public class Customer {

	String nameSurname;
	int customerId;
	int phoneNumber;
	String emailAddress;
	int age;
	boolean isStudent;
	int memberNo;
	boolean isExist;
	boolean isMember;
	
	
	
	public Customer(String nameSurname, int phoneNumber, String emailAddress, int age, boolean isStudent, int memberNo, boolean isExist) {
		this.nameSurname = nameSurname;
		this.phoneNumber = phoneNumber;
		this.emailAddress = emailAddress;
		this.age = age;
		this.isStudent = isStudent;
		this.memberNo = memberNo;
		isExist = true; //bu belki SORUN !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
	}
	
	public Customer findCustomer(int customerId) {
		//sorting stack
	}

	public Customer editCustomer (Customer customerId) { //SONRA BAKALIM MI ARKADAÞLAR 
		return cst;
	}
	
	public void removeCustomer (int customerId) {
		Customer cst = findCustomer(customerId);
		cst.isExist = false;
	}
	
	
}
