package com.example.zadnjavjezba;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.SQLException;

public class HelloApplication extends Application {
    @Override

    public void start(Stage stage) throws IOException, SQLException,ClassNotFoundException {

GeografijaDAO geo=GeografijaDAO.getInstance();

        FXMLLoader loader = new FXMLLoader(getClass().getResource("glavna.fxml")); //novi prozor
        loader.setController(new GlavnaController(geo));
        Parent root = loader.load();
        stage.setTitle("Test");
        stage.setScene(new Scene(root, 300, 275));
        stage.show();

        /*
     GeografijaDAO geo = GeografijaDAO.getInstance();
     Thread t=new Thread(()->{

         geo.izbrisiDrzave();

         Thread.yield();
     });
     Thread tt=new Thread(()->{
         geo.izbrisiGradove();
         Thread.yield();
     });

     t.start();
     tt.start();
        try{
            t.join();
            tt.join();
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }

     Thread t1=new Thread(()->{
         Drzava drzava=new Drzava(1,"UK",1);
         geo.dodajDrzavu(drzava);
         drzava.setId(2);
         drzava.setNaziv("BiH");
         drzava.setGlavniGrad(2);
         geo.dodajDrzavu(drzava);
         drzava.setId(3);
         drzava.setNaziv("Francuska");
         drzava.setGlavniGrad(3);
         geo.dodajDrzavu(drzava);
         Thread.yield();
     });

    Thread t2 = new Thread(()->{
        Grad grad = new Grad(1,"London",3000000,1);
        geo.dodajGrad(grad);
        geo.setId(2);
        geo.setNaziv("Sarajevo");
        geo.setBrojStanovnika(100000);
        geo.setDrzava(2);
        geo.dodajGrad(grad);
        geo.setId(3);
        geo.setNaziv("Pariz");
        geo.setBrojStanovnika(250000);
        geo.setDrzava(3);
        geo.dodajGrad(grad);
        Thread.yield();
    });
    t1.start();
    t2.start();
    try{
        t1.join();
        t2.join();
    }
    catch(InterruptedException e){
        e.printStackTrace();
    }




*/


    }

    public static void main(String[] args) {
        launch();
    }
}