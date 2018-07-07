package whgc.util;

import whgc.model.User;

public class Application {
	
	private static User user;

	
	public  void setUser(User u) {
		
		user=u;
	}
	
	public static User getUser() {
		
		return user;
	}



}
