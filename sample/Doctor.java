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

public class Doctor extends Staff{

    public TextArea diagnosis;
    public TextArea surgery;
    public Button record_button;
    public Button back_button2;
    public TextField national_code;
    public TextArea patients;

    public void setPatients (String text) {
        patients.setText(text);
    }

    public void onClickLoginDoctor(ActionEvent actionEvent) throws IOException {
        DoctorClass doctor1 = new DoctorClass (null , null ,  null ,  "111111", "1111");
        DoctorClass doctor2 = new DoctorClass(null , null ,  null ,"222222", "2222");
        DoctorClass doctor3 = new DoctorClass(null , null ,  null ,  "333333", "3333");
        if(user_name.getText().equals(doctor1.getUser_name_doctor()) && password.getText().equals(doctor1.getPassword_doctor())) {
            File file = new File("Choosing a doctor and nurse.txt");
            Scanner scan = new Scanner(file);
            while (scan.hasNextLine()) {
                if(user_name.getText().equals(scan.nextLine())) {
                    a = scan.next();
                    b += scan.next() + System.lineSeparator();
                }
            }
            Stage primaryStage = (Stage) login_button.getScene().getWindow();
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Doctor.fxml"));
            Parent root = loader.load();
            Doctor controller = loader.getController();
            controller.setPatients(b);
            primaryStage.setTitle("Hospital management system");
            primaryStage.setScene(new Scene(root, 1400, 700));
            primaryStage.show();
        }
        if(user_name.getText().equals(doctor2.getUser_name_doctor()) && password.getText().equals(doctor2.getPassword_doctor())) {
            File file = new File("Choosing a doctor and nurse.txt");
            Scanner scan = new Scanner(file);
            while (scan.hasNextLine()) {
                if(user_name.getText().equals(scan.nextLine())) {
                    a = scan.next();
                    b += scan.next() + System.lineSeparator();
                }
            }
            Stage primaryStage = (Stage) login_button.getScene().getWindow();
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Doctor.fxml"));
            Parent root = loader.load();
            Doctor controller = loader.getController();
            controller.setPatients(b);
            primaryStage.setTitle("Hospital management system");
            primaryStage.setScene(new Scene(root, 1400, 700));
            primaryStage.show();
        }
        if(user_name.getText().equals(doctor3.getUser_name_doctor()) && password.getText().equals(doctor3.getPassword_doctor())) {
            File file = new File("Choosing a doctor and nurse.txt");
            Scanner scan = new Scanner(file);
            while (scan.hasNextLine()) {
                if(user_name.getText().equals(scan.nextLine())) {
                    a = scan.next();
                    b += scan.next() + System.lineSeparator();
                }
            }
            Stage primaryStage = (Stage) login_button.getScene().getWindow();
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Doctor.fxml"));
            Parent root = loader.load();
            Doctor controller = loader.getController();
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
        DoctorClass doctor = new DoctorClass(diagnosis.getText() , surgery.getText() , national_code.getText() , null , null);
        FileWriter file = new FileWriter("Doctor.txt", true);
        PrintWriter pw = new PrintWriter(file);
        pw.println(doctor.getNational_code());
        pw.println(doctor.getDiagnosis());
        pw.println(doctor.getSurgery());
        file.close();
        Stage primaryStage = (Stage) record_button.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("menu.fxml"));
        primaryStage.setTitle("Hospital management system");
        primaryStage.setScene(new Scene(root, 1400, 700));
        primaryStage.show();

    }

    public void onClickBack2(ActionEvent actionEvent) throws IOException {
        Stage primaryStage = (Stage) back_button2.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("LoginDoctor.fxml"));
        primaryStage.setTitle("Hospital management system");
        primaryStage.setScene(new Scene(root, 1400, 700));
        primaryStage.show();
    }
}
