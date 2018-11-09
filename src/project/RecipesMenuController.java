package project;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.TilePane;
import javafx.stage.Stage;

public class RecipesMenuController implements Initializable {
	
	//private MenuButton menuB;
	
	private static String ING_DISPLAY = "ingredientDisplay.fxml";
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		/*menuB.setOnAction((event -> {
			try {
				FXMLLoader loader = new FXMLLoader(getClass().getResource(ING_DISPLAY));
				Parent root;
				root = loader.load();
				Scene scene = new Scene(root);
				Stage stage = (Stage) menuB.getScene().getWindow();
				stage.setScene(scene);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}));*/
  
        // create a label 
        Label l1 = new Label("This is a MenuButton example "); 
  
        // create a menu 
        MenuButton m = new MenuButton("Select a Recipe"); 
  
        // create menuitems 
        MenuItem m1 = new MenuItem("menu item 1"); 
        MenuItem m2 = new MenuItem("menu item 2"); 
        MenuItem m3 = new MenuItem("menu item 3"); 
  
        // add menu items to menu 
        m.getItems().add(m1); 
        m.getItems().add(m2); 
        m.getItems().add(m3); 
  
        // label to display the selected menuitem 
        Label l2 = new Label("default menuitem selected"); 
  
        // create action event 
        EventHandler<ActionEvent> event1 = new EventHandler<ActionEvent>() { 
            public void handle(ActionEvent e) 
            { 
                l2.setText(((MenuItem)e.getSource()).getText() + " selected"); 
            } 
        }; 
  
        // add action events to the menuitems 
        m1.setOnAction(event1); 
        m3.setOnAction(event1); 
        m2.setOnAction(event1); 
  
        // create a tilepane 
        TilePane vb = new TilePane(l1); 
  
        vb.getChildren().add(m); 
        vb.getChildren().add(l2); 
  
        // create a scene 
        Scene sc = new Scene(vb, 200, 200); 
  
        // set the scene 
        s,setScene(sc); 
  
        s.show(); 
		
	}

}
