package project;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class EndScreenController {
    @FXML
    private Label lblIGResult;
    @FXML
    private Label lblISResult;
	
	public void displayResult(){
		if(Game.isIGCorrect) {
			lblIGResult.setText("Horray! You have all ingredients correct!");
		}else {
			lblIGResult.setText("Oops! You do not have the correct ingredient for the recipe.");
		}
		
		if(Game.isISCorrect) {
			lblISResult.setText("Horray! You have all steps correct!");
		}else {
			lblISResult.setText("Oops! You do not have the correct steps for the recipe.");
		}
	}
}
