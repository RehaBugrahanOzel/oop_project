import java.util.*;
public class User {

	String userName;
	String password;
	
	public User(String userName, String password) {
		
		this.userName = userName;
		this.password = password;
	}

	public boolean loggedIn(Stack user_stack, String name, String password) {
		int size = user_stack.size();
		Stack temp = new Stack();
		for (int i = 0; i < size; i++) {
			temp.push(user_stack.pop());
			
			if (temp.peek()) {
				
			}
		}
	}
	
	public User removeUser (User user) {
		return user = null;
	}
}
