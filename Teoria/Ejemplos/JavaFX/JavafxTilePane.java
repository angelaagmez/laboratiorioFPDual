package edu.fpdual.mijavafx;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.TilePane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class JavafxTilePane extends Application {

	@Override
	public void start(Stage stage) throws Exception {
		Button[] buttons = new Button[] { 
		         new Button("SunDay"), 
		         new Button("MonDay"), 
		         new Button("TuesDay"), 
		         new Button("WednesDay"), 
		         new Button("ThursDay"), 
		         new Button("FriDay"), 
		         new Button("SaturDay")  
		      };   
		      //Creating a Tile Pane 
		      TilePane tilePane = new TilePane();   
		       
		      //Setting the orientation for the Tile Pane 
		      tilePane.setOrientation(Orientation.HORIZONTAL); 
		       
		      //Setting the alignment for the Tile Pane 
		      tilePane.setTileAlignment(Pos.CENTER_LEFT); 
		       
		      //Setting the preferred columns for the Tile Pane 
		      tilePane.setPrefRows(4);  
		      tilePane.setPrefColumns(2);  
		      
		      //Retrieving the observable list of the Tile Pane 
		      ObservableList list = tilePane.getChildren(); 
		       
		      //Adding the array of buttons to the pane 
		      list.addAll(buttons);
			  
		      //Creating a scene object 
		      Scene scene = new Scene(tilePane);  
		      
		      //Setting title to the Stage 
		      stage.setTitle("Tile Pane Example"); 
		         
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
