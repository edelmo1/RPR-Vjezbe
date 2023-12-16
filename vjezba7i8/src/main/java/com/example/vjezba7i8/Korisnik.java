package com.example.vjezba7i8;

import javafx.beans.property.SimpleStringProperty;

public class Korisnik {
    private SimpleStringProperty ime= new SimpleStringProperty("");
    private SimpleStringProperty prezime = new SimpleStringProperty("");
    private SimpleStringProperty email = new SimpleStringProperty("");
    private SimpleStringProperty korisnickoIme = new SimpleStringProperty("");
    private SimpleStringProperty password = new SimpleStringProperty("");

    public  Korisnik() {};

    public  Korisnik(String ime , String prezime , String email , String korisnickoIme,
                         String password){
        this.ime= new SimpleStringProperty(ime);
        this.prezime=new SimpleStringProperty(prezime);
        this.email=new SimpleStringProperty(email);
        this.korisnickoIme=new SimpleStringProperty(korisnickoIme);
        this.password=new SimpleStringProperty(password);
    }

    public SimpleStringProperty getImeProperty(){
        return ime;
    }

    public String getIme(){
        return ime.get();
    }

    public void setIme(String ime){
        this.ime.set(ime);
    }


    public SimpleStringProperty getPrezimeProperty(){
        return prezime;
    }

    public String getPrezime(){
        return prezime.get();
    }

    public void setPrezime(String prezime){
        this.prezime.set(prezime);
    }


    public SimpleStringProperty getEmailProperty(){
        return email;
    }

    public String getEmail(){
        return email.get();
    }

    public void setEmail(String email){
        this.email.set(email);
    }


    public SimpleStringProperty getKorisnickoImeProperty(){
        return korisnickoIme;
    }

    public String getKorisnickoIme(){
        return korisnickoIme.get();
    }

    public void setKorisnickoIme(String korisnickoIme){
        this.korisnickoIme.set(korisnickoIme);
    }


    public SimpleStringProperty getPasswordProperty(){
        return password;
    }

    public String getPassword(){
        return password.get();
    }

    public void setPassword(String password){
        this.password.set(password);
    }


}
