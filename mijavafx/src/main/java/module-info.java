module edu.fpdual.mijavafx.mijavafx {
    requires javafx.controls;
    requires javafx.fxml;

    opens edu.fpdual.mijavafx.mijavafx to javafx.fxml;
    exports edu.fpdual.mijavafx.mijavafx;
}
