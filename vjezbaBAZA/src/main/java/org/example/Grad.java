package org.example;

public class Grad {
    private int id=0;
    private String naziv="";
    private int broj_stanovnika=0;
    private int drzava=0;

    public Grad(){}
    public Grad(int id,String naziv,int broj_stanovnika,int drzava){
        this.id=id;
        this.naziv=naziv;
        this.broj_stanovnika=broj_stanovnika;
        this.drzava=drzava;
    }
    public int getId(){return id;}
    public void setId(int id){this.id=id;}
    public String getNaziv(){return naziv;}
    public void setNaziv(String naziv){this.naziv=naziv;}
    public int getBrojStanovnika(){return broj_stanovnika;}
    public void setBrojStanovnika(int broj_stanovnika){this.broj_stanovnika=broj_stanovnika;}
    public int getDrzava(){return drzava;}
    public void setDrzava(int drzava){this.drzava=drzava;}
}
