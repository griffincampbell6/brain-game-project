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
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * This scene allows the user to choose 3 difficulty level; 
 * each difficulty allocates separate amount of time for each game.
 * 
 * @author Griffin Campbell, Martin Cheung, Sarah Kaczynski
 */
public class DifficultyMenuController implements Initializable {
	@FXML private Button easyBtn;
	@FXML private Button mediumBtn;
	@FXML private Button hardBtn;
	@FXML private Button backBtn;

	@FXML private Pane easyBtnPane;
	@FXML private Pane mediumBtnPane;
	@FXML private Pane hardBtnPane;
	@FXML private Pane backBtnPane;

	@FXML private Pane easyPane;
	@FXML private Pane mediumPane;
	@FXML private Pane hardPane;

	@FXML private Text easyHover;
	@FXML private Text mediumHover;
	@FXML private Text hardHover;

	@FXML private Text easyDetails;
	@FXML private Text mediumDetails;
	@FXML private Text hardDetails;


	private static String START_MENU = "StartMenu.fxml";
	private static String RECIPES_MENU = "RecipesMenu.fxml";

	protected static long duration;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {

		/*
		 * BACK BUTTON EVENT
		 * loads previous start screen
		 */
		backBtn.setOnMouseEntered((event -> {
			backBtnPane.setStyle("-fx-background-color: #e38d9c; -fx-border-color: #000000;"
					+ " -fx-border-radius: 10; -fx-background-radius: 10; -fx-border-width: 2;");
		}));
		backBtn.setOnMouseExited((event -> {
			backBtnPane.setStyle("-fx-background-color:  #f5d7dc; -fx-border-color: #000000;"
					+ " -fx-border-radius: 10; -fx-background-radius: 10; -fx-border-width: 2;");
		}));
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
		 * EASY BUTTON EVENTS
		 * loads recipes menu
		 * reveals difficulty details
		 * TODO add functionality to time given
		 */
		easyPane.setOnMouseEntered((event -> {
			fullPaneEnter(easyHover, easyDetails);
		}));
		easyPane.setOnMouseExited((event -> {
			fullPaneExit(easyHover, easyDetails);
		}));
		easyBtn.setOnMouseEntered((event -> {
			ButtonPaneEnter(easyBtnPane);
		}));
		easyBtn.setOnMouseExited((event -> {
			buttonPaneExit(easyBtnPane);
		}));
		easyBtn.setOnAction((event -> {
			loadNext();
			duration = 60000;
		}));

		/*
		 * MEDIUM BUTTON EVENTS
		 * loads recipes menu
		 * reveals difficulty details
		 * TODO add functionality to time given
		 */
		mediumPane.setOnMouseEntered((event -> {
			fullPaneEnter(mediumHover, mediumDetails);
		}));
		mediumPane.setOnMouseExited((event -> {
			fullPaneExit(mediumHover, mediumDetails);
		}));
		mediumBtn.setOnMouseEntered((event -> {
			ButtonPaneEnter(mediumBtnPane);
		}));
		mediumBtn.setOnMouseExited((event -> {
			buttonPaneExit(mediumBtnPane);
		}));
		mediumBtn.setOnAction((event -> {
			loadNext();
			duration = 45000;
		}));

		/*
		 * HARD BUTTON EVENTS
		 * loads recipes menu
		 * reveals difficulty details
		 * TODO add functionality to time given
		 */
		hardPane.setOnMouseEntered((event -> {
			fullPaneEnter(hardHover, hardDetails);
		}));
		hardPane.setOnMouseExited((event -> {
			fullPaneExit(hardHover, hardDetails);
		}));
		hardBtn.setOnMouseEntered((event -> {
			ButtonPaneEnter(hardBtnPane);
		}));
		hardBtn.setOnMouseExited((event -> {
			buttonPaneExit(hardBtnPane);
		}));
		hardBtn.setOnAction((event -> {
			loadNext();
			duration = 30000;
		}));

	}

	/**
	 * method to style panes with
	 * mouse enter
	 * @param pane of button
	 */
	private void ButtonPaneEnter(Pane pane) {
		pane.setStyle("-fx-background-color: #e38d9c; -fx-border-color: #000000;"
				+ " -fx-border-width: 2 1 2 2; -fx-border-radius: 10 0 0 10;"
				+ "-fx-background-radius: 10 0 0 10");
	}

	/**method to styke pabes with
	 * mouse exit
	 * 
	 * @param pane of button
	 */
	private void buttonPaneExit(Pane pane) {
		pane.setStyle("-fx-background-color: #f5d7dc;"
				+ "-fx-border-color: #000000; -fx-border-width: 2 1 2 2; "
				+ "-fx-border-width: 2 1 2 2; -fx-border-radius: 10 0 0 10; "
				+ "-fx-border-width: 2 1 2 2; -fx-border-radius: 10 0 0 10;");
	}

	/**
	 * method to reveal difficulty detail text box
	 * and hid "hover here" text box
	 * @param hover
	 * @param details
	 */
	private void fullPaneEnter(Text hover, Text details) {
		hover.setStyle("-fx-opacity: 0");
		details.setStyle("-fx-opacity: 1");
	}

	/**
	 * method to reveal "hover here" text box 
	 * and hive difficulty detail text box
	 * @param hover
	 * @param details
	 */
	private void fullPaneExit(Text hover, Text details){
		hover.setStyle("-fx-opacity: 1");
		details.setStyle("-fx-opacity: 0");
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
