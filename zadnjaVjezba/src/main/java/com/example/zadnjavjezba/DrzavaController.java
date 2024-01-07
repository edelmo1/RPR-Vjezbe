package com.example.zadnjavjezba;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;

import java.sql.SQLException;

public class DrzavaController {
@FXML
    private TextField fieldNaziv;
@FXML
    private ChoiceBox choiceGrad;
@FXML
    private Button ok;
@FXML
    private Button cancel;
private final GeografijaDAO geo;
public DrzavaController(GeografijaDAO geo){
    this.geo=geo;
}

@FXML
public void initialize()throws SQLException{
    choiceGrad.setItems(geo.getGradovi());
}
@FXML
    public void btnCancel(ActionEvent actionEvent){
    System.exit(0);
}

@FXML
    public void btnOk(ActionEvent actionEvent) {
    try {
        int broj = geo.getDrzave().size();
        Drzava drzava = new Drzava(broj+1,(String)choiceGrad.getSelectionModel().getSelectedItem(),broj+1);
        ObservableList<Drzava> d = geo.getDrzave();
                d.add(drzava);
        geo.setDrzave(d);

    }
    catch(SQLException e){
        System.exit(0);
    }
}

}
