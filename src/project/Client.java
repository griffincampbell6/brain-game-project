package project;



import javafx.application.Application;
import javafx.fxml.FXMLLoader;

import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Client extends Application {
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		/**
		 * loads start menu
		 * root is set to start menu fxml file
		 */
		FXMLLoader loader = new FXMLLoader(getClass().getResource("StartMenu.fxml"));
		Parent root = loader.load();
		Scene scene = new Scene(root, 1280, 720);
		
		/*
		 * window size can only be 1280x720 for now
		 */
		primaryStage.setTitle("Cooking Game");
		primaryStage.setScene(scene);
		primaryStage.setMinHeight(720);
		primaryStage.setMinWidth(1280);
		primaryStage.setMaxHeight(720);
		primaryStage.setMaxWidth(1280);
		primaryStage.show();
	}
}
