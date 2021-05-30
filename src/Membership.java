
public class Membership extends Customer{

	Customer memberInfo;
	int membershipDuration;
	Date membership_start;
	Date currentDate;

	
	public Membership(String nameSurname, int phoneNumber, String emailAddress, int age, boolean isStudent,
			int memberNo, boolean isExist, Customer memberInfo, int membershipDuration, Date membership_start,
			Date currentDate) {
		super(nameSurname, phoneNumber, emailAddress, age, isStudent, memberNo, isExist);
		this.memberInfo = memberInfo;
		this.membershipDuration = membershipDuration;
		this.membership_start = membership_start;
		this.currentDate = currentDate;
	}

	public void addMember(Customer cst) {
		cst.isMember = true;
		memberInfo = cst;
		//member stack at
	}
	
	public boolean QueryMember() {
		Customer c = findCustomer(customerId);
		return c.isMember;
	}
	
	public void cancelMembership(Membership member) {
		member.isMember = false;
	}
	
	public long get_membership_duration() {
		Date cd = currentDate.CurrentDate();
		long duration = cd.Duration(membership_start, cd);
		return duration;
	}
}
