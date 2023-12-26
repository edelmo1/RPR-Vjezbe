package org.example;

public class Drzava {

    private int id=0;
    private String naziv="";
    private int glavni_grad=0;

    public Drzava(){}
    public Drzava(int id,String naziv,int glavni_grad){
        this.id=id;
        this.naziv=naziv;
        this.glavni_grad=glavni_grad;
    }

    public int getId(){return id;}
    public void setId(int id){this.id=id;}
    public String getNaziv(){return naziv;}
    public void setNaziv(String naziv){this.naziv=naziv;}
    public int getGlavniGrad(){return glavni_grad;}
    public void setGlavniGrad(int glavni_grad){
        this.glavni_grad=glavni_grad;
    }
}
