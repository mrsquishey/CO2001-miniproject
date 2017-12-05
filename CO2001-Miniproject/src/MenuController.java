import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MenuController {

	public void clickFindFive(ActionEvent event) throws IOException{
		Parent startPage = FXMLLoader.load(getClass().getResource("ListFive.fxml"));
		Scene startPageScene = new Scene(startPage);
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		
		window.setScene(startPageScene);
		window.show();
	}
	
	public void clickSearch(ActionEvent event) throws IOException{
		Parent startPage = FXMLLoader.load(getClass().getResource("Login.fxml"));
		Scene startPageScene = new Scene(startPage);
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		
		window.setScene(startPageScene);
		window.show();
	}
	
	public void clickBack(ActionEvent event) throws IOException{
		Parent startPage = FXMLLoader.load(getClass().getResource("Miniproject.fxml"));
		Scene startPageScene = new Scene(startPage);
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		
		window.setScene(startPageScene);
		window.show();
	}
	
}
