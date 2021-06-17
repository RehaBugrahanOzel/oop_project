import java.util.*;
public class User {

	String userName;
	String password;
	
	public User(String userName, String password) {
		
		this.userName = userName;
		this.password = password;
	}

	public boolean loggedIn(Stack user_stack, User user) {
		int size = user_stack.size();
		Stack temp = new Stack();
		boolean flag=false;
		for (int i = 0; i < size; i++) {
			User tempuser = (User) user_stack.pop();
			if(tempuser.userName.equals(user.userName)){
				if(tempuser.password.equals(user.password)) {
					flag = true;
				}
				else {
					System.out.println("Wrong password");
				}
			}
			temp.push(tempuser);
		}
		for (int i = 0; i < size; i++) {
			user_stack.push(temp.pop());
		}
		
		if(flag==false) {
			System.out.println("User doesn't exist or password is wrong");
		}
		/*else if(flag==true) {
			System.out.println("ANAN YANÝ GÝRÝÞ");
		}*/
		return flag;
	}
	
	public void removeUser (User user,Stack user_stack) {
		Stack temp = new Stack();
		int size = user_stack.size();
		for (int i = 0; i < size; i++) {
			boolean flag=true;
			User tempuser = (User) user_stack.pop();
			if(tempuser.userName.equals(user.userName)){
				if(tempuser.password.equals(user.password)) {
					flag=false;
				}
			}
			if(flag) {
				temp.push(tempuser);
			}
		}
		int tempsize = temp.size();
		for (int i = 0; i < tempsize; i++) {
			user_stack.push(temp.pop());
		}
	}
}
