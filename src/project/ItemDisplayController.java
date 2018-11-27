package project;

import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

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

	/*
	 * think as alternating turns
	 * 0 is ingredients
	 * 1 is instructions
	 */
	private int n = 0;

	public void initialize() {
		if(n == 0) { // ingredients
			String[] name = Game.splitName(RecipeController.curIG.printList());
			String[] amt = Game.splitNumber(RecipeController.curIG.printList());

			title.setText("Ingredients");
			num.setText("Amt");

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

			n = 1;
		}else if(n == 1) {
			String[] s = Game.steps(RecipeController.curIS);

			nam1.setText(s[0]);
			nam2.setText(s[1]);
			nam3.setText(s[2]);
			nam4.setText(s[3]);
			nam5.setText(s[4]);
			nam6.setText(s[5]);
			
			num1.setText("1");
			num2.setText("2");
			num3.setText("3");
			num4.setText("4");
			num5.setText("");
			num6.setText("");
			
			if(s[4] != "") {
				num5.setText("5");
			}
			
			if(s[5] != "") {
				num6.setText("6");
			}
			
			n = 0;
		}else {

		}

		/*
		 * running a timer to go on to next scene
		 */
		TimerTask task = new TimerTask() {
			@Override
			public void run() {
				System.exit(0); 
				try {
					FXMLLoader loader = new FXMLLoader(getClass().getResource("buttonsDisplay.fxml"));
					Parent root;
					root = loader.load();
					Scene scene = new Scene(root);
					Stage stage = new Stage();
					stage.setScene(scene);
					stage.show();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};

		/*
		 * timer detail
		 */
		Timer timer = new Timer();
		long delay = DifficultyMenuController.duration; 

		timer.schedule(task, delay);	

	}
}