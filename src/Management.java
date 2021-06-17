import java.util.*;
public class Management {

	static Stack customer_stack = new Stack();
	static Stack user_stack = new Stack();
	static Stack play_stack = new Stack();
	static Stack seat_stack = new Stack();
	
	public static void user_creation(String user_name, String password) {
		User user = new User(user_name,password);
		user_stack.push(user);
	}
	
	public static void page1() {
		Scanner myObj = new Scanner(System.in);
	    System.out.println("1-Sign up");
	    System.out.println("2-Log in");
	    System.out.println("3-Remove user");
	    int choice = myObj.nextInt();
	    if(choice==1) {
	    	System.out.println("Enter user name: ");
	    	String username = myObj.nextLine();
	    	System.out.println("Enter password: ");
	    	String password = myObj.nextLine();
	    	user_creation(username, password);
	    	System.out.println("User created");
	    	
	    }
	    if(choice==2) {
	    	System.out.println("Enter user name: ");
	    	String username = myObj.nextLine();
	    	System.out.println("Enter password: ");
	    	String password = myObj.nextLine();
	    	User loginuser=new User(username,password);
	    	boolean isUser=false;
	    	
	    	while(isUser==false) {
	    		isUser=loginuser.loggedIn(user_stack, loginuser);
	    		if(isUser==true) {
		    		System.out.println("You are successfully logged in");
		    		page2();
		    	}
		    	else if(isUser==false) {
		    		System.out.println("Wrong password or username");
		    	}
	    		
	    	}
	    }
	    
	    if(choice==3) {
	    	System.out.println("Enter user name: ");
	    	String username = myObj.nextLine();
	    	System.out.println("Enter password: ");
	    	String password = myObj.nextLine();
	    	User loginuser=new User(username,password);
	    	loginuser.removeUser(loginuser,user_stack);
	    	System.out.println("User has been removed");
	    }
	}
	 public static void page2() {
	    	
		 
		 
		 
		 
		 
		 
		 
		 
		 
	    }
	
}
