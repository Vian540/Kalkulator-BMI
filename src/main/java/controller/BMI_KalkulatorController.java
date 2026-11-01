package controller;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.text.Font;
import model.Kalkulator;

/**
 * FXML Controller class
 *
 * @author Favian R.H
 */
public class BMI_KalkulatorController {

    @FXML private TextField nameField;
    @FXML private TextField heightField;
    @FXML private TextField weightField;
    @FXML private Label hasilLabel;
    
    @FXML
    public void hitungBMI() {
        try{
            int tinggi = Integer.parseInt(heightField.getText().trim());
            int berat = Integer.parseInt(weightField.getText().trim());
            Kalkulator kalkulator;
            
            kalkulator = new Kalkulator(nameField.getText(), tinggi, berat);
            hasilLabel.setFont(new Font("Arial", 20));
            hasilLabel.setStyle("-fx-text-fill: #1b81e4;");
            hasilLabel.setText("Berhasil! BMI anda:" + Double.toString(kalkulator.hitungBMI()));
        }catch(NumberFormatException e){
            errorHandling("Berat atau Tinggi harus diisi(tidak boleh negatif dan  0)");
        }
        catch(IllegalArgumentException e){
            errorHandling(e.getMessage());
        }
    }    
    private void errorHandling(String message){
        hasilLabel.setStyle("-fx-text-fill: #b91c1c;");
        hasilLabel.setText(message);
    }
}
