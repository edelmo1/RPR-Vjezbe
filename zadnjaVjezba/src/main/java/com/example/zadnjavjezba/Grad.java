package com.example.zadnjavjezba;

import javafx.beans.property.Property;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class Grad {
    private SimpleIntegerProperty id=new SimpleIntegerProperty(0);
    private SimpleStringProperty naziv=new SimpleStringProperty("");
    private SimpleIntegerProperty broj_stanovnika=new SimpleIntegerProperty(0);
    private SimpleIntegerProperty drzava=new SimpleIntegerProperty(0);

    //private SimpleStringProperty Dnaziv=new SimpleStringProperty("");
    public Grad(){}
    public Grad(int id,String naziv,int broj_stanovnika,int drzava){
        this.id=new SimpleIntegerProperty(id);
        this.naziv=new SimpleStringProperty(naziv);
        this.broj_stanovnika=new SimpleIntegerProperty(broj_stanovnika);
        this.drzava=new SimpleIntegerProperty(drzava);
       // this.Dnaziv=new SimpleStringProperty(Dnaziv);
    }
    public int getId(){return id.get();}
    public SimpleIntegerProperty idProperty(){return id;}
    public void setId(int id){this.id.set(id);}
    public String getNaziv(){return naziv.get();}
    public SimpleStringProperty nazivProperty(){return naziv;}
    public void setNaziv(String naziv){this.naziv.set(naziv);}
    public int getBrojStanovnika(){return broj_stanovnika.get();}
    public SimpleIntegerProperty brojStanovnikaProperty() {return broj_stanovnika;}
    public void setBrojStanovnika(int broj_stanovnika){this.broj_stanovnika.set(broj_stanovnika);}
    public int getDrzava(){return drzava.get();}
    public SimpleIntegerProperty drzavaProperty(){return drzava;}
    public void setDrzava(int drzava){this.drzava.set(drzava);}

    //public String getDnaziv(){return Dnaziv.get();}
    //public SimpleStringProperty DnazivProperty(){return Dnaziv;}
    //public void setDnaziv(String naziv){this.Dnaziv.set(naziv);}
}
