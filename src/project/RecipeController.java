package project;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class RecipeController implements Initializable {
	
	private static String DIFF_MENU = "DifficultyMenu.fxml";
	private static String RECIPE_DISPLAY = "ingredientDisplay.fxml";
	
	private static String SC_IMG = "resources/images/sugarcookies.jpeg";
	
	private static String[] sugarCookiesIngr = {"Flour", "Sugar", "Butter", "Water"};
	private static String[] chocolateCakeIngr = {""};
	private static String[] chocolateCookiesIngr = {};
	private static String[] bananaBreadIngr = {};
	private static String[] whiteBreadIngr = {};
	private static String[] fancyCakeIngr = {};
	
	@FXML private Button backBtn;
	@FXML private Button sugarCookiesBtn;
	@FXML private Button chocolateCakeBtn;
	@FXML private Button chocolateCookiesBtn;
	@FXML private Button bananaBreadBtn;
	@FXML private Button whiteBreadBtn;
	@FXML private Button fancyCakeBtn;
	
	@FXML private Pane sugarCookiesPane;
	@FXML private Pane chocolateCakePane;
	@FXML private Pane chocolateCookiesPane;
	@FXML private Pane bananaBreadPane;
	@FXML private Pane whiteBreadPane;
	@FXML private Pane fancyCakePane;
	
	@FXML private ImageView recipeImage;
	
	@FXML private HBox starBox;
	
	/**
	 * method to display stars in recipe menu under recipe image
	 * calls StarRating class for amount of stars
	 * if this method is called with null, it removes stars, using that with mouse exit events
	 * "stars" are circles for now
	 * @param name
	 */
	private void starDisplay(String name) {
		if (name != null) {
			int starAmount = StarRatings.getRatings(name);
			for(int i = 0; i < starAmount; i++) {
				Circle circle = new Circle();
				circle.setRadius(45);
				circle.setFill(Color.YELLOW);
				circle.setStroke(Color.BLACK);
				starBox.getChildren().add(circle);
			}
		}
		else {
			starBox.getChildren().clear();
		}
	}
	
	/**
	 * method to load recipe image
	 * null used for mouse exit events, removes image
	 * @param file name
	 */
	private void loadRecipeImage(String file) {
		if (file != null) {
			try {
				FileInputStream input = new FileInputStream(file);
				Image image = new Image(input);
				recipeImage.setImage(image);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		}
		else {
			recipeImage.setImage(null);
		}
	}
	
	/**
	 * method to load recipe based on button
	 * needs implementaion
	 * @param button
	 */
	private void loadRecipe(Button button, String[] ingredients) {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource(RECIPE_DISPLAY));
			Parent root;
			root = loader.load();
			
			Scene scene = new Scene(root, 1280, 720);
			Stage stage = (Stage) button.getScene().getWindow();
			stage.setScene(scene);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		/*
		 * BACK BUTTON EVENT
		 * loads previous screen
		 */
		backBtn.setOnAction((event -> {
			try {
				FXMLLoader loader = new FXMLLoader(getClass().getResource(DIFF_MENU));
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
		 * SUGAR COOKIE BUTTON EVENTS
		 * changes recipe pane background color
		 * action event to load recipe
		 * TODO add recipe images
		 */
		sugarCookiesBtn.setOnMouseEntered((event -> {
			sugarCookiesPane.setStyle("-fx-background-color: #00FFFF");
			starDisplay("Sugar Cookies");
			loadRecipeImage(SC_IMG);
		}));
		sugarCookiesBtn.setOnMouseExited((event -> {
			sugarCookiesPane.setStyle("-fx-background-color: #ffffff");
			starDisplay(null);
			loadRecipeImage(null);
		}));
		sugarCookiesBtn.setOnAction((event -> {
			loadRecipe(sugarCookiesBtn, sugarCookiesIngr);
		}));
		
		/*
		 * CHOCHOLATE CAKE BUTTON EVENTS
		 * changes recipe pane background color
		 * action event load recipe 
		 * TODO add recipe images
		 */
		chocolateCakeBtn.setOnMouseEntered((event -> {
			starDisplay("Chocolate Cake");
			chocolateCakePane.setStyle("-fx-background-color: #00FFFF");
		}));
		chocolateCakeBtn.setOnMouseExited((event -> {
			starDisplay(null);
			chocolateCakePane.setStyle("-fx-background-color: #ffffff");
		}));
		chocolateCakeBtn.setOnAction((event -> {
			loadRecipe(chocolateCakeBtn, chocolateCakeIngr);
		}));
		
		/*
		 * CHOCOLATE CHIP COOKIES BUTTON EVENTS
		 * changes recipe pane background color
		 * action event to load recipe
		 * TODO add recipe images
		 */
		chocolateCookiesBtn.setOnMouseEntered((event -> {
			starDisplay("Chocolate Chip Cookies");
			chocolateCookiesPane.setStyle("-fx-background-color: #00FFFF");
		}));
		chocolateCookiesBtn.setOnMouseExited((event -> {
			starDisplay(null);
			chocolateCookiesPane.setStyle("-fx-background-color: #ffffff");
		}));
		chocolateCookiesBtn.setOnAction((event -> {
			loadRecipe(chocolateCookiesBtn, chocolateCookiesIngr);
		}));
		
		/*
		 * BANANA BREAD BUTTON EVENTS
		 * changes recipe pane background color
		 * action event to load recipe
		 * TODO add recipe images
		 */
		bananaBreadBtn.setOnMouseEntered((event -> {
			starDisplay("Banana Bread");
			bananaBreadPane.setStyle("-fx-background-color: #00FFFF");
		}));
		bananaBreadBtn.setOnMouseExited((event -> {
			starDisplay(null);
			bananaBreadPane.setStyle("-fx-background-color: #ffffff");
		}));
		bananaBreadBtn.setOnAction((event -> {
			loadRecipe(bananaBreadBtn, bananaBreadIngr);
		}));
		
		/*
		 * WHITE BREAD BUTTON EVENTS
		 * changes recipe pane background color
		 * action event to load recipe
		 * TODO add recipe images
		 */
		whiteBreadBtn.setOnMouseEntered((event -> {
			starDisplay("White Bread");
			whiteBreadPane.setStyle("-fx-background-color: #00FFFF");
		}));
		whiteBreadBtn.setOnMouseExited((event -> {
			starDisplay(null);
			whiteBreadPane.setStyle("-fx-backgroun-color: #ffffff");
		}));
		whiteBreadBtn.setOnAction((event -> {
			loadRecipe(whiteBreadBtn, whiteBreadIngr);
		}));
		
		/*
		 * FANCY CAKE BUTTON EVENTS
		 * changes recipe pane background color
		 * action event to load recipe
		 * TODO add recipe images
		 */
		fancyCakeBtn.setOnMouseEntered((event -> {
			starDisplay("Fancy Cake");
			fancyCakePane.setStyle("-fx-background-color: #00FFFF");
		}));
		fancyCakeBtn.setOnMouseExited((event -> {
			starDisplay(null);
			fancyCakePane.setStyle("-fx-backgroun-color: #ffffff");
		}));
		fancyCakeBtn.setOnAction((event -> {
			loadRecipe(fancyCakeBtn, fancyCakeIngr);
		}));
	}
}
 