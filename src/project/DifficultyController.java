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

public class DifficultyController implements Initializable{
	
	@FXML 
	private Button level1, level2, level3;
	
	//time, in seconds, to display screens according to the difficulty level (easiest -> hardest)
	private static final int TIME_1 = 60;
	private static final int TIME_2 = 30;
	private static final int TIME_3 = 15;
	
	private static int timeChosen = 0;
	
	private static final String RECIPE_MENU = "ingredientDisplay.fxml"; //replace with name of recipe menu file


	@Override
	public void initialize(URL location, ResourceBundle resources) {
		/*
		 * handles exit button press on main menu
		 */
		level1.setOnAction((event -> {
			try {
				System.out.println("easy");
				
			} catch (IOException e){
				e.printStackTrace();
			}
		}));
		
		level2.setOnAction((event -> {
			try {
				System.out.println("medium");
				FXMLLoader loader = new FXMLLoader(getClass().getResource(RECIPE_MENU));
				Parent root;
				root = loader.load();
				Scene scene = new Scene(root, 1280, 720);
				Stage stage = (Stage) startBtn.getScene().getWindow();
				stage.setScene(scene);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}));
		
		level3.setOnAction((event -> {
			try {
				System.out.println("hard");
			} catch (IOException e){
				e.printStackTrace();
			}
		}));
		
	}
	
	public static int getTime() {
		return timeChosen;
	}
}
