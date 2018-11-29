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
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;

/**
 * Allowing the player to select a recipe to play
 * There will be stars to display the amount of words to memorize
 * 
 * @author Griffin Campbell, Martin Cheung, Sarah Kaczynski
 */
public class RecipeController implements Initializable {

	// strings for fxml file names
	private static String DIFF_MENU = "DifficultyMenu.fxml";
	private static String RECIPE_DISPLAY = "itemDisplay.fxml";

	// naive way of passing data
	protected static myLinkedList<Ingredient> curIG;
	protected static myQueue<String> curIS;
	protected static myQueue<String> curImg;
	protected static int curDis;

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
	@FXML private Pane backBtnPane;

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
				 * https://www.desmos.com/calculator/pur7kmpeso
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
	 * @param button
	 */
	private void loadRecipe(Button button) {
		try {
			Parent root =  FXMLLoader.load(getClass().getResource(RECIPE_DISPLAY));
			Scene scene = new Scene(root);
			Stage stage = (Stage) button.getScene().getWindow();
			stage.setScene(scene);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * Things to do on initialize
	 */
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {

		/*
		 * BACK BUTTON EVENT
		 * loads previous screen
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
			sugarCookiesPane.setStyle("-fx-background-color: #e38d9c; -fx-background-radius: 10 10 0 0;");
			starDisplay("Sugar Cookies");
			loadRecipeImage(SC_IMG);
		}));
		sugarCookiesBtn.setOnMouseExited((event -> {
			sugarCookiesPane.setStyle("-fx-background-color: #f5d7dc; -fx-background-radius: 10 10 0 0;");
			starDisplay(null);
			loadRecipeImage(null);
		}));
		sugarCookiesBtn.setOnAction((event -> {
			curDis = 0;
			curImg = Game.sugarCookiesImg();
			curIG = Game.sugarCookiesIG();
			curIS = Game.sugarCookiesIS();
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
			chocolateCakePane.setStyle("-fx-background-color: #e38d9c");
		}));
		chocolateCakeBtn.setOnMouseExited((event -> {
			starDisplay(null);
			loadRecipeImage(null);
			chocolateCakePane.setStyle("-fx-background-color: #f5d7dc");
		}));
		chocolateCakeBtn.setOnAction((event -> {
			curDis = 0;
			curImg = Game.chocolateCakeImg();
			curIG = Game.chocolateCakeIG();
			curIS = Game.chocolateCakeIS();
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
			chocolateCookiesPane.setStyle("-fx-background-color: #e38d9c");
		}));
		chocolateCookiesBtn.setOnMouseExited((event -> {
			starDisplay(null);
			loadRecipeImage(null);
			chocolateCookiesPane.setStyle("-fx-background-color: #f5d7dc");
		}));
		chocolateCookiesBtn.setOnAction((event -> {
			curDis = 0;
			curImg = Game.chocolateChipCookieImg();
			curIG = Game.chocolateChipCookieIG();
			curIS = Game.chocolateChipCookieIS();
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
			bananaBreadPane.setStyle("-fx-background-color: #e38d9c");
		}));
		bananaBreadBtn.setOnMouseExited((event -> {
			starDisplay(null);
			loadRecipeImage(null);
			bananaBreadPane.setStyle("-fx-background-color: #f5d7dc");
		}));
		bananaBreadBtn.setOnAction((event -> {
			curDis = 0;
			curImg = Game.bananaBreadImg();
			curIG = Game.bananaBreadIG();
			curIS = Game.bananaBreadIS();
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
			whiteBreadPane.setStyle("-fx-background-color: #e38d9c");
		}));
		whiteBreadBtn.setOnMouseExited((event -> {
			starDisplay(null);
			loadRecipeImage(null);
			whiteBreadPane.setStyle("-fx-background-color: #f5d7dc");
		}));
		whiteBreadBtn.setOnAction((event -> {
			curDis = 0;
			curImg = Game.whiteBreadImg();
			curIG = Game.whiteBreadIG();
			curIS = Game.whiteBreadIS();
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
			fancyCakePane.setStyle("-fx-background-color: #e38d9c; -fx-background-radius: 0 0 10 10;");
		}));
		fancyCakeBtn.setOnMouseExited((event -> {
			starDisplay(null);
			loadRecipeImage(null);
			fancyCakePane.setStyle("-fx-background-color: #f5d7dc; -fx-background-radius: 0 0 10 10;");
		}));
		fancyCakeBtn.setOnAction((event -> {
			curDis = 0;
			curImg = Game.fancyCakeImg();
			curIG = Game.fancyCakeIG();
			curIS = Game.fancyCakeIS();
			loadRecipe(fancyCakeBtn);
		}));
	}
}