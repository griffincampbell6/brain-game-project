package project;

import java.io.IOException;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 * Display the ingredients or the instructions for the player to memorize
 * 
 * @author Griffin Campbell, Martin Cheung, Sarah Kaczynski
 */
public class ItemDisplayController {

	// Ingredient Name
	@FXML private Label nam1;
	@FXML private Label nam2;
	@FXML private Label nam3;
	@FXML private Label nam4;
	@FXML private Label nam5;
	@FXML private Label nam6;

	// number of ingredient or the step for instruction
	@FXML private Label num1;
	@FXML private Label num2;
	@FXML private Label num3;
	@FXML private Label num4;
	@FXML private Label num5;
	@FXML private Label num6;

	// Ingredient or Instruction
	@FXML private Label title;

	// Step number or amount
	@FXML private Label num;

	@FXML private Pane ap;

	/**
	 * Once the scene is loaded, display:
	 * the ingredients and its amount
	 * or the steps and its ordering
	 */
	public void initialize() {
		if(RecipeController.curDis == 0) { // ingredients
			String[] name = Game.splitName(RecipeController.curIG.printList());
			String[] amt = Game.splitNumber(RecipeController.curIG.printList());
			
			title.setText("Ingredients");
			num.setText("Amount");

			nam1.setText(name[0]);
			nam2.setText(name[1]);
			nam3.setText(name[2]);
			nam4.setText(name[3]);
			nam5.setText(name[4]);
			nam6.setText(name[5]);	

			num1.setText(amt[0]);
			num2.setText(amt[1]);
			num3.setText(amt[2]);
			num4.setText(amt[3]);
			num5.setText(amt[4]);
			num6.setText(amt[5]);
		}else if(RecipeController.curDis == 1) {
			String[] s = Game.queueToArray(RecipeController.curIS);
			
			title.setText("Instructions");
			num.setText("Steps");

			nam1.setText(s[0]);
			nam2.setText(s[1]);
			nam3.setText(s[2]);
			nam4.setText(s[3]);
			nam5.setText("");
			nam6.setText("");
			
			num1.setText("1");
			num2.setText("2");
			num3.setText("3");
			num4.setText("4");
			num5.setText("");
			num6.setText("");

			if(s.length == 5) {
				nam5.setText(s[4]);
				num5.setText("5");
			}

			if(s.length == 6) {
				nam5.setText(s[4]);
				num5.setText("5");
				nam6.setText(s[5]);
				num6.setText("6");
			}
		}else {
			//empty
		}
		
		/*
		 * testing delay using threads
		 */
		delay(DifficultyMenuController.duration, () -> {
			try {
				Parent root =  FXMLLoader.load(getClass().getResource("selectionDisplay.fxml"));
				Scene scene = new Scene(root);
				Stage stage = (Stage) ap.getScene().getWindow();
				stage.setScene(scene);
			} catch (IOException e) {
				e.printStackTrace();
			}
		});
	}

	/**
	 * Let the user to read the IG/IS for n seconds, then change FXML file
	 * https://stackoverflow.com/questions/45130853/javafx-how-can-i-delay-the-display-of-a-new-line-in-my-textarea
	 * @param delayMs the duration of the delay
	 * @param toRun what to do after the delay is up
	 */
	private void delay(long delayMs, Runnable toRun){
		Thread t = new Thread(() ->{
			try { Thread.sleep(delayMs); }catch(InterruptedException ignored){}
			Platform.runLater(toRun);
		});
		t.setDaemon(true);
		t.start();
	}
}