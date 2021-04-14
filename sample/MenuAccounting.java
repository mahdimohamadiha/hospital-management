package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class MenuAccounting {
    public Button CAFTP_button;
    public Button invoice_issuance_button;
    public Button back_button;

    public void onClickCAFTP(ActionEvent actionEvent) throws IOException {
        Stage primaryStage = (Stage) CAFTP_button.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("CreateAccount.fxml"));
        primaryStage.setTitle("Hospital management system");
        primaryStage.setScene(new Scene(root, 1400, 700));
        primaryStage.show();
    }


    public void onClickInvoiceIssuance(ActionEvent actionEvent) throws IOException {
        Stage primaryStage = (Stage) invoice_issuance_button.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("InvoiceIssuance.fxml"));
        primaryStage.setTitle("Hospital management system");
        primaryStage.setScene(new Scene(root, 1400, 700));
        primaryStage.show();
    }


    public void onClickBack(ActionEvent actionEvent) throws IOException {
        Stage primaryStage = (Stage) back_button.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("menu.fxml"));
        primaryStage.setTitle("Hospital management system");
        primaryStage.setScene(new Scene(root, 1400, 700));
        primaryStage.show();
    }
}
