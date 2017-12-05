import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class UserHandler {
	static public ArrayList<User> userList = new ArrayList<User>();
	private int id = 0;
//	User user = new User();
	
	public UserHandler() {
		readUsers();
	}
	
	public void readUsers(){
		try {
		FileInputStream fis = new FileInputStream("users.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		ArrayList<User> result = (ArrayList<User>) ois.readObject();
		UserHandler.userList=result;
		ois.close();}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
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
