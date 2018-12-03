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

/**
 * This is the main menu screen of our game
 * 
 * @author Griffin Campbell, Martin Cheung, Sarah Kaczynski
 */
public class StartMenuController implements Initializable {
	
	@FXML private Button startBtn;
	@FXML private Button aboutBtn;
	@FXML private Button exitBtn;
	
	@FXML private Pane startPane;
	@FXML private Pane aboutPane;
	@FXML private Pane exitPane;
	
	private static String DIFF_MENU = "DifficultyMenu.fxml";
	
	private void loadNext() {
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
	}
	
	private void paneMovementEvent(Pane pane, boolean condition) {
		if (condition == true) {
			pane.setStyle("-fx-background-color: #e38d9c; -fx-border-color: #000000;"
					+ "-fx-border-radius: 15; -fx-background-radius: 15; "
					+ "-fx-border-width: 2");
		}
		else {
			pane.setStyle("-fx-background-color: #f5d7dc; -fx-border-color: #000000;"
					+ "-fx-border-radius: 15; -fx-background-radius: 15; "
					+ "-fx-border-width: 2");
		}
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		/*
		 * START BUTTON ACTION EVENTS
		 * loads diffifculty menu into stage
		 */
		startBtn.setOnAction((event -> {
			loadNext();
		}));
		startBtn.setOnMouseEntered((event -> {
			paneMovementEvent(startPane, true);
		}));
		startBtn.setOnMouseExited((event -> {
			paneMovementEvent(startPane, false);
		}));
		
		/*
		 * ABOUT BUTTON ACTION EVENTS
		 */
		aboutBtn.setOnAction((event -> {
			
		}));
		aboutBtn.setOnMouseEntered((event -> {
			paneMovementEvent(aboutPane, true);
		}));
		aboutBtn.setOnMouseExited((event -> {
			paneMovementEvent(aboutPane, false);
		}));
		
		/*
		 * EXIT BUTTON ACTION EVENTS
		 * handles exit button press on main menu
		 */
		exitBtn.setOnAction((event -> {
			System.exit(0);
		}));
		exitBtn.setOnMouseEntered((event -> {
			paneMovementEvent(exitPane, true);
		}));
		exitBtn.setOnMouseExited((event -> {
			paneMovementEvent(exitPane, false);
		}));
		
	}
}
