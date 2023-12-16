package com.example.vjezba7i8;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        KorisniciModel model = new KorisniciModel();
        model.napuni("Edi" , "Djelmo" , "edelmo1@etf.unsa.ba" , "edelmo1" , "ajegemini");
        model.napuni("Eldar" , "Buzadzic" , "ebuzadzic1@etf.unsa.ba","ebuzadzic1","ediide");
        model.napuni("Kerim" , "Kevric" , "kkevric1@etf.unsa.ba","kkevric1","kerimkerim");
        FXMLLoader loader = new FXMLLoader(getClass().getResource("hello-view.fxml"));
        loader.setController(new HelloController(model));
        Parent root = loader.load();
        primaryStage.setTitle("Korisnici");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}