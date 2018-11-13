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
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class DifficultyMenuController implements Initializable {
	@FXML private Button easyBtn;
	@FXML private Button mediumBtn;
	@FXML private Button hardBtn;
	@FXML private Button backBtn;
	
	@FXML private Pane easyPane;
	@FXML private Pane mediumPane;
	@FXML private Pane hardPane;
	
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
		easyBtn.setOnMouseEntered((event -> {
			paneEnter(easyPane);
		}));
		easyBtn.setOnMouseExited((event -> {
			paneExit(easyPane);
		}));
		easyBtn.setOnAction((event -> {
			loadNext();
		}));
		
		/*
		 * MEDIUM BUTTON EVENT
		 * loads recipes menu
		 * TODO add functionality to time given
		 */
		mediumBtn.setOnMouseEntered((event -> {
			paneEnter(mediumPane);
		}));
		mediumBtn.setOnMouseExited((event -> {
			paneExit(mediumPane);
		}));
		mediumBtn.setOnAction((event -> {
			loadNext();
		}));
		
		/*
		 * HARD BUTTON EVENT
		 * loads recipes menu
		 * TODO add functionality to time given
		 */
		hardBtn.setOnMouseEntered((event -> {
			paneEnter(hardPane);
		}));
		hardBtn.setOnMouseExited((event -> {
			paneExit(hardPane);
		}));
		hardBtn.setOnAction((event -> {
			loadNext();
		}));
	
	}
	
	/**
	 * method to style panes with
	 * mouse enter
	 * @param pane of button
	 */
	private void paneEnter(Pane pane) {
		pane.setStyle("-fx-background-color: #00FFFF;"
				+ "-fx-border-color: #000000");
	}
	
	/**method ti styke pabes with
	 * mouse exit
	 * 
	 * @param pane of button
	 */
	private void paneExit(Pane pane) {
		pane.setStyle("-fx-background-color: #ffffff;"
				+ "-fx-border-color: #000000");
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
