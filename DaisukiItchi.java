//Jordan Ashe 

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.text.*;
import javafx.stage.Stage;
import javafx.scene.layout.*;
import javafx.scene.shape.*;
import javafx.scene.control.*;
import javafx.scene.Group;
import javafx.geometry.*;

public class DaisukiItchi extends Application {
	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) {   
		// Create a scene and place it in the stage
		
		Scene scene = new Scene(gui(),400,400);
		primaryStage.setTitle("ShowPolygon"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.setResizable(false);
		primaryStage.show(); // Display the stage
	}
	
	/**
	 * The main method is only needed for the IDE with limited
	 * JavaFX support. Not needed for running from the command line.
	 */
	public static void main(String[] args) {
		launch(args);
	}
	
	public Pane gui(){
		VBox maxPane = new VBox();
		GridPane gp = new GridPane();
		
		//the title
		Label lebell = new Label("DaisukiItchi: By Jordan Ashe");
		lebell.setFont(Font.font("Times New Roman",FontWeight.BOLD, 20));
		lebell.setTextFill(Color.BLACK);
		maxPane.getChildren().add(lebell);
		
		//dasukiitchi
		//gp.add(createDaisuki(),0,0);
		
		//Daisuki prompt
		Label tfP = new Label("Test");
		tfP.setFont(Font.font("Times New Roman", 20));
		tfP.setTextFill(Color.BLACK);
		maxPane.getChildren().add(tfP);
		
		//interactable buttons
		Button btn1 = new Button("Yes");
		Button btn2 = new Button("No");
		Button btn3 = new Button("S o r r y.");
		Button btn4 = new Button("Easy Peasy!");
		btn1.setPrefWidth(90);
		btn2.setPrefWidth(90);
		btn3.setPrefWidth(90);
		btn4.setPrefWidth(90);
		gp.add(btn1,0,0);
		gp.add(btn2,1,0);
		gp.add(btn3,0,1);
		gp.add(btn4,1,1);
		gp.setHalignment(btn1, HPos.CENTER);
		gp.setHalignment(btn2, HPos.CENTER);
		gp.setHalignment(btn3, HPos.CENTER);
		gp.setHalignment(btn4, HPos.CENTER);
		gp.setMaxWidth(200);
		
		maxPane.getChildren().add(gp);
		maxPane.setAlignment(Pos.TOP_CENTER);
		return maxPane;
	} 
}
