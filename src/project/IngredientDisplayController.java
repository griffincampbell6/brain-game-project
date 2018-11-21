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
		TimerTask task = new TimerTask() {
			@Override
			public void run() {
				String[] a = RecipeController.curArray;

				for(int i = 0; i < a.length; i++) {
					System.out.println(a[i]);
				}

				Ing1.setText(a[0]);
				Ing2.setText(a[1]);
				Ing3.setText(a[2]);
				Ing4.setText(a[3]);
				Ing5.setText(a[4]);
				Ing6.setText(a[5]);

				System.exit(0); // will change to other function
			}
		};


		Timer timer = new Timer();
		long delay = 5000;

		timer.schedule(task, delay);	

	}
}