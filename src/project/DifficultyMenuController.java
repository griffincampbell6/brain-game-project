package project;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class DifficultyMenuController implements Initializable {
	@FXML
	private Button easyBtn;
	@FXML
	private Button mediumBtn;
	@FXML
	private Button hardBtn;
	@FXML
	private Button backBtn;
	
	private static String START_MENU = "StartMenu.fxml";
	private static String RECIPES_MENU = "RecipesMenu.fxml";

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		/*
		 * BACK BUTTON EVENT
		 * loads previous start screen
		 */
		backBtn.setOnAction((event -> {
			try {
				FXMLLoader loader = new FXMLLoader(getClass().getResource(START_MENU));
				Parent root;
				root = loader.load();
				Scene scene = new Scene(root);
				Stage stage = (Stage) backBtn.getScene().getWindow();
				stage.setScene(scene);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}));
		
		/*
		 * EASY BUTTON EVENT
		 * loads recipes menu
		 * TODO add functionality to time given
		 */
		easyBtn.setOnAction((event -> {
			loadNext();
		}));
		
		/*
		 * MEDIUM BUTTON EVENT
		 * loads recipes menu
		 * TODO add functionality to time given
		 */
		mediumBtn.setOnAction((event -> {
			loadNext();
		}));
		
		/*
		 * HARD BUTTON EVENT
		 * loads recipes menu
		 * TODO add functionality to time given
		 */
		hardBtn.setOnAction((event -> {
			loadNext();
		}));
	
	}
	
	/**
	 * method made to load recipes menu 
	 * to avoid rewriting code for every button
	 * @param none
	 */
	private void loadNext() {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource(RECIPES_MENU));
			Parent root;
			root = loader.load();
			Scene scene = new Scene(root, 1280, 720);
			Stage stage = (Stage) easyBtn.getScene().getWindow();
			stage.setScene(scene);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
