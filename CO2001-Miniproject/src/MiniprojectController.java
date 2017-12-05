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
	@FXML Label result;
	
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
				Parent loginPage = FXMLLoader.load(getClass().getResource("Login.fxml"));
				Scene loginPageScene = new Scene(loginPage);
				Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
				
				window.setScene(loginPageScene);
				window.show();
			}
		}
	
	}

	public void clickBack(ActionEvent event) throws IOException{
		Parent startPage = FXMLLoader.load(getClass().getResource("Miniproject.fxml"));
		Scene startPageScene = new Scene(startPage);
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		
		window.setScene(startPageScene);
		window.show();
	}
	
	public void saveUsers(){
		try {
			 

			// write object to file
			FileOutputStream fos = new FileOutputStream("users.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(UserHandler.userList);
			oos.close();

			// read object from file
			FileInputStream fis = new FileInputStream("users.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			ArrayList<User> result = (ArrayList<User>) ois.readObject();
			UserHandler.userList=result;
			ois.close();

			System.out.println(UserHandler.userList.toString());

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public void onSearchClick(ActionEvent event) throws IOException{
		String q = onSearch().toString();
		
		Parent searchPage = FXMLLoader.load(getClass().getResource("SearchResult.fxml"));
		Scene searchPageScene = new Scene(searchPage);
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		
		window.setScene(searchPageScene);
		window.show();
		System.out.println(q);
		
		
		
		
	}
	
	public Movie onSearch(){
		
		MovieManager mm = new MovieManager();
		mm.createMovieList();
		Movie m = new Movie();
		Movie p = null;
		String s = searchBar.getText();
		for(int i = 0; i < mm.getMList().size(); i++){
			if(mm.getMList().get(i).getTitle().contains(s)){
				p = mm.getMList().get(i);
			}
		}
		if(p!=null){
			return p;
		}else{return m;}
	
		}
	
	
	
}
