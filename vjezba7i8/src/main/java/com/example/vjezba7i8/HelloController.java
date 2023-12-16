package com.example.vjezba7i8;

import javafx.beans.value.ChangeListener;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class HelloController {
    @FXML
    private Button dodaj;
    @FXML
    private Button kraj;
    @FXML
    private TextField ime;
    @FXML
    private TextField prezime;
    @FXML
    private TextField email;
    @FXML
    private TextField korisnickoIme;
    @FXML
    private PasswordField lozinka;
    private ListView<Korisnik> lista;
    private KorisniciModel model;

    public HelloController(KorisniciModel m) {
        model = m;
    }

    @FXML
    public void dodaj(ActionEvent actionEvent) {
       model.napuni(ime.getText(), prezime.getText(),email.getText(),korisnickoIme.getText(),lozinka.getText());
    }

    @FXML
    public void kraj(ActionEvent actionEvent) {
        System.exit(0);
    }

    @FXML
    public void initialize() {
        ime.textProperty().bindBidirectional(model.getTrenutniKorisnik().getImeProperty());

        lista.setItems(model.getKorisnici());
        lista.getSelectionModel().selectedItemProperty().addListener((obs, oldKorisnik, newKorisnik) -> {
            model.setTrenutniKorisnik(newKorisnik);
            lista.refresh();
        });



    }

    @Override
    public String toString() {
        return model.getTrenutniKorisnik().getIme() + model.getTrenutniKorisnik().getPrezime();
    }

}