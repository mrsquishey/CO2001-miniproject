import java.io.IOException;
import java.util.Random;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class ListFiveController {
	
	@FXML Text film1, film2, film3, film4, film5;
	@FXML Button submit;
	
	MovieManager mm = new MovieManager();
	
	public void onClick() {
		setNames();
	}
	
	public void setNames() {
		mm.createMovieList();
		Random ranNum = new Random();
		
		film1.setText(mm.getMList().get(ranNum.nextInt(mm.getMList().size())).toString());
		film2.setText(mm.getMList().get(ranNum.nextInt(mm.getMList().size())).toString());
		film3.setText(mm.getMList().get(ranNum.nextInt(mm.getMList().size())).toString());
		film4.setText(mm.getMList().get(ranNum.nextInt(mm.getMList().size())).toString());
		film5.setText(mm.getMList().get(ranNum.nextInt(mm.getMList().size())).toString());
	}

	public void clickBack(ActionEvent event) throws IOException{
		Parent startPage = FXMLLoader.load(getClass().getResource("Menu.fxml"));
		Scene startPageScene = new Scene(startPage);
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		
		window.setScene(startPageScene);
		window.show();
	}
}
