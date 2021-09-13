package com.example.desctopapp;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button loginSignUpButton;

    @FXML
    private PasswordField password_field;

    @FXML
    private TextField login_field;

    @FXML
    private Button authSignInButton;

    @FXML
    void initialize() {

        authSignInButton.setOnAction(event ->{
            String loginText = login_field.getText().trim();
            String loginPassword = login_field.getText().trim();
                if(!loginText.equals("") && !loginPassword.equals("")){
                    loginUser(loginText,loginPassword);
                }else {
                    System.out.println("login is empty ");
                }

        });

        loginSignUpButton.setOnAction(event ->{
            loginSignUpButton.getScene().getWindow().hide();
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("signUp.fxml"));
            try {
                loader.load();
            } catch (IOException e) {
                e.printStackTrace();
            }
            Parent root = loader.getRoot();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.showAndWait();
        } );
    }

    private void loginUser(String loginText, String loginPassword) {

    }
}
