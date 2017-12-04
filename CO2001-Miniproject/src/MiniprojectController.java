import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class MiniprojectController{
	
	UserHandler userHandler = new UserHandler();
	String usern, passw;
	
	@FXML
	Button login;
	@FXML
	TextField username;
	@FXML
	TextField password;
	
	public void handleButtonClick(){
		System.out.println("This works!");
	
		usern = username.getText();
		passw = password.getText();
		mainloop:
			for(int i = 0; i <UserHandler.userList.size(); i++) {
				if(UserHandler.userList.get(i).getUsername().equals(usern)) {	
					usern="broken";
				}
			}
		if(usern.equals("broken")) {
			
		}else {
		userHandler.addUser(usern, passw);}
		System.out.println(userHandler.userList.toString());
	}
	
	public void usernameSet() {
		usern = username.getText();
	}
	
	public void passwordSet() {
		passw = password.getText();
	}
	
	
}
