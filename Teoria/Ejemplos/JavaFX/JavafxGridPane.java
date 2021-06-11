package edu.fpdual.mijavafx;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class JavafxGridPane extends Application {

	@Override
	public void start(Stage stage) throws Exception {
		//creating label email 
	      Text text1 = new Text("Email");       
	      
	      //creating label password 
	      Text text2 = new Text("Password"); 
		  
	      //Creating Text Filed for email        
	      TextField textField1 = new TextField();       
	      
	      //Creating Text Filed for password        
	      TextField textField2 = new TextField();  
	       
	      //Creating Buttons 
	      Button button1 = new Button("Submit"); 
	      Button button2 = new Button("Clear");  
	      
	      //Creating a Grid Pane 
	      GridPane gridPane = new GridPane();    
	      
	      //Setting size for the pane  
	      gridPane.setMinSize(400, 200); 
	       
	      //Setting the padding  
	      gridPane.setPadding(new Insets(10, 10, 10, 10)); 
	      
	      //Setting the vertical and horizontal gaps between the columns 
	      gridPane.setVgap(5); 
	      gridPane.setHgap(5);       
	      
	      //Setting the Grid alignment 
	      gridPane.setAlignment(Pos.CENTER); 
	       
	      //Arranging all the nodes in the grid 
	      gridPane.add(text1, 0, 0); 
	      gridPane.add(textField1, 1, 0); 
	      gridPane.add(text2, 0, 1);       
	      gridPane.add(textField2, 1, 1); 
	      gridPane.add(button1, 0, 2); 
	      gridPane.add(button2, 1, 2);  
	      
	      //Creating a scene object 
	      Scene scene = new Scene(gridPane);  
	      
	      //Setting title to the Stage 
	      stage.setTitle("Grid Pane Example"); 
	         
	      //Adding scene to the stage 
	      stage.setScene(scene); 
	         
	      //Displaying the contents of the stage 
	      stage.show(); 

	}

	private Scene createScene(String texto) {
		Text textoBienvenida = new Text(texto);
		textoBienvenida.setFont(new Font(65));
		textoBienvenida.setX(50);
		textoBienvenida.setY(150);

		Group root = new Group();
		ObservableList<Node> listaHijos = root.getChildren();
		listaHijos.add(textoBienvenida);

		Scene scene = new Scene(root, 600, 300);
		scene.setFill(Color.rgb(165, 80, 65, 1));
		return scene;
	}

	public static void main(String[] args) {
		launch(args);
	}

}
