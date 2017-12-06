import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

public class SignUp {

	UserHandler userHandler = new UserHandler();
	String usern, passw;
	
	@FXML
	Button signup,login,backButton;
	@FXML
	TextField username,searchBar;
	@FXML
	TextField password;
	@FXML
	RadioButton male, female, button;
	
	
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
	
}}
