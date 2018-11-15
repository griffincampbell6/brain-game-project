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
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;

public class RecipeController implements Initializable {
	
	// strings for fxml file names
	private static String DIFF_MENU = "DifficultyMenu.fxml";
	private static String RECIPE_DISPLAY = "ingredientDisplay.fxml";
	
	// strings for image file paths
	private static String SC_IMG = "resources/images/products/sugarcookies.jpeg";
	private static String CC_IMG = "resources/images/products/chocolatecake.jpg";
	private static String CCC_IMG = "resources/images/products/chocolatechipcookies.jpg";
	private static String BB_IMG = "resources/images/products/bananabread.jpg";
	private static String WB_IMG = "resources/images/products/whitebread.jpg";
	private static String FC_IMG = "resources/images/products/fancycake.jpg";
	
	// fxml buttons for interaction
	@FXML private Button backBtn;
	@FXML private Button sugarCookiesBtn;
	@FXML private Button chocolateCakeBtn;
	@FXML private Button chocolateCookiesBtn;
	@FXML private Button bananaBreadBtn;
	@FXML private Button whiteBreadBtn;
	@FXML private Button fancyCakeBtn;
	
	// fxml panes for interaction
	@FXML private Pane sugarCookiesPane;
	@FXML private Pane chocolateCakePane;
	@FXML private Pane chocolateCookiesPane;
	@FXML private Pane bananaBreadPane;
	@FXML private Pane whiteBreadPane;
	@FXML private Pane fancyCakePane;
	
	// fxml imageview that holds recipe image
	@FXML private ImageView recipeImage;
	
	// fxml hbox that holds stars
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
				
				/*
				 * created polygon using online graphing calculator 
				 * https://www.desmos.com/calculator/kevy2m9ikh
				 * initially made it right side up since i forgot how
				 * the x and y were ordered
				 */
				Polygon star = new Polygon();
				star.getPoints().addAll(new Double[] {
						15.0, 80.0,
						25.0, 50.0,
						0.0, 30.0,
						30.0, 30.0,
						40.0, 0.0,
						50.0, 30.0,
						80.0, 30.0,
						55.0, 50.0,
						65.0, 80.0,
						40.0, 60.0,
						15.0, 80.0
				});
				star.setFill(Color.YELLOW);
				star.setStroke(Color.BLACK);
				starBox.getChildren().add(star);
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
	private void loadRecipe(Button button) {
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
			loadRecipe(sugarCookiesBtn);
		}));
		
		/*
		 * CHOCHOLATE CAKE BUTTON EVENTS
		 * changes recipe pane background color
		 * action event load recipe 
		 * TODO add recipe images
		 */
		chocolateCakeBtn.setOnMouseEntered((event -> {
			starDisplay("Chocolate Cake");
			loadRecipeImage(CC_IMG);
			chocolateCakePane.setStyle("-fx-background-color: #00FFFF");
		}));
		chocolateCakeBtn.setOnMouseExited((event -> {
			starDisplay(null);
			loadRecipeImage(null);
			chocolateCakePane.setStyle("-fx-background-color: #ffffff");
		}));
		chocolateCakeBtn.setOnAction((event -> {
			loadRecipe(chocolateCakeBtn);
		}));
		
		/*
		 * CHOCOLATE CHIP COOKIES BUTTON EVENTS
		 * changes recipe pane background color
		 * action event to load recipe
		 * TODO add recipe images
		 */
		chocolateCookiesBtn.setOnMouseEntered((event -> {
			starDisplay("Chocolate Chip Cookies");
			loadRecipeImage(CCC_IMG);
			chocolateCookiesPane.setStyle("-fx-background-color: #00FFFF");
		}));
		chocolateCookiesBtn.setOnMouseExited((event -> {
			starDisplay(null);
			loadRecipeImage(null);
			chocolateCookiesPane.setStyle("-fx-background-color: #ffffff");
		}));
		chocolateCookiesBtn.setOnAction((event -> {
			loadRecipe(chocolateCookiesBtn);
		}));
		
		/*
		 * BANANA BREAD BUTTON EVENTS
		 * changes recipe pane background color
		 * action event to load recipe
		 * TODO add recipe images
		 */
		bananaBreadBtn.setOnMouseEntered((event -> {
			starDisplay("Banana Bread");
			loadRecipeImage(BB_IMG);
			bananaBreadPane.setStyle("-fx-background-color: #00FFFF");
		}));
		bananaBreadBtn.setOnMouseExited((event -> {
			starDisplay(null);
			loadRecipeImage(null);
			bananaBreadPane.setStyle("-fx-background-color: #ffffff");
		}));
		bananaBreadBtn.setOnAction((event -> {
			loadRecipe(bananaBreadBtn);
		}));
		
		/*
		 * WHITE BREAD BUTTON EVENTS
		 * changes recipe pane background color
		 * action event to load recipe
		 * TODO add recipe images
		 */
		whiteBreadBtn.setOnMouseEntered((event -> {
			starDisplay("White Bread");
			loadRecipeImage(WB_IMG);
			whiteBreadPane.setStyle("-fx-background-color: #00FFFF");
		}));
		whiteBreadBtn.setOnMouseExited((event -> {
			starDisplay(null);
			loadRecipeImage(null);
			whiteBreadPane.setStyle("-fx-backgroun-color: #ffffff");
		}));
		whiteBreadBtn.setOnAction((event -> {
			loadRecipe(whiteBreadBtn);
		}));
		
		/*
		 * FANCY CAKE BUTTON EVENTS
		 * changes recipe pane background color
		 * action event to load recipe
		 * TODO add recipe images
		 */
		fancyCakeBtn.setOnMouseEntered((event -> {
			starDisplay("Fancy Cake");
			loadRecipeImage(FC_IMG);
			fancyCakePane.setStyle("-fx-background-color: #00FFFF");
		}));
		fancyCakeBtn.setOnMouseExited((event -> {
			starDisplay(null);
			loadRecipeImage(null);
			fancyCakePane.setStyle("-fx-backgroun-color: #ffffff");
		}));
		fancyCakeBtn.setOnAction((event -> {
			loadRecipe(fancyCakeBtn);
		}));
	}
}
 