import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class ResultController {
	
	@FXML static Label result = new Label();
	
	public static void changeResult(String s) {
		result.setText(s);
	}

}
