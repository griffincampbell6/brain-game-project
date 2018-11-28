package project;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
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

	// Image Paths
	private static String FROSTING_IMG = "resources/images/IMG_0751.PNG";
	private static String WATER_IMG = "resources/images/IMG_0752.PNG";
	private static String SALT_IMG = "resources/images/IMG_0753.PNG";
	private static String PEPPER_IMG = "resources/images/IMG_0755.PNG";
	private static String SPRINKLE_IMG = "resources/images/IMG_0756.PNG";
	private static String COCOA_IMG = "resources/images/IMG_0757.PNG";
	private static String EGG_IMG = "resources/images/IMG_0758.PNG";
	private static String BUTTER_IMG = "resources/images/IMG_0759.PNG";
	private static String SUGAR_IMG = "resources/images/IMG_0760.PNG";
	private static String FLOUR_IMG = "resources/images/IMG_0761.PNG";

	// Storing choices
	Map<String, Integer> ig = new HashMap<>();
	myQueue<String> is = new myQueue<>();

	/**
	 * Displaying the image based on the amount of the IG/IS
	 */
	public void initialize() {
		String[] name = Game.splitName(RecipeController.curIG.printList());
		String[] s = Game.steps(RecipeController.curIS);
		int size = -1;

		for(int i = name.length-1; i >=0; i--) {
			if(name[i] != "") {
				size = i+1;
				break;
			}
		}

		if(RecipeController.curDis == 0) {
			if(size == 4) {

			}

			RecipeController.curDis = 1;
		}else if(RecipeController.curDis == 0) {


			RecipeController.curDis = 0;
		}else {

		}

		/*
		 * testing delay using threads
		 */
		delay(DifficultyMenuController.duration, () -> {
			try {
				Parent root =  FXMLLoader.load(getClass().getResource("selectionDisplay.fxml"));
				Scene scene = new Scene(root);
				Stage stage = (Stage) gPane.getScene().getWindow();
				stage.setScene(scene);
			} catch (IOException e) {
				// TODO Auto-generated catch block
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
