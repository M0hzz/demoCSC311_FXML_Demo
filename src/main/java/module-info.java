module com.example.democsc311_fxml_demo {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens com.example.democsc311_fxml_demo to javafx.fxml;
    exports com.example.democsc311_fxml_demo;
}