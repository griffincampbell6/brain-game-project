package project;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

public class RecipeController implements Initializable {
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

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {

		/*
		 * SUGAR COOKIE BUTTON EVENTS
		 */
		sugarCookiesBtn.setOnMouseEntered((event -> {
			sugarCookiesPane.setStyle("-fx-background-color: #00FFFF");
			try {
				FileInputStream input = new FileInputStream("resources/images/sugarcookies.jpeg");
				Image image = new Image(input);
				recipeImage.setImage(image);
				
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		}));
		sugarCookiesBtn.setOnMouseExited((event -> {
			sugarCookiesPane.setStyle("-fx-backgroun-color: #ffffff");
			recipeImage.setImage(null);
		}));
		sugarCookiesBtn.setOnAction((event -> {
			//TODO
		}));
		
		/*
		 * CHOCHOLATE CAKE BUTTON EVENTS
		 */
		chocolateCakeBtn.setOnMouseEntered((event -> {
			chocolateCakePane.setStyle("-fx-background-color: #00FFFF");
		}));
		chocolateCakeBtn.setOnMouseExited((event -> {
			chocolateCakePane.setStyle("-fx-backgroun-color: #ffffff");
		}));
		chocolateCakeBtn.setOnAction((event -> {
			//TODO
		}));
		
		/*
		 * CHOCOLATE CHIP COOKIES BUTTON EVENTS
		 */
		chocolateCookiesBtn.setOnMouseEntered((event -> {
			chocolateCookiesPane.setStyle("-fx-background-color: #00FFFF");
		}));
		chocolateCookiesBtn.setOnMouseExited((event -> {
			chocolateCookiesPane.setStyle("-fx-backgroun-color: #ffffff");
		}));
		chocolateCookiesBtn.setOnAction((event -> {
			//TODO
		}));
		
		/*
		 * BANANA BREAD BUTTON EVENTS
		 */
		bananaBreadBtn.setOnMouseEntered((event -> {
			bananaBreadPane.setStyle("-fx-background-color: #00FFFF");
		}));
		bananaBreadBtn.setOnMouseExited((event -> {
			bananaBreadPane.setStyle("-fx-backgroun-color: #ffffff");
		}));
		bananaBreadBtn.setOnAction((event -> {
			//TODO
		}));
		
		/*
		 * WHITE BREAD BUTTON EVENTS
		 */
		whiteBreadBtn.setOnMouseEntered((event -> {
			whiteBreadPane.setStyle("-fx-background-color: #00FFFF");
		}));
		whiteBreadBtn.setOnMouseExited((event -> {
			whiteBreadPane.setStyle("-fx-backgroun-color: #ffffff");
		}));
		whiteBreadBtn.setOnAction((event -> {
			//TODO
		}));
		
		/*
		 * FANCY CAKE BUTTON EVENTS
		 */
		fancyCakeBtn.setOnMouseEntered((event -> {
			fancyCakePane.setStyle("-fx-background-color: #00FFFF");
		}));
		fancyCakeBtn.setOnMouseExited((event -> {
			fancyCakePane.setStyle("-fx-backgroun-color: #ffffff");
		}));
		fancyCakeBtn.setOnAction((event -> {
			//TODO
		}));
	}

}
 