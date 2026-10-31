/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package main;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;

public class MainApp extends Application {
    
    @Override
    public void start(Stage primaryStage) throws Exception{
        FXMLLoader loader = new FXMLLoader(MainApp.class.getResource("/BMI_Kalkulator.fxml"));

        Scene scene = new Scene(loader.load());
        
        primaryStage.setTitle("BMI Kalkulator");
        primaryStage.setScene(scene);
        primaryStage.setMinWidth(466);
        primaryStage.setMinHeight(641);
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
    
}
