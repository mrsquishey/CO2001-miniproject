import java.io.Serializable;

	public class User implements Serializable{
	private String username, password, gender;
	private int userID, age;
	
	

	public User(){
		this.setUsername("username");
		this.setPassword("password");
		this.setGender("Other");
		this.setUserID(-1);
		
	}
	
	public User(String username, String password, String gender, int userID) {
		
		this.username = username;
		this.password = password;
		this.userID = userID;
		this.gender = gender;
		
	}
	
	public String getGender() {
		return gender;
	}

	public void setGender(String g) {
		this.gender = g;
	}
	

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		mainloop:
		for(int i = 0; i <UserHandler.userList.size(); i++) {
			if(UserHandler.userList.get(i).getUsername().equals(username)) {	
				this.username="broken";
			}
		}
	this.username=username;
		
	}
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) throws IllegalArgumentException {
		if(password.length() < 3){
			throw new IllegalArgumentException();
		}else{
		this.password = password;}
	}


	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}
	
	public String toString() {
		return("("+this.getUsername() + ", " + this.getPassword() + ", " + this.getGender()+ ", " + this.getUserID()+")");
	}


}
