package edu.fpdual.mijavafx;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class JavafxSample extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {

		primaryStage.setTitle("Primary Application Stage");
		primaryStage.setScene(createScene("Primer Bienvenidos :D"));
		primaryStage.setX(200);
		primaryStage.show();

		Stage secundaryStage = new Stage();

		secundaryStage.setTitle("Secundary Application Stage");
		secundaryStage.setScene(createScene("Segundo Bienvenidos :D"));
		secundaryStage.setX(primaryStage.getX() + primaryStage.getWidth());
		secundaryStage.setY(primaryStage.getY());
		secundaryStage.show();

		Alert alert = new Alert(AlertType.ERROR);
		alert.setTitle("Test Connection");
		alert.setHeaderText("Results:");
		alert.setContentText("Connect to the database successfully!");
		alert.showAndWait();

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
