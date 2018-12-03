package project;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

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

	// Storing name of the image (naive way)
	String[] s = setToArray(RecipeController.curImg.keySet());
	private String name11;
	private String name31;
	private String name13;
	private String name33;
	private String name22;
	private String name10;
	private String name12;
	private String name14;
	private String name30;
	private String name32;
	private String name34;

	// Storing choices
	protected static Map<String, Integer> userIG = new HashMap<String, Integer>();
	protected static myQueue<String> userIS = new myQueue<>();

	/**
	 * Displaying the image based on the amount of the IG/IS
	 */
	public void initialize() {
		reset();
		
		if(RecipeController.curDis == 0) {
			if(s.length/2 == 4) {
				try {
					loc11.setImage(new Image(new FileInputStream(s[0])));
					loc31.setImage(new Image(new FileInputStream(s[1])));
					loc13.setImage(new Image(new FileInputStream(s[2])));
					loc33.setImage(new Image(new FileInputStream(s[3])));

					name11 = RecipeController.curImg.get(s[0]);
					name31 = RecipeController.curImg.get(s[1]);
					name13 = RecipeController.curImg.get(s[2]);
					name33 = RecipeController.curImg.get(s[3]);
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

					name11 = RecipeController.curImg.get(s[0]);
					name31 = RecipeController.curImg.get(s[1]);
					name13 = RecipeController.curImg.get(s[2]);
					name33 = RecipeController.curImg.get(s[3]);
					name22 = RecipeController.curImg.get(s[4]);
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

					name10 = RecipeController.curImg.get(s[0]);
					name12 = RecipeController.curImg.get(s[1]);
					name14 = RecipeController.curImg.get(s[2]);
					name30 = RecipeController.curImg.get(s[3]);
					name32 = RecipeController.curImg.get(s[4]);
					name34 = RecipeController.curImg.get(s[5]);

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
					RecipeController.curDis = 1;
					Parent root =  FXMLLoader.load(getClass().getResource("itemDisplay.fxml"));
					Scene scene = new Scene(root);
					Stage stage = (Stage) gPane.getScene().getWindow();
					stage.setScene(scene);
				} catch (IOException e) {
					e.printStackTrace();
				}
			});

		}else if(RecipeController.curDis == 1) {
			if(s.length/2 == 4) {
				try {
					loc31.setImage(new Image(new FileInputStream(s[7])));
					loc33.setImage(new Image(new FileInputStream(s[6])));
					loc11.setImage(new Image(new FileInputStream(s[5])));
					loc13.setImage(new Image(new FileInputStream(s[4])));

					name31 = RecipeController.curImg.get(s[7]);
					name33 = RecipeController.curImg.get(s[6]);
					name11 = RecipeController.curImg.get(s[5]);
					name13 = RecipeController.curImg.get(s[4]);
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

					name13 = RecipeController.curImg.get(s[9]);
					name22 = RecipeController.curImg.get(s[8]);
					name11 = RecipeController.curImg.get(s[7]);
					name31 = RecipeController.curImg.get(s[6]);
					name33 = RecipeController.curImg.get(s[5]);
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

					name12 = RecipeController.curImg.get(s[11]);
					name32 = RecipeController.curImg.get(s[10]);
					name14 = RecipeController.curImg.get(s[9]);
					name34 = RecipeController.curImg.get(s[8]);
					name10 = RecipeController.curImg.get(s[7]);
					name30 = RecipeController.curImg.get(s[6]);
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
	 * Convert a set of string to an array of string
	 * @param s string set, that is for url
	 * @return an array of image url
	 */
	private String[] setToArray(Set<String> s) {
		int n = s.size(); 
		String arr[] = new String[n]; 

		int i = 0; 
		for (String x : s) 
			arr[i++] = x; 

		return arr;
	}

	@FXML
	public void add10(MouseEvent event) {
		add(name10);
	}

	@FXML
	public void add11(MouseEvent event) {
		add(name11);
	}

	@FXML
	public void add12(MouseEvent event) {
		add(name12);
	}

	@FXML
	public void add13(MouseEvent event) {
		add(name13);
	}

	@FXML
	public void add14(MouseEvent event) {
		add(name14);
	}

	@FXML
	public void add22(MouseEvent event) {
		add(name22);
	}

	@FXML
	public void add30(MouseEvent event) {
		add(name30);
	}

	@FXML
	public void add31(MouseEvent event) {
		add(name31);
	}

	@FXML
	public void add32(MouseEvent event) {
		add(name32);
	}

	@FXML
	public void add33(MouseEvent event) {
		add(name33);
	}

	@FXML
	public void add34(MouseEvent event) {
		add(name34);
	}

	private void add(String key) {
		if(RecipeController.curDis == 0) {			
			if (!(userIG.containsKey((key)))) {
				userIG.put(key, 1);
			}else {
				Integer total = userIG.get(key);

				total++;
				userIG.put(key, total);
			}
		}else if(RecipeController.curDis == 1) {
			userIS.add(key);
		}
		else {
			//empty
		}
	}

	/**
	 * Not sure it it is necessary, but clear all the existing images
	 */
	private void reset() {
		if(RecipeController.curDis == 0) {
			userIG.clear();
		}else if(RecipeController.curDis == 1) {
			userIS.removeAll();
		}else {
			//empty
		}
		
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
