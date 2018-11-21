package project;

import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.text.Font;

public class IngredientDisplayController {

	@FXML
	private Label Ing1;
	@FXML
	private Label Ing2;
	@FXML
	private Label Ing3;
	@FXML
	private Label Ing4;
	@FXML
	private Label Ing5;
	@FXML
	private Label Ing6;

	public void initialize() {
		String[] a = RecipeController.curArray;

		Ing1.setText(a[0]);
		Ing2.setText(a[1]);
		Ing3.setText(a[2]);
		Ing4.setText(a[3]);
		Ing5.setText(a[4]);
		Ing6.setText(a[5]);
		
		TimerTask task = new TimerTask() {
			@Override
			public void run() {
				System.exit(0); // will change to other function
			}
		};


		Timer timer = new Timer();
		long delay = 5000;

		timer.schedule(task, delay);	

	}
}