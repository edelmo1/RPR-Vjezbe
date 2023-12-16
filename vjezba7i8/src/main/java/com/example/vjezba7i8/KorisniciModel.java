package com.example.vjezba7i8;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.ArrayList;

public class KorisniciModel {

 private ObservableList<Korisnik> korisnici= FXCollections.observableArrayList();
 private ObjectProperty trenutniKorisnik=new SimpleObjectProperty();

 public  KorisniciModel(){}

    public  KorisniciModel(ObservableList<Korisnik> korisnici,Object trenutniKorisnik){
     this.korisnici= FXCollections.observableArrayList(korisnici);
     this.trenutniKorisnik= new SimpleObjectProperty(trenutniKorisnik);
 }


 public ObservableList<Korisnik> getKorisnici(){
     return korisnici;
 }

 public void setKorisnici(ArrayList<Korisnik> korisnici){
     this.korisnici= FXCollections.observableArrayList(korisnici);
 }

 public ObjectProperty trenutniKorisnikProperty() {
     return trenutniKorisnik;
 }

    public Korisnik getTrenutniKorisnik() {
        return (Korisnik) trenutniKorisnik.get();
    }

 public void setTrenutniKorisnik(Korisnik trenutniKorisnik){
     this.trenutniKorisnik.set(trenutniKorisnik);
 }

 public void napuni(String ime, String prezime, String email, String korisnickoIme,String password){
     Korisnik k = new Korisnik(ime,prezime,email,korisnickoIme,password);
     korisnici.add(k);
 }





}
