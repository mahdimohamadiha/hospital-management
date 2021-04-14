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

public class LoginPatient {
    public TextField user_name_patient;
    public TextField password_patient;
    public Button login_button;
    public Button back_button;
    public Label label;

    public void onClickLoginpatient(ActionEvent actionEvent) throws IOException {
        File file = new File("patient.txt");
        Scanner scan = new Scanner(file);
        while (scan.hasNextLine()) {
            if(user_name_patient.getText().equals(scan.nextLine()))
                if(password_patient.getText().equals(scan.nextLine())){
                Stage primaryStage = (Stage) login_button.getScene().getWindow();
                FXMLLoader loader = new FXMLLoader(getClass().getResource("Patient.fxml"));
                Parent root = loader.load();
                Patient controller = loader.getController();
                controller.setNational_code(user_name_patient.getText());
                primaryStage.setTitle("Hospital management system");
                primaryStage.setScene(new Scene(root, 1400, 700));
                primaryStage.show();
            }
        }
        label.setText("Wrong username or password");
    }

    public void onClickBack(ActionEvent actionEvent) throws IOException {
        Stage primaryStage = (Stage) back_button.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("menu.fxml"));
        primaryStage.setTitle("Hospital management system");
        primaryStage.setScene(new Scene(root, 1400, 700));
        primaryStage.show();
    }
}
