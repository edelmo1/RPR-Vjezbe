package com.example.zadnjavjezba;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class GradModel {
    private ObservableList<Grad> gradovi= FXCollections.observableArrayList();
    public GradModel(ObservableList<Grad> g){gradovi=g;}
    public GradModel(){}
    public ObservableList<Grad> getGradovi(){return gradovi;}
    public void setGradovi(ObservableList<Grad> g) {gradovi=g;}
}
