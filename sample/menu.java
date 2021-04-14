package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class menu {

    public Button accounting_button;
    public Button doctor_button;
    public Button nurse_button;
    public Button patient_button;

    public void onClickAccounting(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("MenuAccounting.fxml"));
        Stage primaryStage = (Stage) accounting_button.getScene().getWindow();
        primaryStage.setTitle("Hospital management system");
        primaryStage.setScene(new Scene(root, 1400, 700));
        primaryStage.show();
    }

    public void onClickDoctor(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("LoginDoctor.fxml"));
        Stage primaryStage = (Stage) doctor_button.getScene().getWindow();
        primaryStage.setTitle("Hospital management system");
        primaryStage.setScene(new Scene(root, 1400, 700));
        primaryStage.show();
    }

    public void onClickNurse(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("LoginNurse.fxml"));
        Stage primaryStage = (Stage) nurse_button.getScene().getWindow();
        primaryStage.setTitle("Hospital management system");
        primaryStage.setScene(new Scene(root, 1400, 700));
        primaryStage.show();
    }

    public void onClickPatient(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("LoginPatient.fxml"));
        Stage primaryStage = (Stage) patient_button.getScene().getWindow();
        primaryStage.setTitle("Hospital management system");
        primaryStage.setScene(new Scene(root, 1400, 700));
        primaryStage.show();
    }
}
