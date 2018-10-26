package project;

<<<<<<< HEAD
import javafx.*;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.event.*;
=======
import java.util.Queue;
>>>>>>> branch 'master' of https://eagle.cs.wit.edu/campbellg4/brain-game-project.git

/**
 * TESTING
 * @author Griffin Campbell, Martin Cheung, Sarah Kaczynski
 *
 * @param <K>
 * @param <V>
 */
<<<<<<< HEAD
public class Recipe_Book extends Application implements EventHandler<ActionEvent>{
	private static RecipeLL_Node head, tail, n;
=======
public class Recipe_Book<K extends RecipeLL_Node, V extends Queue<String>> implements IngredAndSteps<K,V> {
	final private K key;
	final private V value;
>>>>>>> branch 'master' of https://eagle.cs.wit.edu/campbellg4/brain-game-project.git

	public Recipe_Book(K key, V value) {
		this.key = key;
		this.value = value;
	}

	@Override
	public K getKey() {
		return key;
	}
<<<<<<< HEAD
	
	private static void printLL(RecipeLL_Node h) {
		String name = "";
		String ingredient = "";
		
		if(h != null) {
			name = String.format("%s:", h.getIngred());
		}
		
		for(RecipeLL_Node n = h.getNext(); n != null; n = n.getNext()) {
			ingredient += String.format("%s ", n.toString());
		}
		
		System.out.format("%s%n%-5s%s", name, "", ingredient);
	}
	
	
	public static void main(String[] args){
		createCake();
		launch(args);
=======

	@Override
	public V getValue() {
		return value;
>>>>>>> branch 'master' of https://eagle.cs.wit.edu/campbellg4/brain-game-project.git
	}
	
	Button createCake;

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("Recipe Book");
		
		Button flourButton = new Button();
		flourButton.setLayoutX(20);
		flourButton.setLayoutY(20);
		flourButton.setText("Flour");
		Button eggButton = new Button();
		eggButton.setLayoutX(50);
		eggButton.setLayoutY(20);
		eggButton.setText("Egg");
		Button butterButton = new Button();
		butterButton.setText("Butter");
		Button sugarButton = new Button();
		sugarButton.setText("Sugar");
		createCake = new Button();
		createCake.setText("Create Cake");
		
		createCake.setOnAction((ActionEvent e) -> {
			System.out.println("Cake created!");
		});
		
		StackPane stack = new StackPane();
		stack.getChildren().add(flourButton);
		stack.getChildren().add(eggButton);
		stack.getChildren().add(butterButton);
		stack.getChildren().add(sugarButton);
		stack.getChildren().add(createCake);
		
		
		Scene scene = new Scene(stack, 400, 400);
		primaryStage.setScene(scene);
		primaryStage.show();
		
		createCake.setOnAction(this);
	}

	/*@Override
	public void handle(ActionEvent event) {
		if(event.getSource() == createCake) {
			System.out.println("Cake created!");
		}
		
	}*/
}

