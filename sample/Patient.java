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
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Patient {
    public TextField medicines;
    public TextField experiments;
    public TextField surgery2;
    public TextField days_of_hospitalization;
    public TextField total_expenses;
    public Button show;
    public Button back;
    public Label label;
    String national_code;

    public void setNational_code (String text) {
        national_code = text;
    }

    public void onClickShow(ActionEvent actionEvent) throws FileNotFoundException {
        File file = new File("Bill.txt");
        Scanner scan = new Scanner(file);
        while (scan.hasNextLine()) {
            if(national_code.equals(scan.nextLine())) {

                medicines.setText(scan.nextLine());
                experiments.setText(scan.nextLine());
                surgery2.setText(scan.nextLine());
                days_of_hospitalization.setText(scan.nextLine());
                total_expenses.setText(scan.nextLine());
                label.setText("Discharge");
                break;
            }
            else {
                label.setText("Being treated");
            }
        }
    }

    public void onClickBack(ActionEvent actionEvent) throws IOException {
        Stage primaryStage = (Stage) back.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("LoginPatient.fxml"));
        primaryStage.setTitle("Hospital management system");
        primaryStage.setScene(new Scene(root, 1400, 700));
        primaryStage.show();
    }
}
