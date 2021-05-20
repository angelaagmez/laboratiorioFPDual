package edu.fpdual.mijavafx.mijavafx;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class PrimaryController {

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }

    @FXML
    private void showAlert() throws IOException {
        Alert alerta = new Alert(AlertType.CONFIRMATION);
        alerta.setHeaderText("Confirma");
        alerta.show();
    }
}
