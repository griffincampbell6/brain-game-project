package project;

import java.io.File;
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
		
		sugarCookiesBtn.setOnMouseEntered((event -> {
			sugarCookiesPane.setStyle("-fx-background-color: #00FFFF");
			
		}));
		sugarCookiesBtn.setOnMouseExited((event -> {
			sugarCookiesPane.setStyle("-fx-backgroun-color: #ffffff");
		}));
		
	}

}
 