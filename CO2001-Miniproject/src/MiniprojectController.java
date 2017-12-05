import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
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
