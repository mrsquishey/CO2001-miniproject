import java.io.Serializable;

public class User implements Serializable{
	private String username, password, gender;
	private int userID, age;
	
public User() {
		
		this.username = "none";
		this.password = "none";
		this.userID = -1;
		
	}
	
	public User(String username, String password, int userID) {
		
		this.username = username;
		this.password = password;
		this.userID = userID;
		
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) throws IllegalArgumentException {
		if(password.length() > 3){
			throw new IllegalArgumentException();
		}else{
		this.username = username;}
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}


	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}


}
