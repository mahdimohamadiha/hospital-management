package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Staff {
    public Button back_button;
    public TextField user_name;
    public TextField password;
    public Label label;
    public Button login_button;
    String a;
    String b = "";

    public void onClickBack(ActionEvent actionEvent) throws IOException {
        Stage primaryStage = (Stage) back_button.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("menu.fxml"));
        primaryStage.setTitle("Hospital management system");
        primaryStage.setScene(new Scene(root, 1400, 700));
        primaryStage.show();
    }
}
