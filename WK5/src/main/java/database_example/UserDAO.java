package database_example;

import java.util.ArrayList;
import java.util.List;

// enum is NOT a class
public enum UserDAO {
	
	// Essential as it is an entry point
	instance;
	
	List<User> usersList;
	
	private UserDAO() {
		usersList = new ArrayList<User>();
		
		User u1 = new User("Lilly", "Athlone");
		User u2 = new User("Adrian", "Claremorris");
		User u3 = new User("Patrick", "Roscommon");
		
		// Add users to the list
		usersList.add(u1);
		usersList.add(u2);
		usersList.add(u3);
	}
	
	public List<User> list(){
		return this.usersList;
	}

}
