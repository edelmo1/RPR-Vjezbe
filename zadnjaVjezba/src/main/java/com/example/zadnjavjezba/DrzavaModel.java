package com.example.zadnjavjezba;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class DrzavaModel {
    private ObservableList<Drzava> drzave= FXCollections.observableArrayList();
    public DrzavaModel(ObservableList<Drzava> g){drzave=g;}
    public DrzavaModel(){}
    public ObservableList<Drzava> getDrzave(){return drzave;}
    public void setDrzave(ObservableList<Drzava> g) {drzave=g;}
}
