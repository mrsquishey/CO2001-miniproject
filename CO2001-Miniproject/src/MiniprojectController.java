import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class MiniprojectController{
	
	UserHandler userHandler = new UserHandler();
	String usern, passw;
	
	@FXML
	Button signup,login,backButton;
	@FXML
	TextField username,searchBar;
	@FXML
	TextField password;
	
	
	public void handleButtonClick(ActionEvent event) throws IOException{
		Parent startPage = FXMLLoader.load(getClass().getResource("SignUp.fxml"));
		Scene startPageScene = new Scene(startPage);
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		
		window.setScene(startPageScene);
		window.show();
	}
	
	public void usernameSet() {
		usern = username.getText();
	}
	
	public void passwordSet() {
		passw = password.getText();
	}
	
	
	
	public void clickLogin(ActionEvent event) throws IOException{
		for(int i = 0; i <UserHandler.userList.size(); i++) {
			if(UserHandler.userList.get(i).getUsername().equals(username.getText())&&UserHandler.userList.get(i).getPassword().equals(password.getText())) {	
				Parent loginPage = FXMLLoader.load(getClass().getResource("Menu.fxml"));
				Scene loginPageScene = new Scene(loginPage);
				Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
				
				window.setScene(loginPageScene);
				window.show();
			}
		}
	
	}

	
	
	
	
	
	
}
