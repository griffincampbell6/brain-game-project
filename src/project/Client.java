package project;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Client extends Application  {

	private static String START_MENU = "StartMenu.fxml";


	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		try {
			Recipe.setUp(); // create the recipe

			/**
			 * loads start menu
			 * root is set to start menu fxml file
			 */			
			FXMLLoader loader = new FXMLLoader(getClass().getResource(START_MENU));
			Parent root = loader.load();
			Scene scene = new Scene(root);

			primaryStage.setTitle("Cooking Game");
			primaryStage.setScene(scene);
			primaryStage.show();

		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
