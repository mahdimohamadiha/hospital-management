package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import java.io.*;
import java.util.ArrayList;

public class CreateAccount {
    public TextField national_code;
    public TextField password;
    public TextField first_name_and_last_name;
    public TextField age;
    public TextField gender;
    public TextField description_of_the_disease;
    public TextField records_of_specific_diseases;
    public Label success_text;
    public Button registration_button;
    public Button back_button;


    public void onClickRegistration(ActionEvent actionEvent) throws IOException {
        Accountants accountants = new Accountants(national_code.getText() , first_name_and_last_name.getText() , age.getText() , gender.getText() , description_of_the_disease.getText() , records_of_specific_diseases.getText());
        ArrayList<String> list = new ArrayList<>();
        list.add(accountants.getNational_code());
        String pw = String.valueOf(accountants.RandomPassword(8));
        list.add(pw);
        list.add(accountants.getFirst_name_and_last_name());
        list.add(accountants.getAge());
        list.add(accountants.getGender());
        list.add(accountants.getDescription_of_the_disease());
        list.add(accountants.getRecords_of_specific_diseases());
        password.setText(pw);
        FileWriter fileWriter = new FileWriter("Patient.txt" , true);
        PrintWriter p = new PrintWriter(fileWriter);
        p.println(list.get(0));
        p.println(list.get(1));
        p.println(list.get(2));
        p.println(list.get(3));
        p.println(list.get(4));
        p.println(list.get(5));
        p.println(list.get(6));
        p.close();
        success_text.setText("Rrgistration completed successfully");
        registration_button.setDisable(true);
        FileWriter fw = new FileWriter("Choosing a doctor and nurse.txt" , true);
        PrintWriter p2 = new PrintWriter(fw);
        p2.println(accountants.RandDoctor());
        p2.println(accountants.RandNurse());
        p2.println(accountants.getNational_code());
        fw.close();
    }

    public void onClickBack(ActionEvent actionEvent) throws IOException {
        Stage primaryStage = (Stage) back_button.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("MenuAccounting.fxml"));
        primaryStage.setTitle("Hospital management system");
        primaryStage.setScene(new Scene(root, 1400, 700));
        primaryStage.show();
    }
}
