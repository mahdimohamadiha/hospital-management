package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Nurse extends Staff{

    public TextArea visiting_patient;
    public Button back_button2;
    public Button record_button;
    public TextField national_code;
    public TextArea patients;

    public void setPatients (String text) {
        patients.setText(text);
    }

    public void onClickLoginNurse(ActionEvent actionEvent) throws IOException {
        NurseClass nurse1 = new NurseClass(null , null , "444444" , "4444");
        NurseClass nurse2 = new NurseClass(null , null , "555555" , "5555");
        NurseClass nurse3 = new NurseClass(null , null , "666666" , "6666");
        if(user_name.getText().equals(nurse1.getUser_name_nurse()) && password.getText().equals(nurse1.getPassword_nurse())) {
            File file = new File("Choosing a doctor and nurse.txt");
            Scanner scan = new Scanner(file);
            while (scan.hasNextLine()) {
                if(user_name.getText().equals(scan.nextLine())) {

                    b += scan.next() + System.lineSeparator();
                }
            }
            Stage primaryStage = (Stage) login_button.getScene().getWindow();
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Nurse.fxml"));
            Parent root = loader.load();
            Nurse controller = loader.getController();
            controller.setPatients(b);
            primaryStage.setTitle("Hospital management system");
            primaryStage.setScene(new Scene(root, 1400, 700));
            primaryStage.show();
        }
        if(user_name.getText().equals(nurse2.getUser_name_nurse()) && password.getText().equals(nurse2.getPassword_nurse())) {
            File file = new File("Choosing a doctor and nurse.txt");
            Scanner scan = new Scanner(file);
            while (scan.hasNextLine()) {
                if(user_name.getText().equals(scan.nextLine())) {

                    b += scan.next() + System.lineSeparator();
                }
            }
            Stage primaryStage = (Stage) login_button.getScene().getWindow();
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Nurse.fxml"));
            Parent root = loader.load();
            Nurse controller = loader.getController();
            controller.setPatients(b);
            primaryStage.setTitle("Hospital management system");
            primaryStage.setScene(new Scene(root, 1400, 700));
            primaryStage.show();
        }
        if(user_name.getText().equals(nurse3.getUser_name_nurse()) && password.getText().equals(nurse3.getPassword_nurse())) {
            File file = new File("Choosing a doctor and nurse.txt");
            Scanner scan = new Scanner(file);
            while (scan.hasNextLine()) {
                if(user_name.getText().equals(scan.nextLine())) {

                    b += scan.next() + System.lineSeparator();
                }
            }
            Stage primaryStage = (Stage) login_button.getScene().getWindow();
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Nurse.fxml"));
            Parent root = loader.load();
            Nurse controller = loader.getController();
            controller.setPatients(b);
            primaryStage.setTitle("Hospital management system");
            primaryStage.setScene(new Scene(root, 1400, 700));
            primaryStage.show();
        }
        else {
            label.setText("Wrong username or password");
        }
    }

    public void onClickLoginRecord(ActionEvent actionEvent) throws IOException {
        NurseClass nurse = new NurseClass(national_code.getText() , visiting_patient.getText() , null , null);
        FileWriter file = new FileWriter("Nurse.txt", true);
        PrintWriter pw = new PrintWriter(file);
        pw.println(nurse.getNational_code());
        pw.println(nurse.getVisiting_patient());
        file.close();
        Stage primaryStage = (Stage) record_button.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("menu.fxml"));
        primaryStage.setTitle("Hospital management system");
        primaryStage.setScene(new Scene(root, 1400, 700));
        primaryStage.show();
    }

    public void onClickBack2(ActionEvent actionEvent) throws IOException {
        Stage primaryStage = (Stage) back_button2.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("LoginNurse.fxml"));
        primaryStage.setTitle("Hospital management system");
        primaryStage.setScene(new Scene(root, 1400, 700));
        primaryStage.show();
    }
}
