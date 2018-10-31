package project;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;

public class MenuController implements Initializable {
	@FXML 
	private Button startBtn;
	@FXML 
	private Button exitBtn;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		/*
		 * handles exit button press on main menu
		 */
		exitBtn.setOnAction((event -> {
			System.exit(0);
		}));
		
		startBtn.setOnAction((event -> {
			
		}));
		
	}
	
	
	
}
