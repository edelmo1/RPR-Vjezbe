package org.example;
import java.util.* ;
public class KolekcijaPoruka {

private ArrayList<String> poruke;

public KolekcijaPoruka(ArrayList<Interfejs> kolekcija){

ArrayList<String> poruke=new ArrayList<String>();

for(int i=0;i<kolekcija.size();i++) {

poruke.add(kolekcija.get(i).predstavi());
}
}



public ArrayList<String> getPoruke() {
    return this.poruke;
}










}
