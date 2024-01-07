package com.example.zadnjavjezba;

import javafx.beans.property.Property;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import java.sql.*;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import static java.lang.Integer.parseInt;

public class GradController {

    @FXML
    private TextField fieldNaziv;
    @FXML
    private ChoiceBox choiceDrzava;
    @FXML
    private Button ok;
    @FXML
    private Button cancel;
@FXML
    private TextField fieldBrojStanovnika;
   private final GeografijaDAO geo;

   public GradController(GeografijaDAO geo){this.geo=geo;}

    @FXML
private void initialize() throws SQLException, ClassNotFoundException{
       if(GeografijaDAO.getTrenutniGrad()!=null) {
           fieldNaziv.textProperty().bindBidirectional(GeografijaDAO.getTrenutniGrad().nazivProperty());
           fieldBrojStanovnika.textProperty().bindBidirectional((Property) GeografijaDAO.getTrenutniGrad().brojStanovnikaProperty());
           choiceDrzava.itemsProperty().bindBidirectional(GeografijaDAO.getTrenutniGrad().drzavaProperty());
           choiceDrzava.setItems(geo.getDrzave());
       }
}//??

    @FXML
public void btnOK(ActionEvent actionEvent ) throws ClassNotFoundException {
       try {
           GeografijaDAO geo = GeografijaDAO.getInstance();
           //prvo trebamo provjeriti da li je u pitanju izmjena ili dodavanje grada tako sto cemo provjeriti da li postoji grad
           //istog imena
           PreparedStatement p = geo.getConnection().prepareStatement("SELECT id FROM Grad WHERE naziv = ?");
           p.setString(1, fieldNaziv.getText());
           ResultSet rez = p.executeQuery();
           if (!rez.next()) { //dodavanje novog grada
               int broj = geo.getGradovi().size();
               Grad grad = new Grad(broj + 1, fieldNaziv.getText(), parseInt(fieldBrojStanovnika.getText()), broj+1);
               ObservableList<Grad> gr=geo.getGradovi();
                       gr.add(grad);
               geo.setGradovi(gr);

           }
           else {//izmjena grada
               Grad grad = new Grad(rez.getInt(1), fieldNaziv.getText(), parseInt(fieldBrojStanovnika.getText()), rez.getInt(4));
               ObservableList<Grad> gr=geo.getGradovi();
               for(int i=0;i<gr.size();i++){
                   if(gr.get(i).getId()==grad.getId()) {
                       gr.remove(gr.get(i));
                   break;
                   }
               }
               gr.add(grad);
               geo.setGradovi(gr);
           }
       }
       catch(SQLException e){
           System.out.println("Greska u btnOK grad controllera!");
           System.exit(0);
       }
    }
    @FXML
    public void btnCancel(ActionEvent actionEvent){
    System.exit(0);
    }
}
