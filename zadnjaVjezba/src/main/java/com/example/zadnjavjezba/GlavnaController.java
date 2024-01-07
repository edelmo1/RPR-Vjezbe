package com.example.zadnjavjezba;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import java.io.IOException;
import java.sql.SQLException;

import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

public class GlavnaController {

    @FXML
    private TableView tableViewGradovi;
    @FXML
    TableColumn id;
    @FXML
    TableColumn naziv ;
    @FXML
    TableColumn broj_stanovnika ;
    @FXML
    TableColumn drzava ;


    @FXML
    private Button dodajGrad;
    @FXML
    private Button dodajDrzavu;
    @FXML
    private Button izmijeniGrad;
    @FXML
    private Button obrisiGrad;
    public GeografijaDAO geo;

    public GlavnaController(GeografijaDAO geo) {
        this.geo = geo;
    }

    @FXML
    public void initialize(){
        try {

        ObservableList<Grad> lista = geo.getGradovi();

            id.setCellValueFactory(
                    new PropertyValueFactory<Grad,Integer>("Id")
            );
            naziv.setCellValueFactory(
                    new PropertyValueFactory<Grad,String>("Naziv")
            );
            broj_stanovnika.setCellValueFactory(
                    new PropertyValueFactory<Grad,Integer>("Broj_Stanovnika")
            );
            drzava.setCellValueFactory(
                    new PropertyValueFactory<Grad,Integer>("Drzava")
            );

        tableViewGradovi.setItems(lista);
geo.setTrenutniGrad(geo.getGradovi().get(0));
            tableViewGradovi.getSelectionModel().selectedItemProperty().addListener((obs,
                                                                                  oldGrad, newGrad) -> {
                geo.setTrenutniGrad((Grad)newGrad);
                tableViewGradovi.refresh();
            });

        }
catch(SQLException e){
            System.out.println("Greska u initialize");
            System.exit(0);
}
}
@FXML
    public void btnDodajGrad(ActionEvent actionEvent) throws IOException {

GeografijaDAO.getTrenutniGrad();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("grad.fxml")); //novi prozor
    loader.setController(new GradController(geo));
    Parent root = loader.load();

}

@FXML
    public void btnIzmijeniGrad(ActionEvent actionEvent)throws IOException{
    FXMLLoader loader = new FXMLLoader(getClass().getResource("grad.fxml")); //novi prozor
    loader.setController(new GradController(geo));
    Parent root = loader.load();
}
@FXML
    public void btnObrisiGrad(ActionEvent actionEvent) throws IOException , SQLException {

       Grad trenutni = GeografijaDAO.getTrenutniGrad();
       ObservableList<Grad> gr=geo.getGradovi();
       for(int i=0;i<gr.size();i++){
           if(gr.get(i).getId()==trenutni.getId()){
               gr.remove(trenutni);
               break;
           }
       }
       geo.setGradovi(gr);
}

@FXML
    public void btnDodajDrzavu(ActionEvent actionEvent)throws IOException{
    FXMLLoader loader = new FXMLLoader(getClass().getResource("drzava.fxml")); //novi prozor
    loader.setController(new GradController(geo));
    Parent root = loader.load();
}


}