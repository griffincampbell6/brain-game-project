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
	@FXML private Button breadWhiteBtn;
	@FXML private Button fancyCakeBtn;
	
	@FXML private Pane sugarCookiesPane;
	@FXML private Pane chocolateCakePane;
	@FXML private Pane chocolateCookiesPane;
	@FXML private Pane bananaBreadPane;
	@FXML private Pane breadWhitePane;
	@FXML private Pane fancyCakePane;
	
	@FXML private ImageView recipeImage;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {

		/*
		 * SUGAR COOKIE BUTTON EVENT
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
		
		/*
		 * SUGAR COOKKIE BUTTON EVENT
		 */
		sugarCookiesBtn.setOnMouseExited((event -> {
			sugarCookiesPane.setStyle("-fx-backgroun-color: #ffffff");
			recipeImage.setImage(null);
		}));
		
		/*
		 * CHOCHOLATE CAKE BUTTON EVENT
		 */
		chocolateCakeBtn.setOnMouseEntered((event -> {
			
		}));
		
		/*
		 * CHOCHOLATE CAKE BUTTON EVENT
		 */
		chocolateCakeBtn.setOnMouseExited((event -> {
			
		}));
		
		/*
		 * CHOCOLATE CHIP COOKIES BUTTON EVENT
		 */
		chocolateCookiesBtn.setOnMouseEntered((event -> {
			
		}));
		
		/*
		 * CHOCOLATE CHIP COOKIE BUTTON EVENT
		 */
		chocolateCookiesBtn.setOnMouseExited((event -> {
			
		}));
		
		
	}

}
 