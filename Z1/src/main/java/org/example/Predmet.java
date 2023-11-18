package org.example;

import java.util.ArrayList;

public class Predmet implements Interfejs{

    private String naziv;
    private String opis;
    private ArrayList<Ocjena> listaOcjena;
    public Predmet(String naziv, String opis){
        this.naziv=naziv;
        this.opis=opis;
    }

    public void setNaziv(String naziv){
        this.naziv=naziv;
    }

    public void setOpis(String opis){
        this.opis=opis;
    }

    public String getNaziv(){
        return this.naziv;
    }
    public String getOpis(){
        return this.opis;
    }

@Override
    public String predstavi(){
        return naziv+" "+opis;
}

}
