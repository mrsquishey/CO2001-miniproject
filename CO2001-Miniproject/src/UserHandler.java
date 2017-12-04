import java.util.ArrayList;

import com.sun.xml.internal.ws.developer.UsesJAXBContext;

public class UserHandler {
	static public ArrayList<User> userList = new ArrayList<User>();
	private int id = 0;
//	User user = new User();
	
	public UserHandler() {
		User u = new User("Username", "Password", -1);
		userList.add(u);
	}
	
	public void addUser(String username, String password) {
		User m = new User();
		m.setUsername(username);
		m.setPassword(password);
		m.setUserID(id);
		userList.add(m);
		id++;
	}
	
	
}
