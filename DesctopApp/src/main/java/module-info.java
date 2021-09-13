module com.example.desctopapp {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;
    requires java.sql;


    opens com.example.desctopapp to javafx.fxml;
    exports com.example.desctopapp;
}