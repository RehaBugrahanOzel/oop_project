import java.util.*;
public class Management {

	Stack customer_stack = new Stack();
	Stack user_stack = new Stack();
	Stack play_stack = new Stack();
	Stack seat_stack = new Stack();
	
	public void user_creation(String user_name, String password) {
		User user = new User(user_name,password);
		user_stack.push(user);
	}
	
	public boolean user_check(Stack user_stack, String ) {
		
	}
}
