module com.example.desctopapp {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;


    opens com.example.desctopapp to javafx.fxml;
    exports com.example.desctopapp;
}