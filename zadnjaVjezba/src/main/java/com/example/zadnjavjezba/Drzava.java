package com.example.zadnjavjezba;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class Drzava {

    private final SimpleIntegerProperty id=new SimpleIntegerProperty(0);
    private final SimpleStringProperty naziv=new SimpleStringProperty("");
    private final SimpleIntegerProperty glavni_grad=new SimpleIntegerProperty(0);

    public Drzava(){}
    public Drzava(int id,String naziv,int glavni_grad){
        this.id.set(id);
        this.naziv.set(naziv);
        this.glavni_grad.set(glavni_grad);
    }

    public int getId(){return id.get();}
    public SimpleIntegerProperty idProperty(){return id;}
    public void setId(int id){this.id.set(id);}
    public String getNaziv(){return naziv.get();}
    public SimpleStringProperty nazivProperty(){return naziv;}
    public void setNaziv(String naziv){this.naziv.set(naziv);}
    public int getGlavniGrad(){return glavni_grad.get();}
    public SimpleIntegerProperty glavniGradProperty(){return glavni_grad;}
    public void setGlavniGrad(int glavni_grad){
        this.glavni_grad.set(glavni_grad);
    }
}
