package project;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.stage.Window;

public class StartMenuController implements Initializable {
	@FXML 
	private Button startBtn;
	@FXML 
	private Button exitBtn;
	
	private static String DIFF_MENU = "DifficultyMenu.fxml";

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		/*
		 * handles exit button press on main menu
		 */
		exitBtn.setOnAction((event -> {
			System.exit(0);
		}));
		
		/*
		 * loads diffifculty menu into stage
		 */
		startBtn.setOnAction((event -> {
			try {
				FXMLLoader loader = new FXMLLoader(getClass().getResource(DIFF_MENU));
				Parent root;
				root = loader.load();
				Scene scene = new Scene(root);
				Stage stage = (Stage) startBtn.getScene().getWindow();
				stage.setScene(scene);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}));
		
	}
}