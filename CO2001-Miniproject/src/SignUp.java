import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class SignUp {

	UserHandler userHandler = new UserHandler();
	String usern, passw;
	String gender = "";
	@FXML
	Button signup,login,backButton;
	@FXML
	TextField username,searchBar;
	@FXML
	TextField password;
	@FXML
	RadioButton male, female, other;
	
	
	public void handleButtonClick(ActionEvent event) throws IOException{
		System.out.println("This works!");
	
		usern = username.getText();
		passw = password.getText();
		
		if(male.isSelected()){gender = "male";}
		if(female.isSelected()){gender = "female";}
		if(other.isSelected()){gender = "other";}
		mainloop:
			for(int i = 0; i <UserHandler.userList.size(); i++) {
				if(UserHandler.userList.get(i).getUsername().equals(usern)) {	
					usern="broken";
				}
			}
		if(usern.equals("broken")) {
			
		}else {
		userHandler.addUser(usern, passw, gender);}
		System.out.println(userHandler.userList.toString());
		
		LoginController.saveUsers();
		Parent startPage = FXMLLoader.load(getClass().getResource("Miniproject.fxml"));
		Scene startPageScene = new Scene(startPage);
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		
		window.setScene(startPageScene);
		window.show();
}}
