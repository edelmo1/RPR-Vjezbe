package org.example;
import java.util.*;

public class KolekcijaImenaIPrezimena {

    private ArrayList<String> imena;
    private ArrayList<String> prezimena;

    public int getIndexNajduzegPara(){

   String najduziNaziv=(String) imena.get(0)+ (String) prezimena.get(0);
   int index=0;
   for(int i=0;i<imena.size();i++){

     String naziv= (String) imena.get(i)+ (String) prezimena.get(i);
     if(naziv.length() > najduziNaziv.length()){
         najduziNaziv=naziv;
                 index=i;
     }
   }
        return index;
    }

 public String getImeIPrezime(int i){
        return (String) imena.get(i) + (String) prezimena.get(i);
 }
}
