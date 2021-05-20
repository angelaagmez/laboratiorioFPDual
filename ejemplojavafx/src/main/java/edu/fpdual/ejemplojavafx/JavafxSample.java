package edu.fpdual.ejemplojavafx;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class JavafxSample extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		// Creamos el grupo padre y la escena
		Group root = new Group();
		Scene scene = new Scene(root,600,300);
		
		// Unimos los elementos de la escena con el stage
		primaryStage.setTitle("Sample Application");
		primaryStage.setScene(scene);
		
		// Para mostrar el stage
		primaryStage.show();
		
		// Hacemos click derecho, maven build y escribimos en goals 
		// clean javafx:run
		
		// Creamos un nodo tipo texto y le ponemos tamaño, y la ubicacion
		
		Text textoBienvenida = new Text("Bienvenidos :)");
		textoBienvenida.setFont(new Font(65));
		textoBienvenida.setX(50);
		textoBienvenida.setY(150);
		
		// Lo agregamos a un nodo padre
		// Obtenemos antes la lista de hijos
		
		ObservableList<Node> listaHijos = root.getChildren();
		
		listaHijos.add(textoBienvenida);
		
		
		// Agregamos color al fondo
		scene.setFill(Color.BROWN);
		
		// https://www.tutorialspoint.com/javafx/javafx_application.htm
		
		
		Line line = new Line(); 
		
		line.setStartX(100.0); 
	    line.setStartY(200.0); 
	    line.setEndX(500.0); 
	    line.setEndY(200.0); 
	    
	    listaHijos.add(line);
	    
	    
	    // Eventos
	    // https://o7planning.org/11009/javafx
	    // MouseEvent
	    // WindowEvent
	}
	
// Para lanzar el metodo desde la clase:
//	public static void main(String[] args) {
//		launch(args);
//	}

}
