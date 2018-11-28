package project;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 * Image selection for the memory game
 * 
 * @author Griffin Campbell, Martin Cheung, Sarah Kaczynski
 */
public class SelectionDisplayController {

	@FXML private GridPane gPane;

	// Display 4 Images
	@FXML private ImageView loc11; 
	@FXML private ImageView loc31; 
	@FXML private ImageView loc13; 
	@FXML private ImageView loc33; 

	// Display 5 Images with 4 images
	@FXML private ImageView loc22;

	// Display 6 Images 
	@FXML private ImageView loc10; 
	@FXML private ImageView loc12; 
	@FXML private ImageView loc14; 
	@FXML private ImageView loc30; 
	@FXML private ImageView loc32; 
	@FXML private ImageView loc34;

	// Storing choices
	protected static Map<String, Integer> userIG = new HashMap<>();
	protected static myQueue<String> userIS = new myQueue<>();

	/**
	 * Displaying the image based on the amount of the IG/IS
	 */
	public void initialize() {
		String[] s = Game.queueToArray(RecipeController.curImg);
		resetGrid();
		
		if(RecipeController.curDis == 0) {
			if(s.length/2 == 4) {
				try {
					loc11.setImage(new Image(new FileInputStream(s[0])));
					loc31.setImage(new Image(new FileInputStream(s[1])));
					loc13.setImage(new Image(new FileInputStream(s[2])));
					loc33.setImage(new Image(new FileInputStream(s[3])));
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				}
			}else if(s.length/2 == 5) {
				try {
					loc11.setImage(new Image(new FileInputStream(s[0])));
					loc31.setImage(new Image(new FileInputStream(s[1])));
					loc13.setImage(new Image(new FileInputStream(s[2])));
					loc33.setImage(new Image(new FileInputStream(s[3])));
					loc22.setImage(new Image(new FileInputStream(s[4])));
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				}
			}else if(s.length/2 == 6) {
				try {
					loc10.setImage(new Image(new FileInputStream(s[0])));
					loc12.setImage(new Image(new FileInputStream(s[1])));
					loc14.setImage(new Image(new FileInputStream(s[2])));
					loc32.setImage(new Image(new FileInputStream(s[3])));
					loc30.setImage(new Image(new FileInputStream(s[4])));
					loc34.setImage(new Image(new FileInputStream(s[5])));
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				}
			}else {
				//epmty
			}

			/*
			 * testing delay using threads
			 */
			delay(DifficultyMenuController.duration, () -> {
				try {
					Parent root =  FXMLLoader.load(getClass().getResource("itemDisplay.fxml"));
					Scene scene = new Scene(root);
					Stage stage = (Stage) gPane.getScene().getWindow();
					stage.setScene(scene);
				} catch (IOException e) {
					e.printStackTrace();
				}
			});

			RecipeController.curDis = 1;
		}else if(RecipeController.curDis == 1) {
			if(s.length/2 == 4) {
				try {
					loc31.setImage(new Image(new FileInputStream(s[7])));
					loc33.setImage(new Image(new FileInputStream(s[6])));
					loc11.setImage(new Image(new FileInputStream(s[5])));
					loc13.setImage(new Image(new FileInputStream(s[4])));
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				}
			}else if(s.length/2 == 5) {
				try {
					loc13.setImage(new Image(new FileInputStream(s[9])));
					loc22.setImage(new Image(new FileInputStream(s[8])));
					loc11.setImage(new Image(new FileInputStream(s[7])));
					loc31.setImage(new Image(new FileInputStream(s[6])));
					loc33.setImage(new Image(new FileInputStream(s[5])));
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				}
			}else if(s.length/2 ==6) {
				try {
					loc12.setImage(new Image(new FileInputStream(s[11])));
					loc32.setImage(new Image(new FileInputStream(s[10])));
					loc14.setImage(new Image(new FileInputStream(s[9])));
					loc34.setImage(new Image(new FileInputStream(s[8])));
					loc10.setImage(new Image(new FileInputStream(s[7])));
					loc30.setImage(new Image(new FileInputStream(s[6])));
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				}
			}else {
				//empty
			}

			/*
			 * testing delay using threads
			 */
			delay(DifficultyMenuController.duration, () -> {
				try {
					Parent root =  FXMLLoader.load(getClass().getResource("EndScreen.fxml"));
					Scene scene = new Scene(root);
					Stage stage = (Stage) gPane.getScene().getWindow();
					stage.setScene(scene);
				} catch (IOException e) {
					e.printStackTrace();
				}
			});
		}else {
			//empty
		}
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

	/**
	 * When the player clicked on an image on either IG or IS:
	 * IG: stores the selection in a map, (name of ingredient, amount)
	 * IS: stores in a queue, the order in which it needs to be in
	 * @param event on mouse clicked
	 */
	@FXML
	private void add(MouseEvent event) {

	}

	/**
	 * When the cursor moved away from the image view box,
	 * display the image itself
	 * @param event
	 */
	@FXML
	private void displayImg(MouseEvent event) {

	}

	/**
	 * When the cursor moved into the image view box,
	 * display the name represented by the image
	 * @param event on mouse enter
	 */
	@FXML
	private void displayName(MouseEvent event) {

	}

	/**
	 * Not sure it it is necessary, but clear all the existing images
	 */
	private void resetGrid() {
		loc11.setImage(null);
		loc31.setImage(null);
		loc13.setImage(null);
		loc33.setImage(null);
		loc10.setImage(null);
		loc22.setImage(null);
		loc12.setImage(null);
		loc14.setImage(null);
		loc30.setImage(null);
		loc32.setImage(null);
		loc34.setImage(null);
	}
}
