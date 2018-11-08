package project;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class EndScreenController {
	@FXML
	private Label lblIGResult;
	@FXML
	private Label lblISResult;
	@FXML
	private Label lblPlayAgain;
	@FXML
	private Label lblExit;
	
	/**
	 * once the scene begins, display the following message
	 * telling the player whether or not they are correct
	 */
	public void initialize(){
		lblIGResult.setFont(new Font("Tw Cen Mt", 50));
		lblIGResult.setMaxWidth(560);
		lblIGResult.setWrapText(true);
		
		lblISResult.setFont(new Font("Tw Cen Mt", 50));
		lblISResult.setMaxWidth(560);
		lblISResult.setWrapText(true);
		
		if(Game.isIGCorrect) {
			lblIGResult.setText("Horray! You remember them all!");
		}else {
			lblIGResult.setText("Oops! You are incorrect.");
		}

		if(Game.isISCorrect) {
			lblISResult.setText("Horray! You remember them all!");
		}else {
			lblISResult.setText("Oops! You are incorrect.");;
		}
	}
	
	/**
	 * When the player wants to end the game, click here
	 * @param event when the user released a mouse press on the text box
	 */
	@FXML
	public void endGame(MouseEvent event) {
		lblExit.setOnMouseClicked(e -> {
			System.exit(0);
		});
	}
	
	@FXML
	public void playAgain(MouseEvent event) {
		lblPlayAgain.setOnMouseClicked(e -> {
			try {
				Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("DifficultyMenu.fmxl"));
				Scene scene = new Scene(root);
				Stage stage = (Stage) lblPlayAgain.getScene().getWindow();
				stage.setScene(scene);
			} catch(Exception ex) {
				ex.printStackTrace();
			}
		});

	}

	@FXML
	public void increaseSize(MouseEvent event) {
		if(((Label)event.getSource()).getText().equals(lblPlayAgain.getText())){
			lblPlayAgain.setFont(new Font("Sitka Small", 50));
		}else if(((Label)event.getSource()).getText().equals(lblExit.getText())){
			lblExit.setFont(new Font("Sitka Small", 50));
		}else {
			
		}
	}

	@FXML
	public void originalSize(MouseEvent event) {
		if(((Label)event.getSource()).getText().equals(lblPlayAgain.getText())){
			lblPlayAgain.setFont(new Font("Sitka Small", 45));
		}else if(((Label)event.getSource()).getText().equals(lblExit.getText())){
			lblExit.setFont(new Font("Sitka Small", 45));
		}else {
			
		}
	}
}
