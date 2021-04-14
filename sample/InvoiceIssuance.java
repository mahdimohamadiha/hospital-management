package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.*;
import java.util.Scanner;

public class InvoiceIssuance {
    public TextArea diagnosis;
    public TextArea surgery;
    public TextArea visiting_patient;
    public Button record_button;
    public TextField national_code;
    public TextField medicines;
    public TextField experiments;
    public TextField surgery2;
    public TextField days_of_hospitalization;
    public TextField total_expenses;
    public Button record2;
    public Button back;


    public void onClickRecord(ActionEvent actionEvent) throws FileNotFoundException {
        File file = new File("Doctor.txt");
        Scanner scan = new Scanner(file);
        while (scan.hasNextLine()) {
            if(national_code.getText().equals(scan.nextLine())) {
                diagnosis.setText(scan.nextLine());
                surgery.setText(scan.nextLine());
                break;
            }
        }
        File file2 = new File("Nurse.txt");
        Scanner scan2 = new Scanner(file2);
        while (scan2.hasNextLine()) {
            if(national_code.getText().equals(scan2.nextLine())) {
                visiting_patient.setText(scan2.nextLine());
                break;
            }
        }
    }

    public void onClickRecord2(ActionEvent actionEvent) throws IOException {
        FileWriter fw = new FileWriter("Bill.txt" , true);
        PrintWriter p2 = new PrintWriter(fw);
        p2.println(national_code.getText());
        p2.println(medicines.getText());
        p2.println(experiments.getText());
        p2.println(surgery2.getText());
        p2.println(days_of_hospitalization.getText());
        p2.println(total_expenses.getText());
        fw.close();
        Stage primaryStage = (Stage) record2.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("menu.fxml"));
        primaryStage.setTitle("Hospital management system");
        primaryStage.setScene(new Scene(root, 1400, 700));
        primaryStage.show();
    }

    public void onClickBack(ActionEvent actionEvent) throws IOException {
        Stage primaryStage = (Stage) back.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("MenuAccounting.fxml"));
        primaryStage.setTitle("Hospital management system");
        primaryStage.setScene(new Scene(root, 1400, 700));
        primaryStage.show();
    }
}
